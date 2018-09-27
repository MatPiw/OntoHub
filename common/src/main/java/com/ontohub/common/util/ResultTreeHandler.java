/*
 * OntoHub.  Copyright (C) 2018  - Mateusz Piwecki
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.ontohub.common.util;

import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.Relationship;
import com.ontohub.common.exception.NoSynsetSelectedException;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;


public class ResultTreeHandler<T extends KnowledgeRepresentation, R> {

	//todo delete it
	Relationship relation = null;

	public TreeItem<T> insertAsParent(TreeRepresentation<T, R> tree, TreeItem<T> selected, T toInsert) throws NoSynsetSelectedException {
		TreeItem<T> result = new TreeItem<>(toInsert);
		if (selected != null) {
			TreeItem<T> parent = selected.getParent();
			if (parent != null && parent.getValue() != null) {
				ObservableList<TreeItem<T>> children = parent.getChildren();
				children.add(result);
				children.remove(selected);
				parent.getValue().addRelation(
					parent.getValue(),
					toInsert,
					tree.getLeadingRelation());

				result = parent;
			} else {
				toInsert.addRelation(
					toInsert,
					selected.getValue(),
					tree.getLeadingRelation()
				);
			}
			result.getChildren().add(selected);
			result.setExpanded(true);
		} else {
			if (tree.hasRoot()) {
				throw new NoSynsetSelectedException();
			}
		}
		return result;
	}

	public TreeItem<T> insertAsChild(TreeRepresentation<T, R> tree, TreeItem<T> selected, T toInsert) throws NoSynsetSelectedException {
		TreeItem<T> result = tree.getTreeRoot();
		TreeItem<T> child = new TreeItem<>(toInsert);

		if (selected != null) {
			selected.getChildren().add(child);
			selected.getValue().addRelation(
				selected.getValue(),
				toInsert,
				tree.getLeadingRelation());
		} else {
			if (!tree.hasRoot()) {
				result = child;
				tree.setTreeRoot(result);
			} else {
				throw new NoSynsetSelectedException();
			}
		}
		return result;
	}
}

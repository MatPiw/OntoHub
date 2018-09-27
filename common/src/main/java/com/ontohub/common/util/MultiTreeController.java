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
import javafx.scene.control.TreeItem;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
public class MultiTreeController<T extends KnowledgeRepresentation, R> {

	private int currentTreeIndex;

	private List<TreeRepresentation<T,R>> trees;

	public MultiTreeController() {
		this.trees = new ArrayList<>();
		//add a dummy item to avoid out of bounds
		addTree(new TreeRepresentation<>());
	}

	public TreeRepresentation<T,R> next() {
		TreeRepresentation<T,R> result;
		currentTreeIndex++;
		if (treesCount() <= currentTreeIndex) {
			result = new TreeRepresentation<>();
			addTree(result);
			log.info("Created new tree at index {}", currentTreeIndex);
		} else {
			result = trees.get(currentTreeIndex);
		}
		return result;
	}

	public TreeRepresentation<T,R> previous() {
		TreeRepresentation<T,R> result;
		currentTreeIndex--;
		if (currentTreeIndex < 0) {
			currentTreeIndex = 0;
		}
		result = trees.get(currentTreeIndex);
		return result;
	}

	public TreeRepresentation<T,R> current() {
		return trees.get(currentTreeIndex);
	}

	public void setTreeRoot(TreeItem<T> newRoot) {
		current().setTreeRoot(newRoot);
	}

	public void setTreeRoot(TreeItem<T> newRoot, int index) {
		trees.get(index).setTreeRoot(newRoot);
	}

	public void setLeadingRelation(R leadingRelation) {
		current().setLeadingRelation(leadingRelation);
	}

	public void setLeadingRelation(R leadingRelation, int index) {
		trees.get(index).setLeadingRelation(leadingRelation);
	}

	public void addTree(TreeRepresentation<T,R> tree) {
		trees.add(tree);
	}

	public int treesCount() {
		return trees.size();
	}
}

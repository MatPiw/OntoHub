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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TreeRepresentation<T extends KnowledgeRepresentation, R> {

	private TreeItem<T> treeRoot;

	private R leadingRelation;

	public boolean hasRoot() {
		return treeRoot != null
			&& treeRoot.getValue() != null;
	}

	public boolean hasLeadingRelation() {
		return leadingRelation != null;
	}
}

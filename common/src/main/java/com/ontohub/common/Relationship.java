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

package com.ontohub.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Relationship<T extends KnowledgeRepresentation, R> {

	protected T parent;

	protected T child;

	protected R relation;

	public abstract String getRelationId();

	public abstract String getRelationName();

	public abstract String getRelationType();

	public boolean isRelationParent(T synset) {
		return synset == this.parent;
	}

	public boolean isRelationChild(T synset) {
		return synset == this.child;
	}

	public boolean isInRelation(T synset) {
		return isRelationParent(synset) || isRelationChild(synset);
	}

}

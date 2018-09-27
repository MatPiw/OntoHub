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

package com.getty.model;

import com.getty.model.generated.getty.children.ChildType;
import com.ontohub.common.Relationship;

public class GettyRelation extends Relationship<GettySynset, ChildType> {

	public GettyRelation(GettySynset parent, GettySynset child, ChildType relation) {
		super(parent, child, relation);
	}

	@Override
	public String getRelationId() {
		return null;
	}

	@Override
	public String getRelationName() {
		return null;
	}

	@Override
	public String getRelationType() {
		return null;
	}
}

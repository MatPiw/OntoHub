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

package com.or.model.converter;

import com.or.model.generated.ontology.Relation;
import javafx.util.StringConverter;

public class RelationStringConverter extends StringConverter<Relation> {

	@Override
	public String toString(Relation object) {
		return object.getNAME();
	}

	@Override
	public Relation fromString(String string) {
		return null;
	}
}

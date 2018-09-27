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

import java.util.List;
import java.util.Map;

public interface KnowledgeRepresentation<T extends Relationship> {
	//interface that collects all knowledge representation formats present in system.
	//Generic type is for relations with other synsets - every synset holds information about its all relations.

	//gets Map of key-value properties of synset
	//does not contain relations
	Map<String, String> getProperties();

	//saves synset properties from properties map. Used when merging synsets
	KnowledgeRepresentation synsetFromProperties(Map<String, String> properties);

	//get all synset relations
	List<T> getRelationships();

	//add relation to synset (custom relation handling)
	void addRelation(T relationship);

	void addRelation(KnowledgeRepresentation parent, KnowledgeRepresentation child, Object leadingRelation);

	//method to fully describe synset -
	//toString is used to define short title in tree views
	String describe();
}

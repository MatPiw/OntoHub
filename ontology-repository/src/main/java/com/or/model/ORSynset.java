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

package com.or.model;

import com.google.common.collect.ImmutableMap;
import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.Relationship;
import com.or.model.generated.ontology.Ilr;
import com.or.model.generated.ontology.Relation;
import com.or.model.generated.ontology.Synset;
import com.or.model.generated.ontology.Tag;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Getter
public class ORSynset implements KnowledgeRepresentation<ORRelation> {

	private Synset synset;

	private List<ORRelation> relationships;

	public ORSynset(Synset synset) {
		this.synset = synset;
		this.relationships = new ArrayList<>();
	}

	@Override
	public Map<String, String> getProperties() {
		return ImmutableMap.of(
			"ID", Optional.ofNullable(synset.getID())
				.orElse(""),
			"Type", Optional.ofNullable(synset.getTYPE())
				.orElse(""),
			"Name", Optional.ofNullable(synset.getTAG())
				.map(Tag::getNAME)
				.orElse(""),
			"Sense", Optional.ofNullable(synset.getTAG())
				.map(Tag::getSENSE)
				.map(String::valueOf)
				.orElse("")
		);
	}

	@Override
	public ORSynset synsetFromProperties(Map<String, String> properties) {
		synset = new Synset();
		synset.setID(properties.get("ID"));
		synset.setTYPE(properties.get("Type"));
		Tag tag = new Tag();
		tag.setNAME(properties.get("Name"));
		tag.setSENSE(Integer.valueOf(properties.get("Sense")));
		synset.setTAG(tag);
		return this;
	}

	@Override
	public List<ORRelation> getRelationships() {
		return relationships;
	}

	@Override
	public void addRelation(ORRelation relationship) {
		relationships.add(relationship);
	}

	@Override
	public void addRelation(KnowledgeRepresentation parent, KnowledgeRepresentation child, Object leadingRelation) {
		if (leadingRelation instanceof Relation) {
			addRelation(new ORRelation(
				(ORSynset) parent,
				(ORSynset) child,
				(Relation) leadingRelation)
			);
		}
	}

	@Override
	public String describe() {
		return "ID: " + synset.getID() + "\n" +
		synset.getTAG().getNAME() + "(" + synset.getTAG().getSENSE() + ")\n" +
		synset.getTYPE();
	}

	@Override
	public String toString() {
		return synset.getTAG().getNAME();
	}
}

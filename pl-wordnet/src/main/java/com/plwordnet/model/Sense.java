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

package com.plwordnet.model;

import com.google.common.collect.ImmutableMap;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.Relationship;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Sense implements KnowledgeRepresentation<PLWordnetRelation> {

	@SerializedName("id")
	@Expose
	private String id;

	@SerializedName("lemma")
	@Expose
	private String lemma;

	@SerializedName("sense_index")
	@Expose
	private int senseIndex;

	@SerializedName("language")
	@Expose
	private String language;

	@SerializedName("project")
	@Expose
	private int project;

	@SerializedName("domain_id")
	@Expose
	private int domainId;

	@SerializedName("part_of_speech")
	@Expose
	private String partOfSpeech;

	@SerializedName("definition")
	@Expose
	private String definition;

	@SerializedName("synset_id")
	@Expose
	private String synsetId;

	@SerializedName("synset_external_id")
	@Expose
	private int synsetExternalId;

	@SerializedName("lexicon")
	@Expose
	private String lexicon;

	@SerializedName("homographs")
	@Expose
	private List<Sense> homographs = null;

	@SerializedName("examples")
	@Expose
	private List<Object> examples = null;

	@SerializedName("outgoing")
	@Expose
	private List<Relation> outgoing = null;

	@SerializedName("incoming")
	@Expose
	private List<Relation> incoming = null;

	private String prefix = "";

	private List<PLWordnetRelation> relations = new ArrayList<>();

	@Override
	public Map<String, String> getProperties() {
		return ImmutableMap.of(
			"ID", id,
			"Lemma", lemma,
			"Definition", definition,
			"Sense index", String.valueOf(senseIndex)
		);
	}

	@Override
	public Sense synsetFromProperties(Map<String, String> properties) {
		//do nothing - it is not an output format
		return null;
	}

	@Override
	public List<PLWordnetRelation> getRelationships() {
		return relations;
	}

	@Override
	public void addRelation(PLWordnetRelation relationship) {
		relations.add(relationship);
	}

	@Override
	public void addRelation(KnowledgeRepresentation parent, KnowledgeRepresentation child, Object leadingRelation) {
		relations.add(new PLWordnetRelation(
			(Sense) parent,
			(Sense) child,
			(Relation) leadingRelation
		));
	}

	@Override
	public String describe() {
		return "Synset ID: " + id +
			"\n" + lemma +
			" (" + senseIndex + ") - " + definition +
			"\nPart of speech: " + partOfSpeech +
			"\nLanguage: " + language;
	}

	@Override
	public String toString() {
		String result = lemma;
		if (!prefix.equals("")) {
			result = "[" + prefix + "] " + lemma;
		}
		return result;
	}
}

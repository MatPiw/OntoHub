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

import com.getty.model.generated.getty.children.ChildRelationships;
import com.getty.model.generated.getty.children.ChildType;
import com.getty.model.generated.getty.children.Vocabulary;
import com.getty.model.generated.getty.subject.SubjectVocabulary;
import com.google.common.collect.ImmutableMap;
import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.Relationship;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
public class GettySynset  implements KnowledgeRepresentation<GettyRelation> {

	private SubjectVocabulary subject;

	private Vocabulary children;

	private List<GettyRelation> relationships = new ArrayList<>();

	public GettySynset(SubjectVocabulary subject, Vocabulary children) {
		this.subject = subject;
		this.children = children;
	}

	public List<ChildType> getPreferredChildren() {
		return Optional.ofNullable(
			children.getSubject().getChildRelationships())
			.map(ChildRelationships::getPreferredChild)
			.orElse(Collections.emptyList());
	}

	public List<ChildType> getNonPreferredChildren() {
		return Optional.ofNullable(
			children.getSubject().getChildRelationships())
			.map(ChildRelationships::getNonPreferredChild)
			.orElse(Collections.emptyList());
	}

	@Override
	public Map<String, String> getProperties() {
		return ImmutableMap.of(
			"Subject ID", getSubjectId(),
			"Preferred term", getPreferredTerm(),
			"Record type", getType()
		);
	}

	@Override
	public KnowledgeRepresentation synsetFromProperties(Map<String, String> properties) {
		//do nothing - it is not an output format
		return null;
	}

	@Override
	public void addRelation(GettyRelation relationship) {
		relationships.add(relationship);
	}

	@Override
	public void addRelation(KnowledgeRepresentation parent, KnowledgeRepresentation child, Object leadingRelation) {
		relationships.add(new GettyRelation(
			(GettySynset) parent,
			(GettySynset) child,
			(ChildType) leadingRelation
		));
	}

	@Override
	public String describe() {
		StringBuilder result = new StringBuilder();
		subject.getSubject().forEach(subject -> {
			result.append(subject.getTerms().getPreferredTerm().getTermText())
				.append("\nSubjectId: ")
				.append(subject.getSubjectID())
				.append("\nRecord type: ")
				.append(subject.getRecordType())
				.append("\n\nDescriptive notes:\n");
			if (subject.getDescriptiveNotes() != null) {
				subject.getDescriptiveNotes()
					//TODO null-check
					.getDescriptiveNote().forEach(note -> {
					result.append(note.getNoteLanguage())
						.append(":\n")
						.append(note.getNoteText())
						.append("\n\n");
				});
			}
		});
		return result.toString();
	}

	@Override
	public String toString() {
		return getPreferredTerm();
	}

	public String getSubjectId() {
		return subject.getSubject()
			.get(0)
			.getSubjectID()
			.toString();
	}

	public String getPreferredTerm() {
		return subject.getSubject()
			.get(0)
			.getTerms()
			.getPreferredTerm()
			.getTermText();
	}

	public String getType() {
		return subject.getSubject()
			.get(0)
			.getRecordType();
	}
}

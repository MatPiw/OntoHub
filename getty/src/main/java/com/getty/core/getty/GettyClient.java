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

package com.getty.core.getty;

import com.getty.model.GettySynset;
import com.getty.model.generated.getty.children.ObjectFactory;
import com.getty.model.generated.getty.children.Vocabulary;
import com.getty.model.generated.getty.subject.SubjectVocabulary;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public final class GettyClient {

	private GettyClient() {
		//don't allow creating instances
	}

	private static ObjectFactory childrenFactory = new ObjectFactory();

	private static com.getty.model.generated.getty.subject.ObjectFactory subjectFactory
		= new com.getty.model.generated.getty.subject.ObjectFactory();

	public static GettySynset getSynset(String subjectId) {
		Vocabulary children = getChildren(subjectId);
		SubjectVocabulary subject = getSubject(subjectId);
		GettySynset result = new GettySynset(subject, children);
		log.info("Downloaded resource {}", result);
		return result;
	}

	private static Vocabulary getChildren(String subjectId) {
		Vocabulary result = childrenFactory.createVocabulary();
		try {
			result = GettyConverter.getChildrenFromXml(
				GettyDataSource.getChildrenResponse(subjectId));
		} catch (IOException e) {
			log.error("Could not fetch children data from Getty", e);
		}
		return result;
	}

	private static SubjectVocabulary getSubject(String subjectId) {
		SubjectVocabulary result = subjectFactory.createSubjectVocabulary();
		try {
			result = GettyConverter.getSubjectFromXml(
					GettyDataSource.getSubjectResponse(subjectId));
		} catch (IOException e) {
			log.error("Could not fetch subject data from Getty", e);
		}
		return result;
	}
}

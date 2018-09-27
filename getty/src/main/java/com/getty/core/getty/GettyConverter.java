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

import com.getty.model.generated.getty.children.ObjectFactory;
import com.getty.model.generated.getty.children.Vocabulary;
import com.getty.model.generated.getty.subject.SubjectVocabulary;

import javax.xml.bind.JAXB;
import java.io.InputStream;

public class GettyConverter {

	private static ObjectFactory factory;

	public static Vocabulary getChildrenFromXml(InputStream response) {
		return JAXB.unmarshal(response, Vocabulary.class);
	}

	public static SubjectVocabulary getSubjectFromXml(InputStream response) {
		return JAXB.unmarshal(response, SubjectVocabulary.class);
	}
}

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

package com.ontohub.synset;

import com.getty.model.GettySynset;
import com.getty.model.generated.getty.children.Vocabulary;
import com.getty.model.generated.getty.subject.SubjectVocabulary;
import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.model.InputFormatEnum;
import com.ontohub.common.model.OutputFormatEnum;
import com.or.model.ORSynset;
import com.or.model.generated.ontology.Synset;
import com.plwordnet.model.Sense;

public class SynsetFactory {

	public KnowledgeRepresentation getSynsetForFormat(InputFormatEnum format) throws SynsetNotFoundException {
		switch (format) {
			case GETTY_AAT:
				return new GettySynset(new SubjectVocabulary(), new Vocabulary());
			case PL_WORDNET:
				return new Sense();
			default:
				throw new SynsetNotFoundException(format);
		}
	}

	public KnowledgeRepresentation getSynsetForFormat(OutputFormatEnum format) throws SynsetNotFoundException {
		switch(format) {
			case ONTOLOGY_REPOSITORY:
				return new ORSynset(new Synset());
			default:
				throw new SynsetNotFoundException(format);
		}
	}
}

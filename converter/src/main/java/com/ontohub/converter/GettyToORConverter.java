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

package com.ontohub.converter;

import com.getty.model.GettySynset;
import com.ontohub.common.FormatConverter;
import com.ontohub.common.model.InputFormatEnum;
import com.ontohub.common.model.OutputFormatEnum;
import com.or.model.ORSynset;
import com.or.model.generated.ontology.Synset;
import com.or.model.generated.ontology.Tag;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GettyToORConverter implements FormatConverter<GettySynset, ORSynset> {

	@Override
	public InputFormatEnum getInputFormat() {
		return InputFormatEnum.GETTY_AAT;
	}

	@Override
	public OutputFormatEnum getOutputFormat() {
		return OutputFormatEnum.ONTOLOGY_REPOSITORY;
	}

	@Override
	public ORSynset apply(GettySynset gettySynset) {
		Synset result = new Synset();
		Tag tag = new Tag();
		result.setID(gettySynset.getSubjectId());
		result.setTYPE(gettySynset.getType());
		tag.setNAME(gettySynset.getPreferredTerm());
		tag.setSENSE(1);
		result.setTAG(tag);
		return new ORSynset(result);
	}
}

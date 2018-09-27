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

package com.ontohub.gui.controller.dialog;

import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.Relationship;
import com.ontohub.common.model.OutputFormatEnum;
import com.ontohub.synset.SynsetNotFoundException;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MergeItemsDialogController extends EditSynsetDialogController{

	@FXML
	private VBox leftSynsetBox;

	@FXML
	private VBox rightSynsetBox;

	@FXML
	public void initialize() {
		super.initialize();
		log.info("Merge items dialog opened.");
	}

	public void setValues(KnowledgeRepresentation<Relationship> synset1, KnowledgeRepresentation<Relationship> synset2, OutputFormatEnum outputFormat) {
		generateOutput(synset1, leftSynsetBox);
		generateOutput(synset2, rightSynsetBox);
		try {
			resultSynset = synsetFactory.getSynsetForFormat(outputFormat);
			generateOutput(resultSynset, resultSynsetBox);
		} catch (SynsetNotFoundException e) {
			log.error("Could not find synset representation for format {}", outputFormat);
		}
	}
}

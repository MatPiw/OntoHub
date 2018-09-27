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

import com.google.common.collect.Maps;
import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.Relationship;
import com.ontohub.common.model.OutputFormatEnum;
import com.ontohub.gui.view.PropertyBox;
import com.ontohub.synset.SynsetFactory;
import com.ontohub.synset.SynsetNotFoundException;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

@Slf4j
public class EditSynsetDialogController {

	@FXML
	protected VBox resultSynsetBox;

	@FXML
	private ToggleButton saveAsCopyToggle;

	protected KnowledgeRepresentation<Relationship> resultSynset;

	protected SynsetFactory synsetFactory;

	@Setter
	private OutputFormatEnum format;

	@FXML
	public void initialize() {
		synsetFactory = new SynsetFactory();
		log.info("Edit Synset Dialog opened.");
	}

	public KnowledgeRepresentation saveChanges() {
		KnowledgeRepresentation result;

		Map<String, String> properties = Maps.newHashMap();
		resultSynsetBox.getChildren().stream()
			.filter(node -> node instanceof PropertyBox)
			.map(node -> (PropertyBox) node)
			.forEach(propertyBox -> properties.put(
				propertyBox.getPropertyName(),
				propertyBox.getPropertyValue()
			));

		if (shouldSaveAsCopy()) {
			try {
				result = synsetFactory.getSynsetForFormat(format)
					.synsetFromProperties(properties);
			} catch (SynsetNotFoundException e) {
				result = resultSynset.synsetFromProperties(properties);
			}
		} else {
			result = resultSynset.synsetFromProperties(properties);
		}
		return result;
	}

	protected static void generateOutput(KnowledgeRepresentation<Relationship> synset, VBox targetBox) {
		List<Node> children = targetBox.getChildren();
		synset.getProperties().forEach((key, value) ->
			children.add(new PropertyBox(key, value)));
	}

	public void setResultSynset(KnowledgeRepresentation resultSynset) {
		this.resultSynset = resultSynset;
		generateOutput(resultSynset, resultSynsetBox);
	}

	private boolean shouldSaveAsCopy() {
		return saveAsCopyToggle != null && saveAsCopyToggle.isSelected();
	}
}

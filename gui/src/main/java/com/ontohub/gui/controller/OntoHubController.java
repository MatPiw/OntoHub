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

package com.ontohub.gui.controller;

import com.ontohub.common.FormatConverter;
import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.MultipleOntologyController;
import com.ontohub.common.observer.SelectedSynsetObserver;
import com.ontohub.converter.ConverterFactory;
import com.ontohub.converter.ConverterNotFoundException;
import com.ontohub.gui.view.EditSynsetDialog;
import com.ontohub.gui.view.MergeItemsDialog;
import com.ontohub.gui.controller.listener.OntologyChangeListener;
import com.ontohub.common.model.InputFormatEnum;
import com.ontohub.common.model.OutputFormatEnum;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Optional;

@Slf4j
public class OntoHubController implements MultipleOntologyController {

	@FXML
	private TextArea leftViewSelectedTextArea;

	@FXML
	private TextArea rightViewSelectedTextArea;

	@FXML
	private TextArea resultSynsetTextArea;

	@FXML
	private AnchorPane leftOntologyView;

	@FXML
	private AnchorPane rightOntologyView;

	@FXML
	private AnchorPane resultOntologyView;

	@FXML
	private ChoiceBox<InputFormatEnum> leftOntologySelect;

	@FXML
	private ChoiceBox<InputFormatEnum> rightOntologySelect;

	@FXML
	private ChoiceBox<OutputFormatEnum> resultFormatSelect;

	@FXML
	private Button mergeItemsButton;

	@FXML
	private Button editResultButton;

	@FXML
	private Button insertAsParentButton;

	@FXML
	private Button insertAsChildButton;

	@FXML
	private Button convertLeftButton;

	@FXML
	private Button convertRightButton;

	@Getter
	private SelectedSynsetObserver leftViewObserver;

	@Getter
	private SelectedSynsetObserver rightViewObserver;

	@Getter
	private SelectedSynsetObserver resultSynsetObserver;

	private OntologyChangeListener resultViewChangeListener;

	@FXML
	public void initialize() {
		leftOntologySelect.setItems(FXCollections.observableArrayList(InputFormatEnum.values()));
		rightOntologySelect.setItems(FXCollections.observableArrayList(InputFormatEnum.values()));
		resultFormatSelect.setItems(FXCollections.observableArrayList(OutputFormatEnum.values()));

		leftViewObserver = new SelectedSynsetObserver();
		leftViewObserver.attach(this);
		rightViewObserver = new SelectedSynsetObserver();
		rightViewObserver.attach(this);
		resultSynsetObserver = new SelectedSynsetObserver();
		resultViewChangeListener = new OntologyChangeListener(
			resultOntologyView, resultSynsetObserver, true);

		leftOntologySelect.getSelectionModel()
			.selectedIndexProperty()
			.addListener(
				new OntologyChangeListener(leftOntologyView, leftViewObserver, false));
		rightOntologySelect.getSelectionModel()
			.selectedIndexProperty()
			.addListener(
				new OntologyChangeListener(rightOntologyView, rightViewObserver, false));
		resultFormatSelect.getSelectionModel()
			.selectedIndexProperty()
			.addListener(resultViewChangeListener);
		toggleButtons();
	}

	@FXML
	protected void onMergeItemsClick(ActionEvent actionEvent) {
		Optional<KnowledgeRepresentation> leftConverted = convert(
			leftOntologySelect.getValue(),
			resultFormatSelect.getValue(),
			leftViewObserver.getSynset());
		Optional<KnowledgeRepresentation> rightConverted = convert(
			rightOntologySelect.getValue(),
			resultFormatSelect.getValue(),
			rightViewObserver.getSynset());

		if (leftConverted.isPresent() && rightConverted.isPresent()) {
			try {
				MergeItemsDialog dialog = new MergeItemsDialog(
					leftConverted.get(), rightConverted.get(), resultFormatSelect.getValue());
				dialog.showAndWait()
					.filter(ButtonType.OK::equals)
					.ifPresent(button -> {
						KnowledgeRepresentation merged = dialog.merge();
						resultSynsetTextArea.setText(merged.describe());
						resultSynsetObserver.setSynset(merged);
						log.info("Items merged. Merged synset {}", merged.toString());
						toggleButtons();
					});
			} catch (IOException e) {
				log.error("Could not load view.", e);
			}
		}
	}

	@FXML
	protected void onEditClick(ActionEvent actionEvent) {
		if (resultSynsetObserver.hasSynset()) {
			try {
				EditSynsetDialog dialog = new EditSynsetDialog(
					resultSynsetObserver.getSynset(),
					resultFormatSelect.getValue());
				dialog.showAndWait()
					.filter(ButtonType.OK::equals)
					.ifPresent(button -> {
						KnowledgeRepresentation edited = dialog.saveChanges();
						resultSynsetTextArea.setText(edited.describe());
						resultSynsetObserver.setSynset(edited);
						log.info("Edited synset {}", edited.toString());
						toggleButtons();
					});
			} catch (IOException e) {
				log.error("Could not load view.", e);
			}

		} else {
			log.error("No synset present in result view");
		}
	}

	@FXML
	protected void onParentInsertClick(ActionEvent actionEvent) {
		resultViewChangeListener.getCurrentController()
			.receive(resultSynsetObserver.getSynset(), "parent");
		log.info("Inserted value {} into tree (as parent).", resultSynsetObserver.getSynset().toString());
	}

	@FXML
	protected void onChildInsertClick(ActionEvent actionEvent) {
		resultViewChangeListener.getCurrentController()
			.receive(resultSynsetObserver.getSynset(), "child");
		log.info("Inserted value {} into tree (as child).", resultSynsetObserver.getSynset().toString());
	}

	@FXML
	protected void onConvertLeftClick() {
		convert(
			leftOntologySelect.getValue(),
			resultFormatSelect.getValue(),
			leftViewObserver.getSynset())
			.ifPresent(converted -> {
				resultSynsetObserver.setSynset(converted);
				resultSynsetTextArea.setText(converted.describe());
			});
		toggleButtons();
	}

	@FXML
	protected void onConvertRightClick() {
		convert(
			rightOntologySelect.getValue(),
			resultFormatSelect.getValue(),
			rightViewObserver.getSynset())
			.ifPresent(converted -> {
				resultSynsetObserver.setSynset(converted);
				resultSynsetTextArea.setText(converted.describe());
			});
		toggleButtons();
	}

	@Override
	public void update() {
		leftViewSelectedTextArea.setText(
			getSynsetDescription(leftViewObserver));
		rightViewSelectedTextArea.setText(
			getSynsetDescription(rightViewObserver));
		toggleButtons();
	}

	private String getSynsetDescription(SelectedSynsetObserver observer) {
		return Optional.ofNullable(
			observer.getSynset())
			.map(KnowledgeRepresentation::describe)
			.orElse("No synset selected");
	}

	private Optional<KnowledgeRepresentation> convert(InputFormatEnum inputFormat, OutputFormatEnum outputFormat, KnowledgeRepresentation selectedSynset) {
		Optional<KnowledgeRepresentation> result = Optional.empty();
		try {
			ConverterFactory converterFactory = new ConverterFactory();
			FormatConverter converter = converterFactory
				.getConverter(inputFormat, outputFormat);
			KnowledgeRepresentation converted = (KnowledgeRepresentation) converter.apply(selectedSynset);
			result = Optional.of(converted);
			log.info(String.format("Converting %s to %s", inputFormat.getName(), outputFormat.getName()));
		} catch (ConverterNotFoundException e) {
			log.error(e.getMessage());
			String msg = String.format("There is no available converter between %s and %s.", inputFormat, outputFormat);
			Alert alert = new Alert(Alert.AlertType.ERROR, msg, ButtonType.OK);
			alert.setTitle("Converter not found");
			alert.setHeaderText("Converter not found.");
			alert.show();
		}
		return result;
	}

	private void toggleButtons() {
		mergeItemsButton.setDisable(shouldDisableMerge());
		convertLeftButton.setDisable(shouldDisableLeft());
		convertRightButton.setDisable(shouldDisableRight());
		insertAsParentButton.setDisable(shouldDisableInsert());
		insertAsChildButton.setDisable(shouldDisableInsert());
		editResultButton.setDisable(shouldDisableInsert());
	}

	private boolean shouldDisableMerge() {
		return !leftViewObserver.hasSynset()
			|| !rightViewObserver.hasSynset();
	}

	private boolean shouldDisableInsert() {
		return !resultSynsetObserver.hasSynset()
			|| resultFormatSelect.getValue() == null;
	}

	private boolean shouldDisableLeft() {
		return !leftViewObserver.hasSynset()
			|| resultFormatSelect.getValue() == null;
	}

	private boolean shouldDisableRight() {
		return !rightViewObserver.hasSynset()
			|| resultFormatSelect.getValue() == null;
	}
}

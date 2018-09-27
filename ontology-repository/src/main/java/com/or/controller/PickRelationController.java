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

package com.or.controller;

import com.or.model.converter.RelationStringConverter;
import com.or.model.generated.ontology.Relation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class PickRelationController {

	@FXML
	private ChoiceBox<Relation> pickRelationBox;

	@FXML
	private Button addRelationButton;

	@FXML
	private TextField nameTextField;

	@FXML
	private TextField propertyTextField;

	@FXML
	private TextField propertyWeightTextField;

	@FXML
	private TextField reversePropertyTextField;

	@FXML
	private TextField reversePropertyWeightTextField;

	@FXML
	private TextField domainTextField;

	@FXML
	private TextField rangeTextField;

	@FXML
	private ToggleButton symmetricToggle;

	@FXML
	public void initialize() {
		pickRelationBox.setConverter(new RelationStringConverter());
		pickRelationBox.getSelectionModel()
			.selectedItemProperty()
			.addListener((observable, oldValue, newValue) -> {
				if (newValue != null) {
					displayOutput(newValue);
					toggleDisability(true);

				} else {
					toggleDisability(false);
				}
			});
	}

	@FXML
	protected void onAddRelationClick()  {
		Relation relationToAdd = createRelationFromControls();
		pickRelationBox.getItems().add(relationToAdd);
		log.info("Created new relation type: {}", relationToAdd.getNAME());
	}

	public Relation getChosenRelation() {
		return pickRelationBox.getValue();
	}


	public void setRelations(List<Relation> relations) {
		ObservableList<Relation> source = FXCollections.observableArrayList(relations);
		pickRelationBox.setItems(source);
	}

	public List<Relation> getRelations() {
		return pickRelationBox.getItems();
	}

	private Relation createRelationFromControls() {
		Relation result = new Relation();
		result.setNAME(nameTextField.getText());
		result.setPROPERTY(propertyTextField.getText());
		result.setPROPERTYWEIGHT(Integer.parseInt(propertyWeightTextField.getText()));
		result.setREVERSEPROPERTY(reversePropertyTextField.getText());
		result.setREVERSEPROPERTYWEIGHT(Integer.parseInt(reversePropertyWeightTextField.getText()));
		result.setDOMAIN(domainTextField.getText());
		result.setRANGE(rangeTextField.getText());
		result.setSYMMETRIC(String.valueOf(symmetricToggle.isSelected()));
		return result;
	}

	private void displayOutput(Relation relation) {
		nameTextField.setText(relation.getNAME());
		propertyTextField.setText(relation.getPROPERTY());
		propertyWeightTextField.setText(String.valueOf(relation.getPROPERTYWEIGHT()));
		reversePropertyTextField.setText(relation.getREVERSEPROPERTY());
		reversePropertyWeightTextField.setText(String.valueOf(relation.getREVERSEPROPERTYWEIGHT()));
		domainTextField.setText(relation.getDOMAIN());
		rangeTextField.setText(relation.getRANGE());
		symmetricToggle.setSelected(Boolean.parseBoolean(relation.getSYMMETRIC()));
	}

	private void toggleDisability(boolean flag) {
		addRelationButton.setDisable(flag);
		nameTextField.setDisable(flag);
		propertyTextField.setDisable(flag);
		propertyWeightTextField.setDisable(flag);
		reversePropertyTextField.setDisable(flag);
		reversePropertyWeightTextField.setDisable(flag);
		domainTextField.setDisable(flag);
		rangeTextField.setDisable(flag);
		symmetricToggle.setDisable(flag);
	}
}

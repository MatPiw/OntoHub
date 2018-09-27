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

package com.plwordnet.gui;

import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.OntologyViewController;
import com.ontohub.common.observer.SelectedSynsetObserver;
import com.plwordnet.core.PlWordnetClient;
import com.plwordnet.model.Lexeme;
import com.plwordnet.model.PLWordnetRelation;
import com.plwordnet.model.Relation;
import com.plwordnet.model.Sense;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;
import java.util.Optional;

public class PlWordnetController implements OntologyViewController {

	@FXML
	private TextField termTextField;

	@FXML
	private Button findTermButton;

	@FXML
	private TreeView<Sense> wordnetTreeView;

	@FXML
	private TextArea responseTextArea;

	private SelectedSynsetObserver observer;

	private PlWordnetClient client;

	@FXML
	public void initialize() {
		client = new PlWordnetClient();
	}

	@Override
	public void attachObserver(SelectedSynsetObserver observer) {
		this.observer = observer;
	}

	@Override
	public void receive(KnowledgeRepresentation synset, String... args) {
		//this is an input format - do nothing
	}

	@FXML
	protected void onFindTermClick(ActionEvent event) {
		responseTextArea.clear();
		List<Lexeme> lexemeCall = client.getLexeme(termTextField.getText());
		if (!lexemeCall.isEmpty()) {
			Lexeme lexeme = lexemeCall.get(0);
			Optional<Sense> senseCall = client.getSense(lexeme.getSenseId());
			if (senseCall.isPresent()) {
				Sense sense = senseCall.get();
				generateOutput(sense);
				generateTree(sense);
				observer.setSynset(sense);
			}
		} else {
			responseTextArea.setText("Lexeme " + termTextField.getText() + " was not found.");
		}
	}

	private void generateOutput(Sense sense) {
		responseTextArea.setText(sense.describe());
	}

	//tree in top-down approach
	private void generateTree(Sense sense) {
		TreeItem<Sense> treeItem = new TreeItem<>(sense);
		generateSubtree(treeItem);

		wordnetTreeView.setRoot(treeItem);
		wordnetTreeView.getSelectionModel().select(treeItem);
		wordnetTreeView.refresh();

		wordnetTreeView.getSelectionModel()
			.selectedItemProperty()
			.addListener((observable, oldValue, newValue) -> {
				Sense newSense = newValue.getValue();
				generateOutput(newSense);
				generateSubtree(newValue);
				observer.setSynset(newSense);
			});
	}

	private void generateSubtree(TreeItem<Sense> subRoot) {
		subRoot.setExpanded(true);
		Sense sense = subRoot.getValue();
		ObservableList<TreeItem<Sense>> children = subRoot.getChildren();
		//if children list is not empty it means synset was already downloaded
		//todo handle root synsets - this condition does not apply there
		if (children.isEmpty()) {
			sense.getIncoming().forEach(relation -> {
				switch (relation.getRelationId()) {
					//hyperonym
					case 10:
					case 173:
						relation = client.getRelationInfo(relation);
						Relation reverse = client.getReverseRelation(relation.getRelationId());
						for (Sense hyperonym : relation.getSenses()) {
							hyperonym = client.getSense(hyperonym.getId()).orElse(hyperonym);
							hyperonym.setPrefix(reverse.getShortDisplayText());
							TreeItem<Sense> hyperonymTreeItem = new TreeItem<>(hyperonym);
							children.add(hyperonymTreeItem);
							PLWordnetRelation relationWrapper = new PLWordnetRelation(hyperonym, sense, relation);
							sense.getRelations().add(relationWrapper);
						}
						break;
				}
			});
		}
	}
}

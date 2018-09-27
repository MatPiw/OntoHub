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

package com.getty.gui;

import com.getty.core.getty.GettyClient;
import com.getty.model.GettyRelation;
import com.getty.model.GettySynset;
import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.OntologyViewController;
import com.ontohub.common.observer.SelectedSynsetObserver;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GettyController implements OntologyViewController {

	@FXML
	private TextField subjectIdTextField;

	@FXML
	private TreeView<GettySynset> gettyTree;

	@FXML
	private TextArea detailsView;

	private GettySynset currentSynset;

	private SelectedSynsetObserver observer;

	private ExecutorService executorService;


	@FXML
	public void initialize() {
		currentSynset = GettyClient.getSynset("300000000");
		generateSubjectDetails(currentSynset);
		generateTree(currentSynset);
		//TODO find a way to shutdown threadpool on stop
		executorService = Executors.newFixedThreadPool(10);
	}

	@Override
	public void attachObserver(SelectedSynsetObserver observer) {
		this.observer = observer;
	}

	@FXML
	protected void onGetChildrenClick(ActionEvent event) {
		currentSynset = GettyClient.getSynset(subjectIdTextField.getText());
		observer.setSynset(currentSynset);
		generateTree(currentSynset);
		generateSubjectDetails(currentSynset);
	}

	private void generateTree(GettySynset synset) {
		TreeItem<GettySynset> root = new TreeItem<>(synset);
		gettyTree.setRoot(root);
		gettyTree.refresh();

		gettyTree.getSelectionModel()
			.selectedItemProperty()
			.addListener((observable, oldValue, newValue) -> {
				GettySynset newSynset = newValue.getValue();
				generateSubjectDetails(newSynset);
				generateSubtree(newValue);
				observer.setSynset(newSynset);
			});
	}

	private void generateSubtree(TreeItem<GettySynset> root) {
		root.setExpanded(true);
		GettySynset synset = root.getValue();
		ObservableList<TreeItem<GettySynset>> children = root.getChildren();

		if (root.isLeaf()) {
			synset.getPreferredChildren().forEach(relation ->
				executorService.execute(() -> {
					GettySynset childSynset = GettyClient.getSynset(relation.getChildSubjectID().toString());
					children.add(new TreeItem<>(childSynset));
					synset.addRelation(
						new GettyRelation(synset, childSynset, relation)
					);
					gettyTree.refresh();
			}));
			synset.getNonPreferredChildren().forEach(relation -> {
				//TODO differ NP children from P
				executorService.execute(() -> {
					GettySynset childSynset = GettyClient.getSynset(relation.getChildSubjectID().toString());
					children.add(new TreeItem<>(childSynset));
					synset.addRelation(
						new GettyRelation(synset, childSynset, relation)
					);
					gettyTree.refresh();
				});
			});
		}
	}

	@Override
	public void receive(KnowledgeRepresentation synset, String... args) {
		//this is an input format - do nothing
	}

	private void generateSubjectDetails(GettySynset synset) {
		detailsView.setText(synset.describe());
	}
}
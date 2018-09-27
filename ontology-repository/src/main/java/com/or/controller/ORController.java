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

import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.OntologyViewController;
import com.ontohub.common.exception.NoSynsetSelectedException;
import com.ontohub.common.observer.SelectedSynsetObserver;
import com.ontohub.common.util.MultiTreeController;
import com.ontohub.common.util.ResultTreeHandler;
import com.ontohub.common.util.TreeRepresentation;
import com.or.model.ORSynset;
import com.or.model.exporter.ORExporter;
import com.or.model.generated.ontology.Relation;
import com.or.view.PickRelationDialog;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.DirectoryChooser;
import javafx.stage.StageStyle;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
public class ORController implements OntologyViewController {

	private static final String HIERARCHIES_LABEL = "%d of %d";

	@FXML
	private TreeView<ORSynset> orTree;

	@FXML
	private Button previousHierarchybutton;

	@FXML
	private Button nextHierarchyButton;

	@FXML
	private Label hierarchiesLabel;

	@FXML
	private Label relationLabel;

	@FXML
	private Button relationButton;

	private SelectedSynsetObserver observer;

	private MultiTreeController<ORSynset, Relation> treesController;

	private ResultTreeHandler<ORSynset, Relation> treeStructureHandler;

	private List<Relation> allRelations;

	@FXML
	public void initialize() {
		allRelations = new ArrayList<>();
		treesController = new MultiTreeController<>();
		treeStructureHandler = new ResultTreeHandler<>();
	}

	@Override
	public void attachObserver(SelectedSynsetObserver observer) {
		this.observer = observer;
	}

	@Override
	public void receive(KnowledgeRepresentation synset, String... args) {
		ORSynset lastReceivedSynset = (ORSynset) synset;
		TreeItem<ORSynset> selected = orTree
			.getSelectionModel()
			.selectedItemProperty()
			.get();

		try {
			if (args.length > 0) {
				setHierarchyRoot(
					insert(selected, lastReceivedSynset, args[0]));
			} else {
				log.error("Could not insert synset into tree. Lack of insertion mode (parent, child).");
			}
		} catch (NoSynsetSelectedException e) {
			Alert alert = new Alert(
				Alert.AlertType.ERROR,
				"No result synset selected! Please select synset in a result tree.",
				ButtonType.OK);
				alert.initStyle(StageStyle.UTILITY);
				alert.show();
			log.error(e.getMessage());
		}
		orTree.refresh();
		log.info("Received callback form main view. Synset received: {}", synset.toString());
	}

	@FXML
	protected void onNextHierarchyClick() {
		viewHierarchy(treesController.next());
	}

	@FXML
	protected void onPreviousHierarchyClick() {
		viewHierarchy(treesController.previous());
	}

	@FXML
	protected void onRelationButtonClick() {
		try {
			PickRelationDialog dialog = new PickRelationDialog(allRelations);
			dialog.showAndWait()
				.filter(ButtonType.OK::equals)
				.ifPresent(button -> {
					Relation chosenRelation = dialog.getChosenRelation();
					allRelations = dialog.getRelations();
					treesController.setLeadingRelation(chosenRelation);
					relationLabel.setText(chosenRelation.getNAME());


		});
		} catch (IOException e) {
			log.error("Could not load view.");
			//e.printStackTrace();
		}
	}

	@FXML
	protected void onExportClick() {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File targetDirectory = directoryChooser.showDialog(orTree.getScene().getWindow());
		if (targetDirectory != null) {
			ORExporter exporter = new ORExporter();
			exporter.export(treesController.getTrees(), allRelations, targetDirectory);
		}
	}

	private void viewHierarchy(TreeRepresentation<ORSynset, Relation> tree) {
		//set root only to change view, don't change hierarchy root
		orTree.setRoot(tree.getTreeRoot());
		orTree.refresh();
		hierarchiesLabel.setText(String.format(HIERARCHIES_LABEL, treesController.getCurrentTreeIndex() + 1, treesController.treesCount()));
		relationLabel.setText(getRelationForHierarchy(tree));
		log.info("Viewing hierarchy {}. Leading relation {}", orTree.getRoot(), tree.getLeadingRelation());
	}

	private String getRelationForHierarchy(TreeRepresentation<ORSynset, Relation> tree) {
		return Optional.ofNullable(tree.getLeadingRelation())
			.map(Relation::getNAME)
			.orElse("None");
	}

	private void setHierarchyRoot(TreeItem<ORSynset> synset) {
		orTree.setRoot(synset);
		treesController.setTreeRoot(synset);
	}

	private TreeItem<ORSynset> insert(TreeItem<ORSynset> selected, ORSynset lastReceivedSynset, String mode) throws NoSynsetSelectedException {
		TreeItem<ORSynset> result;

		switch (mode) {
			case "parent":
				result = treeStructureHandler
					.insertAsParent(treesController.current(), selected, lastReceivedSynset);
				break;
			case "child":
				result = treeStructureHandler
					.insertAsChild(treesController.current(), selected, lastReceivedSynset);
				break;
			default:
				log.error("Could not insert synset into tree. Wrong insertion mode (should be one of: parent, child).");
				throw new NoSynsetSelectedException();
		}
		return result;
	}
}

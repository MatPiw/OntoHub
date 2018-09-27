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

package com.or.view;

import com.or.controller.PickRelationController;
import com.or.model.generated.ontology.Relation;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;

import java.io.IOException;
import java.util.List;

public class PickRelationDialog extends Dialog {

	private static final String FXML_PATH = "/fxml/ontologies/or_relation_dialog.fxml";

	private DialogPane dialogPane;

	private PickRelationController controller;

	public PickRelationDialog(List<Relation> relations) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_PATH));
		dialogPane = loader.load();
		controller = loader.getController();
		setDialogPane(dialogPane);
		controller.setRelations(relations);
	}

	public Relation getChosenRelation() {
		return controller.getChosenRelation();
	}

	public List<Relation> getRelations() {
		return controller.getRelations();
	}
}

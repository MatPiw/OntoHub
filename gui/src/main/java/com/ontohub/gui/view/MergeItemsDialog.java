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

package com.ontohub.gui.view;

import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.model.OutputFormatEnum;
import com.ontohub.gui.controller.dialog.MergeItemsDialogController;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;

import java.io.IOException;

public class MergeItemsDialog extends Dialog {

	private static final String FXML_PATH = "/fxml/merge_items_dialog.fxml";

	private DialogPane dialogPane;

	private MergeItemsDialogController controller;

	public MergeItemsDialog(KnowledgeRepresentation synset1, KnowledgeRepresentation synset2, OutputFormatEnum outputFormat) throws IOException {
		this();
		setValues(synset1, synset2, outputFormat);

	}

	public MergeItemsDialog() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_PATH));
		dialogPane = loader.load();
		controller = loader.getController();
		setDialogPane(dialogPane);
	}

	public void setValues(KnowledgeRepresentation synset1, KnowledgeRepresentation synset2, OutputFormatEnum outputFormat) {
		controller.setValues(synset1, synset2, outputFormat);
	}

	public KnowledgeRepresentation merge() {
		return controller.saveChanges();
	}
}

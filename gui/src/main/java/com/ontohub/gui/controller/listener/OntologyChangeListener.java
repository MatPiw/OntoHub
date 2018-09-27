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

package com.ontohub.gui.controller.listener;

import com.ontohub.common.OntologyViewController;
import com.ontohub.common.observer.SelectedSynsetObserver;
import com.ontohub.common.model.InputFormatEnum;
import com.ontohub.common.model.OutputFormatEnum;
import com.ontohub.gui.util.OntologyViewLoader;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Optional;

@Slf4j
public class OntologyChangeListener implements ChangeListener<Number> {

	private OntologyViewLoader viewLoader;

	private SelectedSynsetObserver observer;

	private boolean isOutputFormat;

	public OntologyChangeListener(AnchorPane targetPane, SelectedSynsetObserver observer, boolean isOutputFormat) {
		this.viewLoader = new OntologyViewLoader(targetPane);
		this.observer = observer;
		this.isOutputFormat = isOutputFormat;
	}

	@Override
	public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
		String currentViewName;
		String currentViewPath;
		if (isOutputFormat) {
			currentViewName = OutputFormatEnum.values()[newValue.intValue()].getName();
			currentViewPath = OutputFormatEnum.values()[newValue.intValue()].getPath();
		} else {
			currentViewName = InputFormatEnum.values()[newValue.intValue()].getName();
			currentViewPath = InputFormatEnum.values()[newValue.intValue()].getPath();
		}
		try {
			viewLoader.loadView(currentViewName, currentViewPath);
			OntologyViewController controller = viewLoader.getController();
			controller.attachObserver(observer);
			Optional.ofNullable(observer)
				.ifPresent(observer -> observer.setSynset(null));

		} catch (IOException e) {
			new Alert(Alert.AlertType.ERROR,
				"Could not load view.",
				ButtonType.OK)
				.show();
			log.error("Could not load view for path {}", currentViewPath, e);
		}
	}

	public OntologyViewController getCurrentController() {
		return viewLoader.getController();
	}
}

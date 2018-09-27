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

package com.ontohub.gui.util;

import com.ontohub.common.OntologyViewController;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.charset.Charset;

@Slf4j
public class OntologyViewLoader {

	private final AnchorPane targetPane;

	private FXMLLoader loader;

	public OntologyViewLoader(AnchorPane targetPane) {
		this.targetPane = targetPane;
	}

	public FXMLLoader loadView(String name, String path) throws IOException {
		targetPane.getChildren().clear();
		loader = new FXMLLoader(getClass()
			.getResource(path));
		loader.setCharset(Charset.forName("UTF-8"));
		AnchorPane contentToLoad = loader.load();
		targetPane.getChildren().setAll(contentToLoad);
		AnchorPane.setTopAnchor(contentToLoad, 0d);
		AnchorPane.setBottomAnchor(contentToLoad, 0d);
		AnchorPane.setLeftAnchor(contentToLoad, 0d);
		AnchorPane.setRightAnchor(contentToLoad, 0d);
		log.info("Loaded view for {}", name);
		return loader;
	}

	public OntologyViewController getController() {
		return loader.getController();
	}
}

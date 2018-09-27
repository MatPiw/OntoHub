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

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class PropertyBox extends HBox {

	private Label propertyName;

	private TextField propertyValue;

	private Button copyPropButton;

	public PropertyBox(String propertyName, String propertyValue) {
		super();
		this.propertyName = new Label(propertyName);
		this.propertyValue = new TextField(propertyValue);
		this.copyPropButton = new Button(">");
		this.getChildren().addAll(
			this.propertyName,
			this.propertyValue,
			copyPropButton
		);
		this.setPrefWidth(200);
		setHgrow(this.propertyValue, Priority.ALWAYS);
	}

	public String getPropertyName() {
		return propertyName.getText();
	}

	public String getPropertyValue() {
		return propertyValue.getText();
	}

}

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

package com.ontohub.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

//todo this enum is not needed
@Getter
@AllArgsConstructor
public enum FormatConverterEnum {
	GETTY_TO_OR("Getty AAT -> Ontology Repository",
		"/fxml/converters/getty_or_converter.fxml",
		InputFormatEnum.GETTY_AAT,
		OutputFormatEnum.ONTOLOGY_REPOSITORY),
	PLWORDNET_TO_OR("PL Wordnet -> Ontology Repository",
		"/fxml/converters/plwordnet_or_converter.fxml",
		InputFormatEnum.PL_WORDNET,
		OutputFormatEnum.ONTOLOGY_REPOSITORY);

	private final String name;

	private final String path;

	private InputFormatEnum inputFormat;

	private OutputFormatEnum outputFormat;

	@Override
	public String toString() {
		return name;
	}
}

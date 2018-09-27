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

package com.plwordnet.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Lexeme {

	@SerializedName("sense_id")
	@Expose
	private String senseId;

	@SerializedName("lemma")
	@Expose
	private String lemma;

	@SerializedName("language")
	@Expose
	private String language;

	@SerializedName("part_of_speech")
	@Expose
	private String partOfSpeech;

	@SerializedName("languages")
	@Expose
	private List<String> languages = null;

	@Override
	public String toString() {
		return lemma;
	}
}

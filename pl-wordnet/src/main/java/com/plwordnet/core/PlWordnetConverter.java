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

package com.plwordnet.core;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.plwordnet.model.Lexeme;
import com.plwordnet.model.Relation;
import com.plwordnet.model.Sense;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.List;

public class PlWordnetConverter {

	private Gson gson;

	public PlWordnetConverter() {
		gson = new Gson();
	}

	public List<Lexeme> lexemeFromJson(InputStream json) throws UnsupportedEncodingException {
		Reader reader = new InputStreamReader(json, "UTF-8");
		Type listType = new TypeToken<List<Lexeme>>(){}.getType();
		List<Lexeme> resultList = gson.fromJson(reader, listType);
		return resultList;
	}

	public Sense senseFromJson(InputStream json) throws UnsupportedEncodingException {
		Reader reader = new InputStreamReader(json, "UTF-8");
		return gson.fromJson(reader, Sense.class);
	}

	public Relation relationFromJson(InputStream json) throws UnsupportedEncodingException {
		Reader reader = new InputStreamReader(json, "UTF-8");
		return gson.fromJson(reader, Relation.class);
	}
}

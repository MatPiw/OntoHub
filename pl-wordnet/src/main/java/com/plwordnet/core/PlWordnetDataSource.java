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

import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.io.InputStream;

public final class PlWordnetDataSource {

	private static final String GET_LEXEME_URL = "http://plwordnet.pwr.wroc.pl/wordnet/api/lexemes/%s";

	private static final String GET_SENSE_URL = "http://plwordnet.pwr.wroc.pl/wordnet/api/senses/%s";

	private static final String GET_RELATION_URL = "http://api.slowosiec.clarin-pl.eu:80/plwordnet-api/relationTypes/%s";

	private static final String GET_REVERSE_RELATION_URL = "http://api.slowosiec.clarin-pl.eu:80/plwordnet-api/relationTypes/%s/reverse";

	private PlWordnetDataSource() {
		//don't allow creating instances
	}

	public static InputStream getLexeme(String lexeme) throws IOException {
		String requestUrl = String.format(GET_LEXEME_URL, lexeme);
		requestUrl = requestUrl.replaceAll(" ", "%20");
		return executeRequest(requestUrl);

	}

	public static InputStream getSense(String senseId) throws IOException {
		return executeRequest(String.format(GET_SENSE_URL, senseId));
	}

	public static InputStream getRelation(int relationId) throws IOException {
		return executeRequest(String.format(GET_RELATION_URL, relationId));
	}

	public static InputStream getReverseRelation(int relationId) throws IOException {
		return executeRequest(String.format(GET_REVERSE_RELATION_URL, relationId));
	}

	private static InputStream executeRequest(String requestUrl) throws IOException {
		return Request
			.Get(requestUrl)
			.connectTimeout(5000)
			.setHeader("Content-Type", "application/json; charset=UTF-8")
			.execute()
			.returnContent()
			.asStream();
	}
}

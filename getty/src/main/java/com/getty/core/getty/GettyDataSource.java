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

package com.getty.core.getty;

import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.io.InputStream;

public final class GettyDataSource {

	private static final String GET_CHILDREN_URL = "http://vocabsservices.getty.edu/AATService.asmx/AATGetChildren?subjectID=";

	private static final String GET_SUBJECT_INFO_URL = "http://vocabsservices.getty.edu/AATService.asmx/AATGetSubject?subjectId=";

	private static final int TIMEOUT = 2000;

	private GettyDataSource() {
		//don't allow creating instances
	}

	public static InputStream getChildrenResponse(String subjectId) throws IOException {
		return Request
			.Get(GET_CHILDREN_URL + subjectId)
			.connectTimeout(TIMEOUT)
			.execute()
			.returnContent()
			.asStream();
	}

	public static InputStream getSubjectResponse(String subjectId) throws IOException {
		return Request
			.Get(GET_SUBJECT_INFO_URL + subjectId)
			.connectTimeout(TIMEOUT)
			.execute()
			.returnContent()
			.asStream();
	}
}

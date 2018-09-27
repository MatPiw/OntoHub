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

import com.plwordnet.model.Lexeme;
import com.plwordnet.model.Relation;
import com.plwordnet.model.Sense;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Slf4j
public class PlWordnetClient {

	private PlWordnetConverter converter;

	public PlWordnetClient() {
		converter = new PlWordnetConverter();
	}

	public List<Lexeme> getLexeme(String lexeme) {
		List<Lexeme> result = Collections.emptyList();
		try {
			log.info("Getting lexeme for  {}", lexeme);
			result = converter.lexemeFromJson(
				PlWordnetDataSource.getLexeme(lexeme));
		} catch (IOException e) {
			log.error("Could not get lexeme {} ", lexeme, e);
		}
		return result;
	}

	public Optional<Sense> getSense(String senseId) {
		Optional<Sense> result = Optional.empty();
		try {
			log.info("Getting sense info for {}", senseId);
			result = Optional.of(converter.senseFromJson(
				PlWordnetDataSource.getSense(senseId)));
		} catch (IOException e) {
			log.error("Could not get info for id {} ", senseId, e);
		}
		return result;
	}

	public Relation getRelation(int relationId) {
		Relation result = null;
		try {
			log.info("Getting a relation with id {}", relationId);
			result = converter.relationFromJson(
				PlWordnetDataSource.getRelation(relationId)
			);
		} catch (IOException e) {
			log.error("Could not get relation info for {}", relationId, e);
		}
		return result;
	}

	public Relation getReverseRelation(int relationId) {
		Relation result = null;
		try {
			log.info("Getting a reverse relation for relation {}", relationId);
			result = converter.relationFromJson(
				PlWordnetDataSource.getReverseRelation(relationId)
			);
		} catch (IOException e) {
			log.error("Could not get reverse relation info for {}", relationId, e);
		}
		return result;
	}

	//update relation object with name, description etc. without losing senses connected to it
	public Relation getRelationInfo(Relation relation) {
		Relation relationInfo = getRelation(relation.getRelationId());
		if (relationInfo != null) {
			relation.setName(relationInfo.getName());
			relation.setDescription(relationInfo.getDescription());
			relation.setShortDisplayText(relationInfo.getShortDisplayText());
		}
		return relation;
	}
}

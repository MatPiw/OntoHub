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

package com.ontohub.common.observer;

import com.ontohub.common.KnowledgeRepresentation;
import com.ontohub.common.MultipleOntologyController;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
public class SelectedSynsetObserver {

	private List<MultipleOntologyController> observers;

	protected KnowledgeRepresentation synset;

	public SelectedSynsetObserver() {
		observers = new ArrayList<>();
	}

	public void setSynset(KnowledgeRepresentation synset) {
		this.synset = synset;
		notifyObservers();
		log.info("Selected synset has changed. {}", synset);
	}

	public void attach(MultipleOntologyController observer){
		observers.add(observer);
	}

	public boolean hasSynset() {
		return synset != null;
	}

	private void notifyObservers() {
		observers.forEach(MultipleOntologyController::update);
	}
}

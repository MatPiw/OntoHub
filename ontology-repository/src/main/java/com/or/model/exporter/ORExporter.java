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

package com.or.model.exporter;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.ontohub.common.util.TreeRepresentation;
import com.or.model.ORSynset;
import com.or.model.generated.ontology.*;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TreeItem;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@NoArgsConstructor
public class ORExporter {

	private int tagCurrentMaxId = 0;

	private int synsetTypesMaxId = 0;

	private int treeViewMaxId = 0;

	public void export(List<TreeRepresentation<ORSynset, Relation>> trees, List<Relation> relations, File targetDirectory) {
		log.info("Exporting ontology has started.");
		List<Synset> allSynsets = extractSynsets(trees);
		log.info("Found {} synsets in result ontology. ", allSynsets.size());

		Ontology resultOntology = prepareOntology(allSynsets, relations);
		File ontologyFile = new File(targetDirectory, "ontohub-ontology.xml");
		JAXB.marshal(
			new JAXBElement<>(new QName("ONTOLOGY"), Ontology.class, resultOntology),
			ontologyFile);
		log.info("Created main ontology file under {}.", ontologyFile);

		RelationSets resultRelations = prepareRelations(relations);
		File relationsFile = new File(targetDirectory, "ontohub-relations.xml");
		JAXB.marshal(
			new JAXBElement<>(new QName("RELATION_SETS"), RelationSets.class, resultRelations),
			relationsFile);
		log.info("Created relations file under {}.", relationsFile);

		IndexTreeViews treeViews = prepareTreeViews(trees);
		File treeViewsFile = new File(targetDirectory, "ontohub-tree-views.xml");
		JAXB.marshal(
			new JAXBElement<>(new QName("TREE_VIEWS"), IndexTreeViews.class, treeViews),
			treeViewsFile);
		log.info("Created tree views file under {}.", treeViewsFile);

		String msg = String.format("Ontology succesfully exported to %s.\nFiles created:\n%s,\n%s,\n%s.",
			targetDirectory, ontologyFile, relationsFile, treeViewsFile);
		log.info("Ontology succesfully exported to {}.", targetDirectory);
		new Alert(Alert.AlertType.INFORMATION, msg, ButtonType.OK).show();
	}

	private Ontology prepareOntology(List<Synset> allSynsets, List<Relation> relations) {
		Ontology resultOntology = new Ontology();

		Metadata metadata = new Metadata();
		metadata.setTAGCURRENTMAXID(tagCurrentMaxId);
		metadata.setSYNSETTYPES(determineSynsetTypes(allSynsets));
		resultOntology.setMETADATA(metadata);
		resultOntology.getSYNSET().addAll(allSynsets);
		return resultOntology;
	}

	private IndexTreeViews prepareTreeViews(List<TreeRepresentation<ORSynset, Relation>> trees) {
		IndexTreeViews result = new IndexTreeViews();

		result.getTREEVIEW().addAll(
			trees.stream()
				.map(this::generateTreeView)
				.collect(Collectors.toList()));

		//List<IndexTreeView>treeViews = result.getTREEVIEW();

		return result;
	}

	private IndexTreeView generateTreeView(TreeRepresentation<ORSynset, Relation> tree) {
		IndexTreeView result = new IndexTreeView();
		treeViewMaxId++;
		result.setPOSITION(treeViewMaxId);

		String name = tree.getLeadingRelation().getNAME() + " index";
		result.setIDENTIFIER(name.toLowerCase()
			.replaceAll(" ", "_")
			.replaceAll("[^\\w]", ""));
		result.setNAME(name);

		IndexRoots indexRoots = new IndexRoots();
		result.setROOTS(indexRoots);
		IndexRoot indexRoot = new IndexRoot();
		indexRoots.getROOT().add(indexRoot);

		Synset rootSynset = tree.getTreeRoot().getValue().getSynset();
		indexRoot.setNAME(rootSynset.getTAG().getNAME());
		IndexItems indexItems = new IndexItems();
		indexRoot.setITEMS(indexItems);
		indexItems.getITEM().add(rootSynset.getID());

		IndexTree indexTree = new IndexTree();
		result.setTREE(indexTree);
		IndexNodes indexNodes = new IndexNodes();
		indexTree.setNODES(indexNodes);

		IndexNode indexNode = new IndexNode();
		indexNodes.getNODE().add(indexNode);
		indexNode.setTYPE(rootSynset.getTYPE());
		indexNode.setEXPANDABLE(true);

		IndexRelations indexRelations = new IndexRelations();
		IndexRelation indexRelation = new IndexRelation();
		indexRelations.getRELATION().add(indexRelation);
		indexNode.setRELATIONS(indexRelations);

		indexRelation.setPROPER(tree.getLeadingRelation().getPROPERTY());
		indexRelation.setREVERSE(tree.getLeadingRelation().getREVERSEPROPERTY());

		IndexPresentedForTypes presentedFor = new IndexPresentedForTypes();
		result.setPRESENTEDFORTYPES(presentedFor);

		presentedFor.getTYPE().addAll(getSynsetTypes(tree));

		return result;
	}

	private List<String> getSynsetTypes(TreeRepresentation<ORSynset, Relation> tree) {
		Set<String> types = Sets.newHashSet();

		types.add(tree.getLeadingRelation().getDOMAIN());
		types.add(tree.getLeadingRelation().getRANGE());
		types.add(tree.getTreeRoot().getValue().getSynset().getTYPE());
		return Lists.newArrayList(types);
	}

	private RelationSets prepareRelations(List<Relation> relations) {
		RelationSets result = new RelationSets();
		RelationSet set = new RelationSet();
		Relations relationsWrapper = new Relations();
		relationsWrapper.getRELATION().addAll(relations);

		set.setNAME("Ontohub-generated relations");
		set.setRELATIONS(relationsWrapper);
		result.getRELATIONSET().add(set);
		return result;
	}

	private List<Synset> extractSynsets(List<TreeRepresentation<ORSynset, Relation>> trees) {
		return trees.stream()
			.map(tree -> getSynsetsForTree(tree.getTreeRoot(), tree.getLeadingRelation()))
			.flatMap(Collection::stream)
			.distinct()
			.collect(Collectors.toList());
	}

	private List<Synset> getSynsetsForTree(TreeItem<ORSynset> root, Relation relation) {
		ORSynset rootSynset = root.getValue();
		List<Synset> result = new ArrayList<>();

		result.add(rootSynset.getSynset());
		setTagIdForSynset(rootSynset);
		//recursive call
		//todo bug with duplicating relations
		root.getChildren().forEach(child -> {
			result.addAll(getSynsetsForTree(child, relation));
			createIlrForSynset(root.getValue(), child.getValue(), relation);
		});
		return result;
	}

	private void createIlrForSynset(ORSynset parent, ORSynset child, Relation relation) {
		parent.getSynset().getILR()
			.add(createIlr(
				child.getSynset().getID(),
				relation.getPROPERTY(),
				relation.getPROPERTYWEIGHT()));

		child.getSynset().getILR()
			.add(createIlr(
				parent.getSynset().getID(),
				relation.getREVERSEPROPERTY(),
				relation.getREVERSEPROPERTYWEIGHT()));
	}

	private SynsetTypes determineSynsetTypes(List<Synset> allSynsets) {
		SynsetTypes synsetTypes = new SynsetTypes();
		List<SynsetType> types = synsetTypes.getSYNSETTYPE();

		types.addAll(
			allSynsets.stream()
				.map(Synset::getTYPE)
				.distinct()
				.map(this::synsetTypeFromString)
				.collect(Collectors.toList()));

		return synsetTypes;

	}

	private Ilr createIlr(String id, String type, float weight) {
		Ilr result = new Ilr();
		result.setID(id);
		result.setTYPE(type);
		result.setWEIGHT(weight);
		return result;
	}

	private void setTagIdForSynset(ORSynset synset) {
		tagCurrentMaxId++;
		synset.getSynset().getTAG().setID(tagCurrentMaxId);
	}

	private SynsetType synsetTypeFromString(String stringType) {
		SynsetType result = new SynsetType();
		synsetTypesMaxId++;

		result.setNAME(stringType);
		result.setPREFIX(stringType);
		result.setCURRENTMAXID(0);
		result.setID(synsetTypesMaxId);
		return result;
	}
}

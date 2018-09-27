# OntoHub
Ontohub (Ontology Hub) is an application that allows to use different knowledge representations (ontologies, thesauri, wordnets) in various formats and operate on them to create new representations of domain or expert knowledge.
Starting from choosing various input ontologies, operating on synsets and relations between them, leading to create a brand new knowledge representation.

![Alt text](https://raw.githubusercontent.com/MatPiw/OntoHub/master/images/ontohub-view.png "OntoHub view")

OntoHub is easily-extensible. Simple implementation of few interfaces allows to add a new Input or Output knowledge representation format.
Intuitive and simple interface along with a view that can show two ontologies and result ontology at the same time makes work with the application more enjoyable.

## Features
- 3-column view to easily navigate between input and output ontologies
- Merging two synsets into one
- Dynamic synset conversion (application chooses the converter based on input / output formats chosen)
- Editing converted synsets to match user's needs
- Extensibility - adding new ontology formats is fairly simple and generic

## Formats supported
Ontohub is currently in an early phase and does not support many formats yet. For the sake of example, OntoHub currently supports following formats:

### Input formats
- Getty Art and Architecture Thesaurus (http://www.getty.edu/research/tools/vocabularies/aat/)
- PL Wordnet (Słowosieć) (http://plwordnet.pwr.wroc.pl/wordnet/)

### Output formats
- OntologyRepository Editor

## Contributing
If you want some feature to be implemented, raise an issue or create a pull request to review. Feel free to submit ideas and help OntoHub to grow.

package com.getty.model.generated.getty.children;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ontohub.model.generated.getty.children package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ontohub.model.generated.getty.children
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Vocabulary }
     * 
     */
    public Vocabulary createVocabulary() {
        return new Vocabulary();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link ChildType }
     * 
     */
    public ChildType createChildType() {
        return new ChildType();
    }

    /**
     * Create an instance of {@link ChildRelationships }
     * 
     */
    public ChildRelationships createChildRelationships() {
        return new ChildRelationships();
    }

}

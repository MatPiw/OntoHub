
package com.or.model.generated.ontology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RELATIONS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RELATION" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PROPERTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PROPERTY_WEIGHT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="REVERSE_PROPERTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="REVERSE_PROPERTY_WEIGHT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="RANGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DOMAIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SYMMETRIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "relations"
})
public class RelationSet {

    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "RELATIONS", required = true)
    protected Relations relations;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the relations property.
     * 
     * @return
     *     possible object is
     *     {@link Relations }
     *     
     */
    public Relations getRELATIONS() {
        return relations;
    }

    /**
     * Sets the value of the relations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relations }
     *     
     */
    public void setRELATIONS(Relations value) {
        this.relations = value;
    }

}

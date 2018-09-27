
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
 *         &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDENTIFIER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ROOTS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ROOT" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ITEMS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ITEM" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ITEM-VALUES" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ITEM" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="TREE">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NODES">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NODE" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="EXPANDABLE" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="RELATIONS">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="RELATION" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PROPER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="REVERSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="PRESENTED_FOR_TYPES">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "position",
    "name",
    "identifier",
    "roots",
    "tree",
    "presentedfortypes"
})
public class IndexTreeView {

    @XmlElement(name = "POSITION")
    protected int position;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "IDENTIFIER", required = true)
    protected String identifier;
    @XmlElement(name = "ROOTS", required = true)
    protected IndexRoots roots;
    @XmlElement(name = "TREE", required = true)
    protected IndexTree tree;
    @XmlElement(name = "PRESENTED_FOR_TYPES", required = true)
    protected IndexPresentedForTypes presentedfortypes;

    /**
     * Gets the value of the position property.
     * 
     */
    public int getPOSITION() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     */
    public void setPOSITION(int value) {
        this.position = value;
    }

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
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFIER() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFIER(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the roots property.
     * 
     * @return
     *     possible object is
     *     {@link IndexRoots }
     *     
     */
    public IndexRoots getROOTS() {
        return roots;
    }

    /**
     * Sets the value of the roots property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexRoots }
     *     
     */
    public void setROOTS(IndexRoots value) {
        this.roots = value;
    }

    /**
     * Gets the value of the tree property.
     * 
     * @return
     *     possible object is
     *     {@link IndexTree }
     *     
     */
    public IndexTree getTREE() {
        return tree;
    }

    /**
     * Sets the value of the tree property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexTree }
     *     
     */
    public void setTREE(IndexTree value) {
        this.tree = value;
    }

    /**
     * Gets the value of the presentedfortypes property.
     * 
     * @return
     *     possible object is
     *     {@link IndexPresentedForTypes }
     *     
     */
    public IndexPresentedForTypes getPRESENTEDFORTYPES() {
        return presentedfortypes;
    }

    /**
     * Sets the value of the presentedfortypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexPresentedForTypes }
     *     
     */
    public void setPRESENTEDFORTYPES(IndexPresentedForTypes value) {
        this.presentedfortypes = value;
    }

}

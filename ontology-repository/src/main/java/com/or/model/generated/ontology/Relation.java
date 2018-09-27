
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
 *         &lt;element name="PROPERTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROPERTY_WEIGHT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="REVERSE_PROPERTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REVERSE_PROPERTY_WEIGHT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RANGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOMAIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SYMMETRIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "property",
    "propertyweight",
    "reverseproperty",
    "reversepropertyweight",
    "range",
    "domain",
    "symmetric"
})
public class Relation {

    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "PROPERTY", required = true)
    protected String property;
    @XmlElement(name = "PROPERTY_WEIGHT")
    protected int propertyweight;
    @XmlElement(name = "REVERSE_PROPERTY", required = true)
    protected String reverseproperty;
    @XmlElement(name = "REVERSE_PROPERTY_WEIGHT")
    protected int reversepropertyweight;
    @XmlElement(name = "RANGE", required = true)
    protected String range;
    @XmlElement(name = "DOMAIN", required = true)
    protected String domain;
    @XmlElement(name = "SYMMETRIC", required = true)
    protected String symmetric;

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
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROPERTY() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROPERTY(String value) {
        this.property = value;
    }

    /**
     * Gets the value of the propertyweight property.
     * 
     */
    public int getPROPERTYWEIGHT() {
        return propertyweight;
    }

    /**
     * Sets the value of the propertyweight property.
     * 
     */
    public void setPROPERTYWEIGHT(int value) {
        this.propertyweight = value;
    }

    /**
     * Gets the value of the reverseproperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVERSEPROPERTY() {
        return reverseproperty;
    }

    /**
     * Sets the value of the reverseproperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVERSEPROPERTY(String value) {
        this.reverseproperty = value;
    }

    /**
     * Gets the value of the reversepropertyweight property.
     * 
     */
    public int getREVERSEPROPERTYWEIGHT() {
        return reversepropertyweight;
    }

    /**
     * Sets the value of the reversepropertyweight property.
     * 
     */
    public void setREVERSEPROPERTYWEIGHT(int value) {
        this.reversepropertyweight = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRANGE() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRANGE(String value) {
        this.range = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOMAIN() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOMAIN(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the symmetric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYMMETRIC() {
        return symmetric;
    }

    /**
     * Sets the value of the symmetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYMMETRIC(String value) {
        this.symmetric = value;
    }

}

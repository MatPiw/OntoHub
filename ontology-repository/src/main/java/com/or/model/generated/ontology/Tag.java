
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
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SENSE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MARKED" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "id",
    "name",
    "sense",
    "marked"
})
public class Tag {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "SENSE")
    protected int sense;
    @XmlElement(name = "MARKED", required = true)
    protected String marked;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(int value) {
        this.id = value;
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
     * Gets the value of the sense property.
     * 
     */
    public int getSENSE() {
        return sense;
    }

    /**
     * Sets the value of the sense property.
     * 
     */
    public void setSENSE(int value) {
        this.sense = value;
    }

    /**
     * Gets the value of the marked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARKED() {
        return marked;
    }

    /**
     * Sets the value of the marked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARKED(String value) {
        this.marked = value;
    }

}

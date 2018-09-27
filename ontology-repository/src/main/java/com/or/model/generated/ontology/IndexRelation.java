
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
 *         &lt;element name="PROPER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REVERSE" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "proper",
    "reverse"
})
public class IndexRelation {

    @XmlElement(name = "PROPER", required = true)
    protected String proper;
    @XmlElement(name = "REVERSE", required = true)
    protected String reverse;

    /**
     * Gets the value of the proper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROPER() {
        return proper;
    }

    /**
     * Sets the value of the proper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROPER(String value) {
        this.proper = value;
    }

    /**
     * Gets the value of the reverse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREVERSE() {
        return reverse;
    }

    /**
     * Sets the value of the reverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREVERSE(String value) {
        this.reverse = value;
    }

}

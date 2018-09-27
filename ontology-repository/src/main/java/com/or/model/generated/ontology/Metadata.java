
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
 *         &lt;element name="SYNSET_TYPES">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SYNSET_TYPE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PREFIX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CURRENT_MAX_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="TAG_CURRENT_MAX_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "synsettypes",
    "tagcurrentmaxid"
})
public class Metadata {

    @XmlElement(name = "SYNSET_TYPES", required = true)
    protected SynsetTypes synsettypes;
    @XmlElement(name = "TAG_CURRENT_MAX_ID")
    protected int tagcurrentmaxid;

    /**
     * Gets the value of the synsettypes property.
     * 
     * @return
     *     possible object is
     *     {@link SynsetTypes }
     *     
     */
    public SynsetTypes getSYNSETTYPES() {
        return synsettypes;
    }

    /**
     * Sets the value of the synsettypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynsetTypes }
     *     
     */
    public void setSYNSETTYPES(SynsetTypes value) {
        this.synsettypes = value;
    }

    /**
     * Gets the value of the tagcurrentmaxid property.
     * 
     */
    public int getTAGCURRENTMAXID() {
        return tagcurrentmaxid;
    }

    /**
     * Sets the value of the tagcurrentmaxid property.
     * 
     */
    public void setTAGCURRENTMAXID(int value) {
        this.tagcurrentmaxid = value;
    }

}

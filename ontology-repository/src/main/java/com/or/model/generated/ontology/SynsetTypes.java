
package com.or.model.generated.ontology;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="SYNSET_TYPE" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PREFIX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CURRENT_MAX_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "synsettype"
})
public class SynsetTypes {

    @XmlElement(name = "SYNSET_TYPE")
    protected List<SynsetType> synsettype;

    /**
     * Gets the value of the synsettype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synsettype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSYNSETTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SynsetType }
     * 
     * 
     */
    public List<SynsetType> getSYNSETTYPE() {
        if (synsettype == null) {
            synsettype = new ArrayList<SynsetType>();
        }
        return this.synsettype;
    }

}

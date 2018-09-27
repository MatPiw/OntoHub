
package com.getty.model.generated.getty.subject;

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
 *         &lt;element name="Preferred_Term" type="{}TermType"/>
 *         &lt;element name="Non-Preferred_Term" type="{}TermType" maxOccurs="unbounded" minOccurs="0"/>
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
    "preferredTerm",
    "nonPreferredTerm"
})
public class Terms {

    @XmlElement(name = "Preferred_Term", required = true)
    protected TermType preferredTerm;
    @XmlElement(name = "Non-Preferred_Term")
    protected List<TermType> nonPreferredTerm;

    /**
     * Gets the value of the preferredTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getPreferredTerm() {
        return preferredTerm;
    }

    /**
     * Sets the value of the preferredTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setPreferredTerm(TermType value) {
        this.preferredTerm = value;
    }

    /**
     * Gets the value of the nonPreferredTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonPreferredTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonPreferredTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermType }
     * 
     * 
     */
    public List<TermType> getNonPreferredTerm() {
        if (nonPreferredTerm == null) {
            nonPreferredTerm = new ArrayList<TermType>();
        }
        return this.nonPreferredTerm;
    }

}

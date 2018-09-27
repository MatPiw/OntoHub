
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
 *         &lt;element name="Preferred_Parent" type="{}ParentType"/>
 *         &lt;element name="Non-Preferred_Parent" type="{}ParentType" maxOccurs="unbounded" minOccurs="0"/>
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
    "preferredParent",
    "nonPreferredParent"
})
public class ParentRelationships {

    @XmlElement(name = "Preferred_Parent", required = true)
    protected ParentType preferredParent;
    @XmlElement(name = "Non-Preferred_Parent")
    protected List<ParentType> nonPreferredParent;

    /**
     * Gets the value of the preferredParent property.
     * 
     * @return
     *     possible object is
     *     {@link ParentType }
     *     
     */
    public ParentType getPreferredParent() {
        return preferredParent;
    }

    /**
     * Sets the value of the preferredParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentType }
     *     
     */
    public void setPreferredParent(ParentType value) {
        this.preferredParent = value;
    }

    /**
     * Gets the value of the nonPreferredParent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonPreferredParent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonPreferredParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParentType }
     * 
     * 
     */
    public List<ParentType> getNonPreferredParent() {
        if (nonPreferredParent == null) {
            nonPreferredParent = new ArrayList<ParentType>();
        }
        return this.nonPreferredParent;
    }

}

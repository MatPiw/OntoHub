
package com.getty.model.generated.getty.children;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="Preferred_Child" type="{}ChildType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Non-Preferred_Child" type="{}ChildType" maxOccurs="unbounded" minOccurs="0"/>
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
    "preferredChild",
    "nonPreferredChild"
})
public class ChildRelationships {

    @XmlElement(name = "Preferred_Child")
    protected List<ChildType> preferredChild;
    @XmlElement(name = "Non-Preferred_Child")
    protected List<ChildType> nonPreferredChild;

    /**
     * Gets the value of the preferredChild property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredChild property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildType }
     * 
     * 
     */
    public List<ChildType> getPreferredChild() {
        if (preferredChild == null) {
            preferredChild = new ArrayList<ChildType>();
        }
        return this.preferredChild;
    }

    /**
     * Gets the value of the nonPreferredChild property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonPreferredChild property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonPreferredChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildType }
     * 
     * 
     */
    public List<ChildType> getNonPreferredChild() {
        if (nonPreferredChild == null) {
            nonPreferredChild = new ArrayList<ChildType>();
        }
        return this.nonPreferredChild;
    }

}

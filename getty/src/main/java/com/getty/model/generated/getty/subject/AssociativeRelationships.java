
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
 *         &lt;element name="Associative_Relationship" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="AR_Date" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Display_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Start_Date" type="{}Geog_Date"/>
 *                             &lt;element name="End_Date" type="{}Geog_Date"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Historic_Flag" type="{}Historic_Flag_Value" minOccurs="0"/>
 *                   &lt;element name="Relationship_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Related_Subject_ID">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="VP_Subject_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="Contrib_Subject_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
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
    "associativeRelationship"
})
public class AssociativeRelationships {

    @XmlElement(name = "Associative_Relationship")
    protected List<AssociativeRelationship> associativeRelationship;

    /**
     * Gets the value of the associativeRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associativeRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociativeRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociativeRelationship }
     * 
     * 
     */
    public List<AssociativeRelationship> getAssociativeRelationship() {
        if (associativeRelationship == null) {
            associativeRelationship = new ArrayList<AssociativeRelationship>();
        }
        return this.associativeRelationship;
    }

}

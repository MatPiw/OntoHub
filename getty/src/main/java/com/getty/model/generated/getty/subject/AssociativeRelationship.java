
package com.getty.model.generated.getty.subject;

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
 *       &lt;all>
 *         &lt;element name="AR_Date" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="Display_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Start_Date" type="{}Geog_Date"/>
 *                   &lt;element name="End_Date" type="{}Geog_Date"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Historic_Flag" type="{}Historic_Flag_Value" minOccurs="0"/>
 *         &lt;element name="Relationship_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Related_Subject_ID">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="VP_Subject_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="Contrib_Subject_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
public class AssociativeRelationship {

    @XmlElement(name = "AR_Date")
    protected ARDate arDate;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Historic_Flag", defaultValue = "Current")
    protected HistoricFlagValue historicFlag;
    @XmlElement(name = "Relationship_Type", required = true)
    protected String relationshipType;
    @XmlElement(name = "Related_Subject_ID", required = true)
    protected RelatedSubjectID relatedSubjectID;

    /**
     * Gets the value of the arDate property.
     * 
     * @return
     *     possible object is
     *     {@link ARDate }
     *     
     */
    public ARDate getARDate() {
        return arDate;
    }

    /**
     * Sets the value of the arDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARDate }
     *     
     */
    public void setARDate(ARDate value) {
        this.arDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the historicFlag property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricFlagValue }
     *     
     */
    public HistoricFlagValue getHistoricFlag() {
        return historicFlag;
    }

    /**
     * Sets the value of the historicFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricFlagValue }
     *     
     */
    public void setHistoricFlag(HistoricFlagValue value) {
        this.historicFlag = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the relatedSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSubjectID }
     *     
     */
    public RelatedSubjectID getRelatedSubjectID() {
        return relatedSubjectID;
    }

    /**
     * Sets the value of the relatedSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSubjectID }
     *     
     */
    public void setRelatedSubjectID(RelatedSubjectID value) {
        this.relatedSubjectID = value;
    }

}

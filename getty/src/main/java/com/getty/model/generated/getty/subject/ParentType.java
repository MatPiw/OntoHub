
package com.getty.model.generated.getty.subject;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parent_Subject_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Relationship_Type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Parent/Child"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Historic_Flag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Current"/>
 *               &lt;enumeration value="Historical"/>
 *               &lt;enumeration value="Both"/>
 *               &lt;enumeration value="N/A"/>
 *               &lt;enumeration value="Undetermined"/>
 *               &lt;enumeration value="Whole/Part-BTP"/>
 *               &lt;enumeration value="Genus/Species-BTG"/>
 *               &lt;enumeration value="Instance-BTI"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Parent_String" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Parent_Date" minOccurs="0">
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
 *         &lt;element name="Hier_Rel_Type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Whole/Part-BTP"/>
 *               &lt;enumeration value="Genus/Species-BTG"/>
 *               &lt;enumeration value="Instance-BTI"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "ParentType", propOrder = {
    "parentSubjectID",
    "relationshipType",
    "historicFlag",
    "parentString",
    "parentDate",
    "hierRelType"
})
public class ParentType {

    @XmlElement(name = "Parent_Subject_ID", required = true)
    protected BigInteger parentSubjectID;
    @XmlElement(name = "Relationship_Type", required = true)
    protected String relationshipType;
    @XmlElement(name = "Historic_Flag")
    protected String historicFlag;
    @XmlElement(name = "Parent_String", required = true)
    protected String parentString;
    @XmlElement(name = "Parent_Date")
    protected ParentDate parentDate;
    @XmlElement(name = "Hier_Rel_Type", required = true)
    protected String hierRelType;

    /**
     * Gets the value of the parentSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentSubjectID() {
        return parentSubjectID;
    }

    /**
     * Sets the value of the parentSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentSubjectID(BigInteger value) {
        this.parentSubjectID = value;
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
     * Gets the value of the historicFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricFlag() {
        return historicFlag;
    }

    /**
     * Sets the value of the historicFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricFlag(String value) {
        this.historicFlag = value;
    }

    /**
     * Gets the value of the parentString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentString() {
        return parentString;
    }

    /**
     * Sets the value of the parentString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentString(String value) {
        this.parentString = value;
    }

    /**
     * Gets the value of the parentDate property.
     * 
     * @return
     *     possible object is
     *     {@link ParentDate }
     *     
     */
    public ParentDate getParentDate() {
        return parentDate;
    }

    /**
     * Sets the value of the parentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentDate }
     *     
     */
    public void setParentDate(ParentDate value) {
        this.parentDate = value;
    }

    /**
     * Gets the value of the hierRelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierRelType() {
        return hierRelType;
    }

    /**
     * Sets the value of the hierRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierRelType(String value) {
        this.hierRelType = value;
    }

}

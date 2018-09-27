
package com.getty.model.generated.getty.children;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * <p>Java class for ChildType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Child_Subject_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Preferred_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Historic_Flag">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Current"/>
 *               &lt;enumeration value="Historical"/>
 *               &lt;enumeration value="Both"/>
 *               &lt;enumeration value="N/A"/>
 *               &lt;enumeration value="Undetermined"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Display_Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ChildType", propOrder = {
    "childSubjectID",
    "preferredTerm",
    "historicFlag",
    "displayDate",
    "hierRelType"
})
public class ChildType {

    @XmlElement(name = "Child_Subject_ID", required = true)
    protected BigInteger childSubjectID;
    @XmlElement(name = "Preferred_Term", required = true)
    protected String preferredTerm;
    @XmlElement(name = "Historic_Flag", required = true)
    protected String historicFlag;
    @XmlElement(name = "Display_Date")
    protected String displayDate;
    @XmlElement(name = "Hier_Rel_Type", required = true)
    protected String hierRelType;

    /**
     * Gets the value of the childSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildSubjectID() {
        return childSubjectID;
    }

    /**
     * Sets the value of the childSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildSubjectID(BigInteger value) {
        this.childSubjectID = value;
    }

    /**
     * Gets the value of the preferredTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredTerm() {
        return preferredTerm;
    }

    /**
     * Sets the value of the preferredTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredTerm(String value) {
        this.preferredTerm = value;
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
     * Gets the value of the displayDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayDate() {
        return displayDate;
    }

    /**
     * Sets the value of the displayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayDate(String value) {
        this.displayDate = value;
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

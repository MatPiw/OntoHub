
package com.getty.model.generated.getty.subject;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Term block for the Terms element
 * 
 * <p>Java class for TermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AACR2_Flag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="N/A"/>
 *               &lt;enumeration value="Yes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Display_Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Yes"/>
 *               &lt;enumeration value="No"/>
 *               &lt;enumeration value="N/A"/>
 *               &lt;enumeration value="Index"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Display_Order" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="Historic_Flag" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Both"/>
 *               &lt;enumeration value="Current"/>
 *               &lt;enumeration value="Historical"/>
 *               &lt;enumeration value="N/A"/>
 *               &lt;enumeration value="Undetermined"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Term_Languages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Term_Language" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Preferred">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Preferred"/>
 *                                   &lt;enumeration value="Non Preferred"/>
 *                                   &lt;enumeration value="Undetermined"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Term_Type" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Alternate Descriptor"/>
 *                                   &lt;enumeration value="Used For Term"/>
 *                                   &lt;enumeration value="Descriptor"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Part_of_Speech" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="N/A"/>
 *                                   &lt;enumeration value="Undetermined"/>
 *                                   &lt;enumeration value="Plural Noun"/>
 *                                   &lt;enumeration value="Singular Noun"/>
 *                                   &lt;enumeration value="Singular and Plural Gerund"/>
 *                                   &lt;enumeration value="Past Participle"/>
 *                                   &lt;enumeration value="Verbal Noun"/>
 *                                   &lt;enumeration value="Noun"/>
 *                                   &lt;enumeration value="Adjectival"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Lang_Stat" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Undetermined"/>
 *                                   &lt;enumeration value="N/A"/>
 *                                   &lt;enumeration value="Loan Term"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Other_Flags" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="N/A"/>
 *               &lt;enumeration value="Full term"/>
 *               &lt;enumeration value="Abbreviation"/>
 *               &lt;enumeration value="Neologism"/>
 *               &lt;enumeration value="Jargon Slang"/>
 *               &lt;enumeration value="Scientific term"/>
 *               &lt;enumeration value="Common term"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Term_Contributors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Term_Contributor" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Contributor_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Term_Date" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="Display_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Start_Date" type="{}Historical_Date"/>
 *                   &lt;element name="End_Date" type="{}Historical_Date"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Term_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Term_Sources" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Term_Source" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Source" type="{}SourceType"/>
 *                             &lt;element name="Page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Preferred" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Preferred"/>
 *                                   &lt;enumeration value="Non Preferred"/>
 *                                   &lt;enumeration value="Unknown"/>
 *                                   &lt;enumeration value="Alternate Preferred"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Term_Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Vernacular">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Vernacular"/>
 *               &lt;enumeration value="Other"/>
 *               &lt;enumeration value="Undetermined"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "TermType", propOrder = {

})
public class TermType {

    @XmlElement(name = "AACR2_Flag", defaultValue = "N/A")
    protected String aacr2Flag;
    @XmlElement(name = "Display_Name")
    protected String displayName;
    @XmlElement(name = "Display_Order", defaultValue = "0")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer displayOrder;
    @XmlElement(name = "Historic_Flag", defaultValue = "Current")
    protected String historicFlag;
    @XmlElement(name = "Term_Languages")
    protected TermLanguages termLanguages;
    @XmlElement(name = "Other_Flags", defaultValue = "N/A")
    protected String otherFlags;
    @XmlElement(name = "Term_Contributors")
    protected TermContributors termContributors;
    @XmlElement(name = "Term_Date")
    protected TermDate termDate;
    @XmlElement(name = "Term_ID", required = true)
    protected BigInteger termID;
    @XmlElement(name = "Term_Sources")
    protected TermSources termSources;
    @XmlElement(name = "Term_Text", required = true)
    protected String termText;
    @XmlElement(name = "Vernacular", required = true, defaultValue = "Undetermined")
    protected String vernacular;

    /**
     * Gets the value of the aacr2Flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAACR2Flag() {
        return aacr2Flag;
    }

    /**
     * Sets the value of the aacr2Flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAACR2Flag(String value) {
        this.aacr2Flag = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOrder(Integer value) {
        this.displayOrder = value;
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
     * Gets the value of the termLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link TermLanguages }
     *     
     */
    public TermLanguages getTermLanguages() {
        return termLanguages;
    }

    /**
     * Sets the value of the termLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermLanguages }
     *     
     */
    public void setTermLanguages(TermLanguages value) {
        this.termLanguages = value;
    }

    /**
     * Gets the value of the otherFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherFlags() {
        return otherFlags;
    }

    /**
     * Sets the value of the otherFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherFlags(String value) {
        this.otherFlags = value;
    }

    /**
     * Gets the value of the termContributors property.
     * 
     * @return
     *     possible object is
     *     {@link TermContributors }
     *     
     */
    public TermContributors getTermContributors() {
        return termContributors;
    }

    /**
     * Sets the value of the termContributors property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermContributors }
     *     
     */
    public void setTermContributors(TermContributors value) {
        this.termContributors = value;
    }

    /**
     * Gets the value of the termDate property.
     * 
     * @return
     *     possible object is
     *     {@link TermDate }
     *     
     */
    public TermDate getTermDate() {
        return termDate;
    }

    /**
     * Sets the value of the termDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermDate }
     *     
     */
    public void setTermDate(TermDate value) {
        this.termDate = value;
    }

    /**
     * Gets the value of the termID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTermID() {
        return termID;
    }

    /**
     * Sets the value of the termID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTermID(BigInteger value) {
        this.termID = value;
    }

    /**
     * Gets the value of the termSources property.
     * 
     * @return
     *     possible object is
     *     {@link TermSources }
     *     
     */
    public TermSources getTermSources() {
        return termSources;
    }

    /**
     * Sets the value of the termSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermSources }
     *     
     */
    public void setTermSources(TermSources value) {
        this.termSources = value;
    }

    /**
     * Gets the value of the termText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermText() {
        return termText;
    }

    /**
     * Sets the value of the termText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermText(String value) {
        this.termText = value;
    }

    /**
     * Gets the value of the vernacular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVernacular() {
        return vernacular;
    }

    /**
     * Sets the value of the vernacular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVernacular(String value) {
        this.vernacular = value;
    }

}

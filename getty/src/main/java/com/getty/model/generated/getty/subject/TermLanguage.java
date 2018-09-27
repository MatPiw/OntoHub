
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
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Preferred">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Preferred"/>
 *               &lt;enumeration value="Non Preferred"/>
 *               &lt;enumeration value="Undetermined"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Term_Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Alternate Descriptor"/>
 *               &lt;enumeration value="Used For Term"/>
 *               &lt;enumeration value="Descriptor"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Part_of_Speech" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="N/A"/>
 *               &lt;enumeration value="Undetermined"/>
 *               &lt;enumeration value="Plural Noun"/>
 *               &lt;enumeration value="Singular Noun"/>
 *               &lt;enumeration value="Singular and Plural Gerund"/>
 *               &lt;enumeration value="Past Participle"/>
 *               &lt;enumeration value="Verbal Noun"/>
 *               &lt;enumeration value="Noun"/>
 *               &lt;enumeration value="Adjectival"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Lang_Stat" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Undetermined"/>
 *               &lt;enumeration value="N/A"/>
 *               &lt;enumeration value="Loan Term"/>
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
@XmlType(name = "", propOrder = {

})
public class TermLanguage {

    @XmlElement(name = "Language", required = true)
    protected String language;
    @XmlElement(name = "Preferred", required = true)
    protected String preferred;
    @XmlElement(name = "Qualifier")
    protected String qualifier;
    @XmlElement(name = "Term_Type")
    protected String termType;
    @XmlElement(name = "Part_of_Speech")
    protected String partOfSpeech;
    @XmlElement(name = "Lang_Stat")
    protected String langStat;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred(String value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the termType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermType() {
        return termType;
    }

    /**
     * Sets the value of the termType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermType(String value) {
        this.termType = value;
    }

    /**
     * Gets the value of the partOfSpeech property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    /**
     * Sets the value of the partOfSpeech property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOfSpeech(String value) {
        this.partOfSpeech = value;
    }

    /**
     * Gets the value of the langStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangStat() {
        return langStat;
    }

    /**
     * Sets the value of the langStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangStat(String value) {
        this.langStat = value;
    }

}

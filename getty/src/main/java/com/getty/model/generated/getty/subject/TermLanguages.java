
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
 *         &lt;element name="Term_Language" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Preferred">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Preferred"/>
 *                         &lt;enumeration value="Non Preferred"/>
 *                         &lt;enumeration value="Undetermined"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Term_Type" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Alternate Descriptor"/>
 *                         &lt;enumeration value="Used For Term"/>
 *                         &lt;enumeration value="Descriptor"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Part_of_Speech" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="N/A"/>
 *                         &lt;enumeration value="Undetermined"/>
 *                         &lt;enumeration value="Plural Noun"/>
 *                         &lt;enumeration value="Singular Noun"/>
 *                         &lt;enumeration value="Singular and Plural Gerund"/>
 *                         &lt;enumeration value="Past Participle"/>
 *                         &lt;enumeration value="Verbal Noun"/>
 *                         &lt;enumeration value="Noun"/>
 *                         &lt;enumeration value="Adjectival"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Lang_Stat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Undetermined"/>
 *                         &lt;enumeration value="N/A"/>
 *                         &lt;enumeration value="Loan Term"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
    "termLanguage"
})
public class TermLanguages {

    @XmlElement(name = "Term_Language", required = true)
    protected List<TermLanguage> termLanguage;

    /**
     * Gets the value of the termLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermLanguage }
     * 
     * 
     */
    public List<TermLanguage> getTermLanguage() {
        if (termLanguage == null) {
            termLanguage = new ArrayList<TermLanguage>();
        }
        return this.termLanguage;
    }

}


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
 *         &lt;element name="Note_Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Note_Language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Note_Contributors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Note_Contributor" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Contributor_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="Note_Sources" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Note_Source" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Source" type="{}SourceType"/>
 *                             &lt;element name="Page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
public class DescriptiveNote {

    @XmlElement(name = "Note_Text", required = true)
    protected String noteText;
    @XmlElement(name = "Note_Language", required = true)
    protected String noteLanguage;
    @XmlElement(name = "Note_Contributors")
    protected NoteContributors noteContributors;
    @XmlElement(name = "Note_Sources")
    protected NoteSources noteSources;

    /**
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteText(String value) {
        this.noteText = value;
    }

    /**
     * Gets the value of the noteLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteLanguage() {
        return noteLanguage;
    }

    /**
     * Sets the value of the noteLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteLanguage(String value) {
        this.noteLanguage = value;
    }

    /**
     * Gets the value of the noteContributors property.
     * 
     * @return
     *     possible object is
     *     {@link NoteContributors }
     *     
     */
    public NoteContributors getNoteContributors() {
        return noteContributors;
    }

    /**
     * Sets the value of the noteContributors property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteContributors }
     *     
     */
    public void setNoteContributors(NoteContributors value) {
        this.noteContributors = value;
    }

    /**
     * Gets the value of the noteSources property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSources }
     *     
     */
    public NoteSources getNoteSources() {
        return noteSources;
    }

    /**
     * Sets the value of the noteSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSources }
     *     
     */
    public void setNoteSources(NoteSources value) {
        this.noteSources = value;
    }

}

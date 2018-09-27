
package com.getty.model.generated.getty.subject;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="Associative_Relationships" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Associative_Relationship" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="AR_Date" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="Display_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Start_Date" type="{}Geog_Date"/>
 *                                       &lt;element name="End_Date" type="{}Geog_Date"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Historic_Flag" type="{}Historic_Flag_Value" minOccurs="0"/>
 *                             &lt;element name="Relationship_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Related_Subject_ID">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="VP_Subject_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="Contrib_Subject_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
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
 *         &lt;element name="Descriptive_Notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Descriptive_Note" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Note_Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Note_Language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Note_Contributors" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Note_Contributor" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="Contributor_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Note_Sources" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Note_Source" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="Source" type="{}SourceType"/>
 *                                                 &lt;element name="Page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
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
 *         &lt;element name="Facet_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Merged_Status" type="{}Merged_Status_Value"/>
 *         &lt;element name="Parent_Relationships">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Preferred_Parent" type="{}ParentType"/>
 *                   &lt;element name="Non-Preferred_Parent" type="{}ParentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Record_Type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Concept"/>
 *               &lt;enumeration value="Facet"/>
 *               &lt;enumeration value="Guide Term"/>
 *               &lt;enumeration value="Hierarchy Name"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Subject_Contributors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Subject_Contributor" maxOccurs="unbounded">
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
 *         &lt;element name="Subject_Sources" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Subject_Source" maxOccurs="unbounded">
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
 *         &lt;element name="Terms">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Preferred_Term" type="{}TermType"/>
 *                   &lt;element name="Non-Preferred_Term" type="{}TermType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="Subject_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
public class Subject {

    @XmlElement(name = "Associative_Relationships")
    protected AssociativeRelationships associativeRelationships;
    @XmlElement(name = "Descriptive_Notes")
    protected DescriptiveNotes descriptiveNotes;
    @XmlElement(name = "Facet_Code")
    protected String facetCode;
    @XmlElement(name = "Merged_Status", required = true)
    protected MergedStatusValue mergedStatus;
    @XmlElement(name = "Parent_Relationships", required = true)
    protected ParentRelationships parentRelationships;
    @XmlElement(name = "Record_Type", required = true, defaultValue = "Concept")
    protected String recordType;
    @XmlElement(name = "Subject_Contributors")
    protected SubjectContributors subjectContributors;
    @XmlElement(name = "Subject_Sources")
    protected SubjectSources subjectSources;
    @XmlElement(name = "Terms", required = true)
    protected Terms terms;
    @XmlAttribute(name = "Subject_ID", required = true)
    protected BigInteger subjectID;

    /**
     * Gets the value of the associativeRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link AssociativeRelationships }
     *     
     */
    public AssociativeRelationships getAssociativeRelationships() {
        return associativeRelationships;
    }

    /**
     * Sets the value of the associativeRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociativeRelationships }
     *     
     */
    public void setAssociativeRelationships(AssociativeRelationships value) {
        this.associativeRelationships = value;
    }

    /**
     * Gets the value of the descriptiveNotes property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptiveNotes }
     *     
     */
    public DescriptiveNotes getDescriptiveNotes() {
        return descriptiveNotes;
    }

    /**
     * Sets the value of the descriptiveNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptiveNotes }
     *     
     */
    public void setDescriptiveNotes(DescriptiveNotes value) {
        this.descriptiveNotes = value;
    }

    /**
     * Gets the value of the facetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacetCode() {
        return facetCode;
    }

    /**
     * Sets the value of the facetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacetCode(String value) {
        this.facetCode = value;
    }

    /**
     * Gets the value of the mergedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MergedStatusValue }
     *     
     */
    public MergedStatusValue getMergedStatus() {
        return mergedStatus;
    }

    /**
     * Sets the value of the mergedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergedStatusValue }
     *     
     */
    public void setMergedStatus(MergedStatusValue value) {
        this.mergedStatus = value;
    }

    /**
     * Gets the value of the parentRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link ParentRelationships }
     *     
     */
    public ParentRelationships getParentRelationships() {
        return parentRelationships;
    }

    /**
     * Sets the value of the parentRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentRelationships }
     *     
     */
    public void setParentRelationships(ParentRelationships value) {
        this.parentRelationships = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordType(String value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the subjectContributors property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectContributors }
     *     
     */
    public SubjectContributors getSubjectContributors() {
        return subjectContributors;
    }

    /**
     * Sets the value of the subjectContributors property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectContributors }
     *     
     */
    public void setSubjectContributors(SubjectContributors value) {
        this.subjectContributors = value;
    }

    /**
     * Gets the value of the subjectSources property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectSources }
     *     
     */
    public SubjectSources getSubjectSources() {
        return subjectSources;
    }

    /**
     * Sets the value of the subjectSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectSources }
     *     
     */
    public void setSubjectSources(SubjectSources value) {
        this.subjectSources = value;
    }

    /**
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link Terms }
     *     
     */
    public Terms getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terms }
     *     
     */
    public void setTerms(Terms value) {
        this.terms = value;
    }

    /**
     * Gets the value of the subjectID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubjectID() {
        return subjectID;
    }

    /**
     * Sets the value of the subjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubjectID(BigInteger value) {
        this.subjectID = value;
    }

}

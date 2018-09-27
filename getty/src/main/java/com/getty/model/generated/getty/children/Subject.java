
package com.getty.model.generated.getty.children;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="Child_Relationships" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Preferred_Child" type="{}ChildType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Non-Preferred_Child" type="{}ChildType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Subject_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "childRelationships"
})
public class Subject {

    @XmlElement(name = "Child_Relationships")
    protected ChildRelationships childRelationships;
    @XmlAttribute(name = "Subject_ID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String subjectID;

    /**
     * Gets the value of the childRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link ChildRelationships }
     *     
     */
    public ChildRelationships getChildRelationships() {
        return childRelationships;
    }

    /**
     * Sets the value of the childRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildRelationships }
     *     
     */
    public void setChildRelationships(ChildRelationships value) {
        this.childRelationships = value;
    }

    /**
     * Gets the value of the subjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectID() {
        return subjectID;
    }

    /**
     * Sets the value of the subjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectID(String value) {
        this.subjectID = value;
    }

}

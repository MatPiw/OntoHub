
package com.getty.model.generated.getty.subject;

import java.math.BigInteger;
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
 *       &lt;choice>
 *         &lt;element name="VP_Subject_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Contrib_Subject_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vpSubjectID",
    "contribSubjectID"
})
public class RelatedSubjectID {

    @XmlElement(name = "VP_Subject_ID")
    protected BigInteger vpSubjectID;
    @XmlElement(name = "Contrib_Subject_ID")
    protected String contribSubjectID;

    /**
     * Gets the value of the vpSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVPSubjectID() {
        return vpSubjectID;
    }

    /**
     * Sets the value of the vpSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVPSubjectID(BigInteger value) {
        this.vpSubjectID = value;
    }

    /**
     * Gets the value of the contribSubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContribSubjectID() {
        return contribSubjectID;
    }

    /**
     * Sets the value of the contribSubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContribSubjectID(String value) {
        this.contribSubjectID = value;
    }

}

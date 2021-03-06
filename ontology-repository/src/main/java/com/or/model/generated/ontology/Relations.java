
package com.or.model.generated.ontology;

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
 *         &lt;element name="RELATION" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PROPERTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PROPERTY_WEIGHT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="REVERSE_PROPERTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="REVERSE_PROPERTY_WEIGHT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="RANGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DOMAIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SYMMETRIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
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
    "relation"
})
public class Relations {

    @XmlElement(name = "RELATION")
    protected List<Relation> relation;

    /**
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRELATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Relation }
     * 
     * 
     */
    public List<Relation> getRELATION() {
        if (relation == null) {
            relation = new ArrayList<Relation>();
        }
        return this.relation;
    }

}

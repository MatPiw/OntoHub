
package com.getty.model.generated.getty.subject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Merged_Status_Value.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Merged_Status_Value">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Merged"/>
 *     &lt;enumeration value="Not Merged"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Merged_Status_Value")
@XmlEnum
public enum MergedStatusValue {

    @XmlEnumValue("Merged")
    MERGED("Merged"),
    @XmlEnumValue("Not Merged")
    NOT_MERGED("Not Merged");
    private final String value;

    MergedStatusValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MergedStatusValue fromValue(String v) {
        for (MergedStatusValue c: MergedStatusValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

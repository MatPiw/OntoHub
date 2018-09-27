
package com.getty.model.generated.getty.subject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Historic_Flag_Value.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Historic_Flag_Value">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Both"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Historical"/>
 *     &lt;enumeration value="N/A"/>
 *     &lt;enumeration value="Undetermined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Historic_Flag_Value")
@XmlEnum
public enum HistoricFlagValue {

    @XmlEnumValue("Both")
    BOTH("Both"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Historical")
    HISTORICAL("Historical"),
    @XmlEnumValue("N/A")
    N_A("N/A"),
    @XmlEnumValue("Undetermined")
    UNDETERMINED("Undetermined");
    private final String value;

    HistoricFlagValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HistoricFlagValue fromValue(String v) {
        for (HistoricFlagValue c: HistoricFlagValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

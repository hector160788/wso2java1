
package com.ws.att.interf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enumFlujoPantallaAF.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="enumFlujoPantallaAF"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACD5_1"/&gt;
 *     &lt;enumeration value="ACD5_2"/&gt;
 *     &lt;enumeration value="ACD5_3"/&gt;
 *     &lt;enumeration value="ACD5_4"/&gt;
 *     &lt;enumeration value="ACD5_5"/&gt;
 *     &lt;enumeration value="ACD5_6"/&gt;
 *     &lt;enumeration value="ACD5_7"/&gt;
 *     &lt;enumeration value="ACD5_99"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumFlujoPantallaAF")
@XmlEnum
public enum EnumFlujoPantallaAF {

    @XmlEnumValue("ACD5_1")
    ACD_5_1("ACD5_1"),
    @XmlEnumValue("ACD5_2")
    ACD_5_2("ACD5_2"),
    @XmlEnumValue("ACD5_3")
    ACD_5_3("ACD5_3"),
    @XmlEnumValue("ACD5_4")
    ACD_5_4("ACD5_4"),
    @XmlEnumValue("ACD5_5")
    ACD_5_5("ACD5_5"),
    @XmlEnumValue("ACD5_6")
    ACD_5_6("ACD5_6"),
    @XmlEnumValue("ACD5_7")
    ACD_5_7("ACD5_7"),
    @XmlEnumValue("ACD5_99")
    ACD_5_99("ACD5_99");
    private final String value;

    EnumFlujoPantallaAF(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumFlujoPantallaAF fromValue(String v) {
        for (EnumFlujoPantallaAF c: EnumFlujoPantallaAF.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

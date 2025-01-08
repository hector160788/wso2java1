
package com.ws.att.interf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoEnvio.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tipoEnvio"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *     &lt;enumeration value="WHATSAPP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoEnvio")
@XmlEnum
public enum TipoEnvio {

    EMAIL,
    SMS,
    WHATSAPP;

    public String value() {
        return name();
    }

    public static TipoEnvio fromValue(String v) {
        return valueOf(v);
    }

}

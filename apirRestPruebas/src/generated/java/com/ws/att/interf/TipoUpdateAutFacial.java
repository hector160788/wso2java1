
package com.ws.att.interf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoUpdateAutFacial.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="tipoUpdateAutFacial"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTENTO"/&gt;
 *     &lt;enumeration value="EXITO"/&gt;
 *     &lt;enumeration value="AGOTADO"/&gt;
 *     &lt;enumeration value="FALLIDO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoUpdateAutFacial")
@XmlEnum
public enum TipoUpdateAutFacial {

    INTENTO,
    EXITO,
    AGOTADO,
    FALLIDO;

    public String value() {
        return name();
    }

    public static TipoUpdateAutFacial fromValue(String v) {
        return valueOf(v);
    }

}


package com.ws.att.interf;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rulesSimRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rulesSimRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rules" type="{http://interf.att.ws.com/}aamWebSimRules" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rulesSimRequest", propOrder = {
    "rules"
})
public class RulesSimRequest {

    protected AamWebSimRules rules;

    /**
     * Obtiene el valor de la propiedad rules.
     * 
     * @return
     *     possible object is
     *     {@link AamWebSimRules }
     *     
     */
    public AamWebSimRules getRules() {
        return rules;
    }

    /**
     * Define el valor de la propiedad rules.
     * 
     * @param value
     *     allowed object is
     *     {@link AamWebSimRules }
     *     
     */
    public void setRules(AamWebSimRules value) {
        this.rules = value;
    }

}

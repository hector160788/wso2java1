
package com.ws.att.interf;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamWebCatMetFl complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamWebCatMetFl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCatMetFl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="idMetFl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamWebCatMetFl", propOrder = {
    "idCatMetFl",
    "idMetFl",
    "nombre"
})
public class AamWebCatMetFl {

    protected BigDecimal idCatMetFl;
    protected String idMetFl;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad idCatMetFl.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdCatMetFl() {
        return idCatMetFl;
    }

    /**
     * Define el valor de la propiedad idCatMetFl.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdCatMetFl(BigDecimal value) {
        this.idCatMetFl = value;
    }

    /**
     * Obtiene el valor de la propiedad idMetFl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMetFl() {
        return idMetFl;
    }

    /**
     * Define el valor de la propiedad idMetFl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMetFl(String value) {
        this.idMetFl = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}

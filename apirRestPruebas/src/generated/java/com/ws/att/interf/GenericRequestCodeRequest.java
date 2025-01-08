
package com.ws.att.interf;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para genericRequestCodeRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="genericRequestCodeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxIntentosR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxIntentosV" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroDn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoNotificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txtMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vigencia" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericRequestCodeRequest", propOrder = {
    "maxIntentosR",
    "maxIntentosV",
    "nombreSistema",
    "numeroDn",
    "tipoNotificacion",
    "txtMsg",
    "usuario",
    "vigencia"
})
public class GenericRequestCodeRequest {

    protected int maxIntentosR;
    protected int maxIntentosV;
    protected String nombreSistema;
    protected String numeroDn;
    protected String tipoNotificacion;
    protected String txtMsg;
    protected String usuario;
    protected int vigencia;

    /**
     * Obtiene el valor de la propiedad maxIntentosR.
     * 
     */
    public int getMaxIntentosR() {
        return maxIntentosR;
    }

    /**
     * Define el valor de la propiedad maxIntentosR.
     * 
     */
    public void setMaxIntentosR(int value) {
        this.maxIntentosR = value;
    }

    /**
     * Obtiene el valor de la propiedad maxIntentosV.
     * 
     */
    public int getMaxIntentosV() {
        return maxIntentosV;
    }

    /**
     * Define el valor de la propiedad maxIntentosV.
     * 
     */
    public void setMaxIntentosV(int value) {
        this.maxIntentosV = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreSistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreSistema() {
        return nombreSistema;
    }

    /**
     * Define el valor de la propiedad nombreSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreSistema(String value) {
        this.nombreSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDn() {
        return numeroDn;
    }

    /**
     * Define el valor de la propiedad numeroDn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDn(String value) {
        this.numeroDn = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    /**
     * Define el valor de la propiedad tipoNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNotificacion(String value) {
        this.tipoNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad txtMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtMsg() {
        return txtMsg;
    }

    /**
     * Define el valor de la propiedad txtMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtMsg(String value) {
        this.txtMsg = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad vigencia.
     * 
     */
    public int getVigencia() {
        return vigencia;
    }

    /**
     * Define el valor de la propiedad vigencia.
     * 
     */
    public void setVigencia(int value) {
        this.vigencia = value;
    }

}


package com.ws.att.interf;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamWebDeleteInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamWebDeleteInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aamDateDeleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="aamExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaCancelacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaInsert" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="icasDateDeleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="icasExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idDelete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="orderCRM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tipoBorrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webHookDateDeleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="webHookExist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamWebDeleteInfo", propOrder = {
    "aamDateDeleted",
    "aamExist",
    "customer",
    "fechaCancelacion",
    "fechaInsert",
    "icasDateDeleted",
    "icasExist",
    "idDelete",
    "orderCRM",
    "tipoBorrado",
    "webHookDateDeleted",
    "webHookExist"
})
public class AamWebDeleteInfo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aamDateDeleted;
    protected String aamExist;
    protected String customer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCancelacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInsert;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar icasDateDeleted;
    protected String icasExist;
    protected BigDecimal idDelete;
    protected BigDecimal orderCRM;
    protected String tipoBorrado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar webHookDateDeleted;
    protected String webHookExist;

    /**
     * Obtiene el valor de la propiedad aamDateDeleted.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAamDateDeleted() {
        return aamDateDeleted;
    }

    /**
     * Define el valor de la propiedad aamDateDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAamDateDeleted(XMLGregorianCalendar value) {
        this.aamDateDeleted = value;
    }

    /**
     * Obtiene el valor de la propiedad aamExist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAamExist() {
        return aamExist;
    }

    /**
     * Define el valor de la propiedad aamExist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAamExist(String value) {
        this.aamExist = value;
    }

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCancelacion() {
        return fechaCancelacion;
    }

    /**
     * Define el valor de la propiedad fechaCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCancelacion(XMLGregorianCalendar value) {
        this.fechaCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInsert.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInsert() {
        return fechaInsert;
    }

    /**
     * Define el valor de la propiedad fechaInsert.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInsert(XMLGregorianCalendar value) {
        this.fechaInsert = value;
    }

    /**
     * Obtiene el valor de la propiedad icasDateDeleted.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIcasDateDeleted() {
        return icasDateDeleted;
    }

    /**
     * Define el valor de la propiedad icasDateDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIcasDateDeleted(XMLGregorianCalendar value) {
        this.icasDateDeleted = value;
    }

    /**
     * Obtiene el valor de la propiedad icasExist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcasExist() {
        return icasExist;
    }

    /**
     * Define el valor de la propiedad icasExist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcasExist(String value) {
        this.icasExist = value;
    }

    /**
     * Obtiene el valor de la propiedad idDelete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdDelete() {
        return idDelete;
    }

    /**
     * Define el valor de la propiedad idDelete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdDelete(BigDecimal value) {
        this.idDelete = value;
    }

    /**
     * Obtiene el valor de la propiedad orderCRM.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderCRM() {
        return orderCRM;
    }

    /**
     * Define el valor de la propiedad orderCRM.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderCRM(BigDecimal value) {
        this.orderCRM = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoBorrado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBorrado() {
        return tipoBorrado;
    }

    /**
     * Define el valor de la propiedad tipoBorrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBorrado(String value) {
        this.tipoBorrado = value;
    }

    /**
     * Obtiene el valor de la propiedad webHookDateDeleted.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWebHookDateDeleted() {
        return webHookDateDeleted;
    }

    /**
     * Define el valor de la propiedad webHookDateDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWebHookDateDeleted(XMLGregorianCalendar value) {
        this.webHookDateDeleted = value;
    }

    /**
     * Obtiene el valor de la propiedad webHookExist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebHookExist() {
        return webHookExist;
    }

    /**
     * Define el valor de la propiedad webHookExist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebHookExist(String value) {
        this.webHookExist = value;
    }

}

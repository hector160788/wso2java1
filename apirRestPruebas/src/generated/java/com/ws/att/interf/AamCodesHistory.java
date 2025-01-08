
package com.ws.att.interf;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamCodesHistory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamCodesHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aamCatResponseCode" type="{http://interf.att.ws.com/}aamCatResponseCode" minOccurs="0"/&gt;
 *         &lt;element name="aamCodesOrders" type="{http://interf.att.ws.com/}aamCodesOrders" minOccurs="0"/&gt;
 *         &lt;element name="attemptNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dateEvent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forwardNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="idCodesHistory" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeAut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validateNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamCodesHistory", propOrder = {
    "aamCatResponseCode",
    "aamCodesOrders",
    "attemptNumber",
    "dateEvent",
    "dn",
    "forwardNumber",
    "idCodesHistory",
    "status",
    "typeAut",
    "usuario",
    "validateNumber"
})
public class AamCodesHistory {

    protected AamCatResponseCode aamCatResponseCode;
    protected AamCodesOrders aamCodesOrders;
    protected Long attemptNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEvent;
    protected String dn;
    protected Long forwardNumber;
    protected BigDecimal idCodesHistory;
    protected String status;
    protected String typeAut;
    protected String usuario;
    protected Long validateNumber;

    /**
     * Obtiene el valor de la propiedad aamCatResponseCode.
     * 
     * @return
     *     possible object is
     *     {@link AamCatResponseCode }
     *     
     */
    public AamCatResponseCode getAamCatResponseCode() {
        return aamCatResponseCode;
    }

    /**
     * Define el valor de la propiedad aamCatResponseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AamCatResponseCode }
     *     
     */
    public void setAamCatResponseCode(AamCatResponseCode value) {
        this.aamCatResponseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad aamCodesOrders.
     * 
     * @return
     *     possible object is
     *     {@link AamCodesOrders }
     *     
     */
    public AamCodesOrders getAamCodesOrders() {
        return aamCodesOrders;
    }

    /**
     * Define el valor de la propiedad aamCodesOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link AamCodesOrders }
     *     
     */
    public void setAamCodesOrders(AamCodesOrders value) {
        this.aamCodesOrders = value;
    }

    /**
     * Obtiene el valor de la propiedad attemptNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttemptNumber() {
        return attemptNumber;
    }

    /**
     * Define el valor de la propiedad attemptNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttemptNumber(Long value) {
        this.attemptNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad dateEvent.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEvent() {
        return dateEvent;
    }

    /**
     * Define el valor de la propiedad dateEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEvent(XMLGregorianCalendar value) {
        this.dateEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad dn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDn() {
        return dn;
    }

    /**
     * Define el valor de la propiedad dn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDn(String value) {
        this.dn = value;
    }

    /**
     * Obtiene el valor de la propiedad forwardNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getForwardNumber() {
        return forwardNumber;
    }

    /**
     * Define el valor de la propiedad forwardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setForwardNumber(Long value) {
        this.forwardNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad idCodesHistory.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdCodesHistory() {
        return idCodesHistory;
    }

    /**
     * Define el valor de la propiedad idCodesHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdCodesHistory(BigDecimal value) {
        this.idCodesHistory = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad typeAut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAut() {
        return typeAut;
    }

    /**
     * Define el valor de la propiedad typeAut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAut(String value) {
        this.typeAut = value;
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
     * Obtiene el valor de la propiedad validateNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValidateNumber() {
        return validateNumber;
    }

    /**
     * Define el valor de la propiedad validateNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValidateNumber(Long value) {
        this.validateNumber = value;
    }

}

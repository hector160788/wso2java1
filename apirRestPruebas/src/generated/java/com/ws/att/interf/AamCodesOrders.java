
package com.ws.att.interf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamCodesOrders complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamCodesOrders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aamCodesHistories" type="{http://interf.att.ws.com/}aamCodesHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="biometric_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateInsert" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateUsed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dnWarning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idCodeOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="maxAttemptsR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxAttemptsV" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="notificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderAam" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="posId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="textMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamCodesOrders", propOrder = {
    "aamCodesHistories",
    "account",
    "biometricFlag",
    "code",
    "contactId",
    "dateInsert",
    "dateUsed",
    "dnWarning",
    "email",
    "expirationDate",
    "idCodeOrder",
    "maxAttemptsR",
    "maxAttemptsV",
    "notificationType",
    "orderAam",
    "posId",
    "reasonCode",
    "system",
    "textMsg"
})
public class AamCodesOrders {

    @XmlElement(nillable = true)
    protected List<AamCodesHistory> aamCodesHistories;
    protected String account;
    @XmlElement(name = "biometric_flag")
    protected String biometricFlag;
    protected int code;
    protected String contactId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateInsert;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUsed;
    protected String dnWarning;
    protected String email;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected BigDecimal idCodeOrder;
    protected int maxAttemptsR;
    protected int maxAttemptsV;
    protected String notificationType;
    protected BigDecimal orderAam;
    protected String posId;
    protected String reasonCode;
    protected String system;
    protected String textMsg;

    /**
     * Gets the value of the aamCodesHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aamCodesHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAamCodesHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamCodesHistory }
     * 
     * 
     */
    public List<AamCodesHistory> getAamCodesHistories() {
        if (aamCodesHistories == null) {
            aamCodesHistories = new ArrayList<AamCodesHistory>();
        }
        return this.aamCodesHistories;
    }

    /**
     * Obtiene el valor de la propiedad account.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Define el valor de la propiedad account.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Obtiene el valor de la propiedad biometricFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiometricFlag() {
        return biometricFlag;
    }

    /**
     * Define el valor de la propiedad biometricFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiometricFlag(String value) {
        this.biometricFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad contactId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Define el valor de la propiedad contactId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Obtiene el valor de la propiedad dateInsert.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateInsert() {
        return dateInsert;
    }

    /**
     * Define el valor de la propiedad dateInsert.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateInsert(XMLGregorianCalendar value) {
        this.dateInsert = value;
    }

    /**
     * Obtiene el valor de la propiedad dateUsed.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUsed() {
        return dateUsed;
    }

    /**
     * Define el valor de la propiedad dateUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUsed(XMLGregorianCalendar value) {
        this.dateUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad dnWarning.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnWarning() {
        return dnWarning;
    }

    /**
     * Define el valor de la propiedad dnWarning.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnWarning(String value) {
        this.dnWarning = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define el valor de la propiedad expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad idCodeOrder.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdCodeOrder() {
        return idCodeOrder;
    }

    /**
     * Define el valor de la propiedad idCodeOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdCodeOrder(BigDecimal value) {
        this.idCodeOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad maxAttemptsR.
     * 
     */
    public int getMaxAttemptsR() {
        return maxAttemptsR;
    }

    /**
     * Define el valor de la propiedad maxAttemptsR.
     * 
     */
    public void setMaxAttemptsR(int value) {
        this.maxAttemptsR = value;
    }

    /**
     * Obtiene el valor de la propiedad maxAttemptsV.
     * 
     */
    public int getMaxAttemptsV() {
        return maxAttemptsV;
    }

    /**
     * Define el valor de la propiedad maxAttemptsV.
     * 
     */
    public void setMaxAttemptsV(int value) {
        this.maxAttemptsV = value;
    }

    /**
     * Obtiene el valor de la propiedad notificationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Define el valor de la propiedad notificationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationType(String value) {
        this.notificationType = value;
    }

    /**
     * Obtiene el valor de la propiedad orderAam.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderAam() {
        return orderAam;
    }

    /**
     * Define el valor de la propiedad orderAam.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderAam(BigDecimal value) {
        this.orderAam = value;
    }

    /**
     * Obtiene el valor de la propiedad posId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosId() {
        return posId;
    }

    /**
     * Define el valor de la propiedad posId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosId(String value) {
        this.posId = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad system.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Define el valor de la propiedad system.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

    /**
     * Obtiene el valor de la propiedad textMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextMsg() {
        return textMsg;
    }

    /**
     * Define el valor de la propiedad textMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextMsg(String value) {
        this.textMsg = value;
    }

}

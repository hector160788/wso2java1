
package com.ws.att.interf;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para requestApplyCodeVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="requestApplyCodeVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="biometricFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeGenerated" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dynamicCodeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="history" type="{http://interf.att.ws.com/}aamCodesHistory" minOccurs="0"/&gt;
 *         &lt;element name="lineasCuenta" type="{http://interf.att.ws.com/}lineInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mdnToCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orders" type="{http://interf.att.ws.com/}aamCodesOrders" minOccurs="0"/&gt;
 *         &lt;element name="pos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonApply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reenvio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="representativeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestApplyCodeVO", propOrder = {
    "biometricFlag",
    "codeGenerated",
    "contact",
    "customer",
    "dynamicCodeFlag",
    "history",
    "lineasCuenta",
    "mdnToCheck",
    "order",
    "orders",
    "pos",
    "reasonApply",
    "reenvio",
    "representativeId",
    "salesChannel",
    "system"
})
public class RequestApplyCodeVO {

    protected String biometricFlag;
    protected int codeGenerated;
    protected String contact;
    protected String customer;
    protected String dynamicCodeFlag;
    protected AamCodesHistory history;
    @XmlElement(nillable = true)
    protected List<LineInformation> lineasCuenta;
    protected String mdnToCheck;
    protected String order;
    protected AamCodesOrders orders;
    protected String pos;
    protected String reasonApply;
    protected boolean reenvio;
    protected String representativeId;
    protected String salesChannel;
    protected String system;

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
     * Obtiene el valor de la propiedad codeGenerated.
     * 
     */
    public int getCodeGenerated() {
        return codeGenerated;
    }

    /**
     * Define el valor de la propiedad codeGenerated.
     * 
     */
    public void setCodeGenerated(int value) {
        this.codeGenerated = value;
    }

    /**
     * Obtiene el valor de la propiedad contact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Define el valor de la propiedad contact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
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
     * Obtiene el valor de la propiedad dynamicCodeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicCodeFlag() {
        return dynamicCodeFlag;
    }

    /**
     * Define el valor de la propiedad dynamicCodeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicCodeFlag(String value) {
        this.dynamicCodeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad history.
     * 
     * @return
     *     possible object is
     *     {@link AamCodesHistory }
     *     
     */
    public AamCodesHistory getHistory() {
        return history;
    }

    /**
     * Define el valor de la propiedad history.
     * 
     * @param value
     *     allowed object is
     *     {@link AamCodesHistory }
     *     
     */
    public void setHistory(AamCodesHistory value) {
        this.history = value;
    }

    /**
     * Gets the value of the lineasCuenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lineasCuenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineasCuenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineInformation }
     * 
     * 
     */
    public List<LineInformation> getLineasCuenta() {
        if (lineasCuenta == null) {
            lineasCuenta = new ArrayList<LineInformation>();
        }
        return this.lineasCuenta;
    }

    /**
     * Obtiene el valor de la propiedad mdnToCheck.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdnToCheck() {
        return mdnToCheck;
    }

    /**
     * Define el valor de la propiedad mdnToCheck.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdnToCheck(String value) {
        this.mdnToCheck = value;
    }

    /**
     * Obtiene el valor de la propiedad order.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Obtiene el valor de la propiedad orders.
     * 
     * @return
     *     possible object is
     *     {@link AamCodesOrders }
     *     
     */
    public AamCodesOrders getOrders() {
        return orders;
    }

    /**
     * Define el valor de la propiedad orders.
     * 
     * @param value
     *     allowed object is
     *     {@link AamCodesOrders }
     *     
     */
    public void setOrders(AamCodesOrders value) {
        this.orders = value;
    }

    /**
     * Obtiene el valor de la propiedad pos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPos() {
        return pos;
    }

    /**
     * Define el valor de la propiedad pos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPos(String value) {
        this.pos = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonApply.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonApply() {
        return reasonApply;
    }

    /**
     * Define el valor de la propiedad reasonApply.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonApply(String value) {
        this.reasonApply = value;
    }

    /**
     * Obtiene el valor de la propiedad reenvio.
     * 
     */
    public boolean isReenvio() {
        return reenvio;
    }

    /**
     * Define el valor de la propiedad reenvio.
     * 
     */
    public void setReenvio(boolean value) {
        this.reenvio = value;
    }

    /**
     * Obtiene el valor de la propiedad representativeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentativeId() {
        return representativeId;
    }

    /**
     * Define el valor de la propiedad representativeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentativeId(String value) {
        this.representativeId = value;
    }

    /**
     * Obtiene el valor de la propiedad salesChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannel() {
        return salesChannel;
    }

    /**
     * Define el valor de la propiedad salesChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannel(String value) {
        this.salesChannel = value;
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

}

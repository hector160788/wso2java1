
package com.ws.att.interf;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamWebSimRules complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamWebSimRules"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idRules" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmented" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statusLines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamWebSimRules", propOrder = {
    "billingType",
    "cusType",
    "endDate",
    "idRules",
    "idUser",
    "offerType",
    "reasonCode",
    "resolution",
    "salesChannel",
    "segmented",
    "startDate",
    "statusLines",
    "statusRule",
    "subType",
    "subsegment"
})
public class AamWebSimRules {

    protected String billingType;
    protected String cusType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected BigDecimal idRules;
    protected String idUser;
    protected String offerType;
    protected String reasonCode;
    protected String resolution;
    protected String salesChannel;
    protected String segmented;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected String statusLines;
    protected String statusRule;
    protected String subType;
    protected String subsegment;

    /**
     * Obtiene el valor de la propiedad billingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingType() {
        return billingType;
    }

    /**
     * Define el valor de la propiedad billingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingType(String value) {
        this.billingType = value;
    }

    /**
     * Obtiene el valor de la propiedad cusType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusType() {
        return cusType;
    }

    /**
     * Define el valor de la propiedad cusType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusType(String value) {
        this.cusType = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad idRules.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdRules() {
        return idRules;
    }

    /**
     * Define el valor de la propiedad idRules.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdRules(BigDecimal value) {
        this.idRules = value;
    }

    /**
     * Obtiene el valor de la propiedad idUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * Define el valor de la propiedad idUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUser(String value) {
        this.idUser = value;
    }

    /**
     * Obtiene el valor de la propiedad offerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferType() {
        return offerType;
    }

    /**
     * Define el valor de la propiedad offerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferType(String value) {
        this.offerType = value;
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
     * Obtiene el valor de la propiedad resolution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Define el valor de la propiedad resolution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
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
     * Obtiene el valor de la propiedad segmented.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmented() {
        return segmented;
    }

    /**
     * Define el valor de la propiedad segmented.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmented(String value) {
        this.segmented = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad statusLines.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusLines() {
        return statusLines;
    }

    /**
     * Define el valor de la propiedad statusLines.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusLines(String value) {
        this.statusLines = value;
    }

    /**
     * Obtiene el valor de la propiedad statusRule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusRule() {
        return statusRule;
    }

    /**
     * Define el valor de la propiedad statusRule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusRule(String value) {
        this.statusRule = value;
    }

    /**
     * Obtiene el valor de la propiedad subType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Define el valor de la propiedad subType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Obtiene el valor de la propiedad subsegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsegment() {
        return subsegment;
    }

    /**
     * Define el valor de la propiedad subsegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsegment(String value) {
        this.subsegment = value;
    }

}

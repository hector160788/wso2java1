
package com.ws.att.interf;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamWebRules complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamWebRules"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autFacial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idMetFl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idRules" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="idTipoAut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineBar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineEar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="offerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmented" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statusLines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "aamWebRules", propOrder = {
    "autFacial",
    "beginLine",
    "billingType",
    "cusType",
    "endDate",
    "endLine",
    "idMetFl",
    "idRules",
    "idTipoAut",
    "idUser",
    "lineBar",
    "lineEar",
    "offerType",
    "reasonCode",
    "salesChannel",
    "segmented",
    "startDate",
    "statusLines",
    "statusRule",
    "subType",
    "subsegment",
    "system"
})
public class AamWebRules {

    protected String autFacial;
    protected String beginLine;
    protected String billingType;
    protected String cusType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String endLine;
    protected String idMetFl;
    protected BigDecimal idRules;
    protected String idTipoAut;
    protected String idUser;
    protected String lineBar;
    protected String lineEar;
    protected String offerType;
    protected String reasonCode;
    protected String salesChannel;
    protected String segmented;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected String statusLines;
    protected String statusRule;
    protected String subType;
    protected String subsegment;
    protected String system;

    /**
     * Obtiene el valor de la propiedad autFacial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutFacial() {
        return autFacial;
    }

    /**
     * Define el valor de la propiedad autFacial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutFacial(String value) {
        this.autFacial = value;
    }

    /**
     * Obtiene el valor de la propiedad beginLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginLine() {
        return beginLine;
    }

    /**
     * Define el valor de la propiedad beginLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginLine(String value) {
        this.beginLine = value;
    }

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
     * Obtiene el valor de la propiedad endLine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndLine() {
        return endLine;
    }

    /**
     * Define el valor de la propiedad endLine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndLine(String value) {
        this.endLine = value;
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
     * Obtiene el valor de la propiedad idTipoAut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTipoAut() {
        return idTipoAut;
    }

    /**
     * Define el valor de la propiedad idTipoAut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTipoAut(String value) {
        this.idTipoAut = value;
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
     * Obtiene el valor de la propiedad lineBar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineBar() {
        return lineBar;
    }

    /**
     * Define el valor de la propiedad lineBar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineBar(String value) {
        this.lineBar = value;
    }

    /**
     * Obtiene el valor de la propiedad lineEar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineEar() {
        return lineEar;
    }

    /**
     * Define el valor de la propiedad lineEar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineEar(String value) {
        this.lineEar = value;
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


package com.ws.att.interf;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamWebCatRSC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamWebCatRSC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applyDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idChannel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nameChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeExpirate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamWebCatRSC", propOrder = {
    "applyDCode",
    "codeChannel",
    "creationDate",
    "idChannel",
    "nameChannel",
    "timeExpirate"
})
public class AamWebCatRSC {

    protected String applyDCode;
    protected String codeChannel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected BigDecimal idChannel;
    protected String nameChannel;
    protected String timeExpirate;

    /**
     * Obtiene el valor de la propiedad applyDCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyDCode() {
        return applyDCode;
    }

    /**
     * Define el valor de la propiedad applyDCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyDCode(String value) {
        this.applyDCode = value;
    }

    /**
     * Obtiene el valor de la propiedad codeChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeChannel() {
        return codeChannel;
    }

    /**
     * Define el valor de la propiedad codeChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeChannel(String value) {
        this.codeChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad idChannel.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdChannel() {
        return idChannel;
    }

    /**
     * Define el valor de la propiedad idChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdChannel(BigDecimal value) {
        this.idChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad nameChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameChannel() {
        return nameChannel;
    }

    /**
     * Define el valor de la propiedad nameChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameChannel(String value) {
        this.nameChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad timeExpirate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeExpirate() {
        return timeExpirate;
    }

    /**
     * Define el valor de la propiedad timeExpirate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeExpirate(String value) {
        this.timeExpirate = value;
    }

}

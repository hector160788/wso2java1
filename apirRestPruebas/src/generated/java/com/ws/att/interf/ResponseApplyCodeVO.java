
package com.ws.att.interf;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para responseApplyCodeVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="responseApplyCodeVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonApply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseApplyCodeVO", propOrder = {
    "message",
    "messageCode",
    "orderReason",
    "reasonApply"
})
public class ResponseApplyCodeVO {

    protected String message;
    protected String messageCode;
    protected String orderReason;
    protected String reasonApply;

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad messageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Define el valor de la propiedad messageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Obtiene el valor de la propiedad orderReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReason() {
        return orderReason;
    }

    /**
     * Define el valor de la propiedad orderReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReason(String value) {
        this.orderReason = value;
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

}

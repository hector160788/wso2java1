
package com.ws.att.interf;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamWebCatSG complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamWebCatSG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idSegment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nameSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamWebCatSG", propOrder = {
    "codeSegment",
    "creationDate",
    "idSegment",
    "nameSegment"
})
public class AamWebCatSG {

    protected String codeSegment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected BigDecimal idSegment;
    protected String nameSegment;

    /**
     * Obtiene el valor de la propiedad codeSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSegment() {
        return codeSegment;
    }

    /**
     * Define el valor de la propiedad codeSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSegment(String value) {
        this.codeSegment = value;
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
     * Obtiene el valor de la propiedad idSegment.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdSegment() {
        return idSegment;
    }

    /**
     * Define el valor de la propiedad idSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdSegment(BigDecimal value) {
        this.idSegment = value;
    }

    /**
     * Obtiene el valor de la propiedad nameSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSegment() {
        return nameSegment;
    }

    /**
     * Define el valor de la propiedad nameSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSegment(String value) {
        this.nameSegment = value;
    }

}

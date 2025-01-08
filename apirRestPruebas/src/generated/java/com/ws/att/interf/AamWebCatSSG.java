
package com.ws.att.interf;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamWebCatSSG complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamWebCatSSG"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeSubsegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idSubsegment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nameSubsegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamWebCatSSG", propOrder = {
    "codeSegment",
    "codeSubsegment",
    "creationDate",
    "idSubsegment",
    "nameSubsegment"
})
public class AamWebCatSSG {

    protected String codeSegment;
    protected String codeSubsegment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected BigDecimal idSubsegment;
    protected String nameSubsegment;

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
     * Obtiene el valor de la propiedad codeSubsegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSubsegment() {
        return codeSubsegment;
    }

    /**
     * Define el valor de la propiedad codeSubsegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSubsegment(String value) {
        this.codeSubsegment = value;
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
     * Obtiene el valor de la propiedad idSubsegment.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdSubsegment() {
        return idSubsegment;
    }

    /**
     * Define el valor de la propiedad idSubsegment.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdSubsegment(BigDecimal value) {
        this.idSubsegment = value;
    }

    /**
     * Obtiene el valor de la propiedad nameSubsegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSubsegment() {
        return nameSubsegment;
    }

    /**
     * Define el valor de la propiedad nameSubsegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSubsegment(String value) {
        this.nameSubsegment = value;
    }

}

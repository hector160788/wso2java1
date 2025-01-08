
package com.ws.att.interf;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamWebCatCST complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamWebCatCST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeCustype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idSubtype" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nameSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamWebCatCST", propOrder = {
    "codeCustype",
    "codeSubtype",
    "creationDate",
    "idSubtype",
    "nameSubtype"
})
public class AamWebCatCST {

    protected String codeCustype;
    protected String codeSubtype;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected BigDecimal idSubtype;
    protected String nameSubtype;

    /**
     * Obtiene el valor de la propiedad codeCustype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCustype() {
        return codeCustype;
    }

    /**
     * Define el valor de la propiedad codeCustype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCustype(String value) {
        this.codeCustype = value;
    }

    /**
     * Obtiene el valor de la propiedad codeSubtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSubtype() {
        return codeSubtype;
    }

    /**
     * Define el valor de la propiedad codeSubtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSubtype(String value) {
        this.codeSubtype = value;
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
     * Obtiene el valor de la propiedad idSubtype.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdSubtype() {
        return idSubtype;
    }

    /**
     * Define el valor de la propiedad idSubtype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdSubtype(BigDecimal value) {
        this.idSubtype = value;
    }

    /**
     * Obtiene el valor de la propiedad nameSubtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSubtype() {
        return nameSubtype;
    }

    /**
     * Define el valor de la propiedad nameSubtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSubtype(String value) {
        this.nameSubtype = value;
    }

}

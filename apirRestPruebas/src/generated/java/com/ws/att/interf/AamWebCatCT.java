
package com.ws.att.interf;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamWebCatCT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamWebCatCT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeCustype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idCustype" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nameCustype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamWebCatCT", propOrder = {
    "codeCustype",
    "creationDate",
    "idCustype",
    "nameCustype"
})
public class AamWebCatCT {

    protected String codeCustype;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected BigDecimal idCustype;
    protected String nameCustype;

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
     * Obtiene el valor de la propiedad idCustype.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdCustype() {
        return idCustype;
    }

    /**
     * Define el valor de la propiedad idCustype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdCustype(BigDecimal value) {
        this.idCustype = value;
    }

    /**
     * Obtiene el valor de la propiedad nameCustype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCustype() {
        return nameCustype;
    }

    /**
     * Define el valor de la propiedad nameCustype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCustype(String value) {
        this.nameCustype = value;
    }

}

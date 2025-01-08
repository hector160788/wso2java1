
package com.ws.att.interf;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para aamWebCatOT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="aamWebCatOT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeOftype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idOftype" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="isExcluded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameOftype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aamWebCatOT", propOrder = {
    "codeOftype",
    "creationDate",
    "fechaModificacion",
    "idOftype",
    "isExcluded",
    "nameOftype",
    "usuario"
})
public class AamWebCatOT {

    protected String codeOftype;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModificacion;
    protected BigDecimal idOftype;
    protected String isExcluded;
    protected String nameOftype;
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad codeOftype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOftype() {
        return codeOftype;
    }

    /**
     * Define el valor de la propiedad codeOftype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOftype(String value) {
        this.codeOftype = value;
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
     * Obtiene el valor de la propiedad fechaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Define el valor de la propiedad fechaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaModificacion(XMLGregorianCalendar value) {
        this.fechaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idOftype.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdOftype() {
        return idOftype;
    }

    /**
     * Define el valor de la propiedad idOftype.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdOftype(BigDecimal value) {
        this.idOftype = value;
    }

    /**
     * Obtiene el valor de la propiedad isExcluded.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsExcluded() {
        return isExcluded;
    }

    /**
     * Define el valor de la propiedad isExcluded.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsExcluded(String value) {
        this.isExcluded = value;
    }

    /**
     * Obtiene el valor de la propiedad nameOftype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOftype() {
        return nameOftype;
    }

    /**
     * Define el valor de la propiedad nameOftype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOftype(String value) {
        this.nameOftype = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}


package com.ws.att.interf;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertToDeleteInfoTableResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertToDeleteInfoTableResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="existentes" type="{http://interf.att.ws.com/}aamWebDeleteInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listaInsertados" type="{http://interf.att.ws.com/}aamWebDeleteInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listaNoInsertados" type="{http://interf.att.ws.com/}aamWebDeleteInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertToDeleteInfoTableResponse", propOrder = {
    "existentes",
    "listaInsertados",
    "listaNoInsertados"
})
public class InsertToDeleteInfoTableResponse {

    @XmlElement(nillable = true)
    protected List<AamWebDeleteInfo> existentes;
    @XmlElement(nillable = true)
    protected List<AamWebDeleteInfo> listaInsertados;
    @XmlElement(nillable = true)
    protected List<AamWebDeleteInfo> listaNoInsertados;

    /**
     * Gets the value of the existentes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the existentes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExistentes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebDeleteInfo }
     * 
     * 
     */
    public List<AamWebDeleteInfo> getExistentes() {
        if (existentes == null) {
            existentes = new ArrayList<AamWebDeleteInfo>();
        }
        return this.existentes;
    }

    /**
     * Gets the value of the listaInsertados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listaInsertados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaInsertados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebDeleteInfo }
     * 
     * 
     */
    public List<AamWebDeleteInfo> getListaInsertados() {
        if (listaInsertados == null) {
            listaInsertados = new ArrayList<AamWebDeleteInfo>();
        }
        return this.listaInsertados;
    }

    /**
     * Gets the value of the listaNoInsertados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listaNoInsertados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaNoInsertados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebDeleteInfo }
     * 
     * 
     */
    public List<AamWebDeleteInfo> getListaNoInsertados() {
        if (listaNoInsertados == null) {
            listaNoInsertados = new ArrayList<AamWebDeleteInfo>();
        }
        return this.listaNoInsertados;
    }

}

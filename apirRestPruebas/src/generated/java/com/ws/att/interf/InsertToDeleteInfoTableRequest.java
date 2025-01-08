
package com.ws.att.interf;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertToDeleteInfoTableRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertToDeleteInfoTableRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaInsertar" type="{http://interf.att.ws.com/}aamWebDeleteInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertToDeleteInfoTableRequest", propOrder = {
    "listaInsertar"
})
public class InsertToDeleteInfoTableRequest {

    @XmlElement(nillable = true)
    protected List<AamWebDeleteInfo> listaInsertar;

    /**
     * Gets the value of the listaInsertar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listaInsertar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaInsertar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebDeleteInfo }
     * 
     * 
     */
    public List<AamWebDeleteInfo> getListaInsertar() {
        if (listaInsertar == null) {
            listaInsertar = new ArrayList<AamWebDeleteInfo>();
        }
        return this.listaInsertar;
    }

}

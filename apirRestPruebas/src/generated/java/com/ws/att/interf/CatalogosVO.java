
package com.ws.att.interf;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para catalogosVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="catalogosVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catBR" type="{http://interf.att.ws.com/}aamWebCatGen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catBT" type="{http://interf.att.ws.com/}aamWebCatGen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catCst" type="{http://interf.att.ws.com/}aamWebCatCST" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catCt" type="{http://interf.att.ws.com/}aamWebCatCT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catMetFl" type="{http://interf.att.ws.com/}aamWebCatMetFl" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catOt" type="{http://interf.att.ws.com/}aamWebCatOT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catRc" type="{http://interf.att.ws.com/}aamWebCatRC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catRsc" type="{http://interf.att.ws.com/}aamWebCatRSC" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catSL" type="{http://interf.att.ws.com/}aamWebCatGen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catSg" type="{http://interf.att.ws.com/}aamWebCatSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catSsg" type="{http://interf.att.ws.com/}aamWebCatSSG" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="catTipoAut" type="{http://interf.att.ws.com/}aamWebCatGen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paramSCR" type="{http://interf.att.ws.com/}aamWebParamScrDel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogosVO", propOrder = {
    "catBR",
    "catBT",
    "catCst",
    "catCt",
    "catMetFl",
    "catOt",
    "catRc",
    "catRsc",
    "catSL",
    "catSg",
    "catSsg",
    "catTipoAut",
    "paramSCR"
})
public class CatalogosVO {

    @XmlElement(nillable = true)
    protected List<AamWebCatGen> catBR;
    @XmlElement(nillable = true)
    protected List<AamWebCatGen> catBT;
    @XmlElement(nillable = true)
    protected List<AamWebCatCST> catCst;
    @XmlElement(nillable = true)
    protected List<AamWebCatCT> catCt;
    @XmlElement(nillable = true)
    protected List<AamWebCatMetFl> catMetFl;
    @XmlElement(nillable = true)
    protected List<AamWebCatOT> catOt;
    @XmlElement(nillable = true)
    protected List<AamWebCatRC> catRc;
    @XmlElement(nillable = true)
    protected List<AamWebCatRSC> catRsc;
    @XmlElement(nillable = true)
    protected List<AamWebCatGen> catSL;
    @XmlElement(nillable = true)
    protected List<AamWebCatSG> catSg;
    @XmlElement(nillable = true)
    protected List<AamWebCatSSG> catSsg;
    @XmlElement(nillable = true)
    protected List<AamWebCatGen> catTipoAut;
    @XmlElement(nillable = true)
    protected List<AamWebParamScrDel> paramSCR;

    /**
     * Gets the value of the catBR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catBR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatBR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatGen }
     * 
     * 
     */
    public List<AamWebCatGen> getCatBR() {
        if (catBR == null) {
            catBR = new ArrayList<AamWebCatGen>();
        }
        return this.catBR;
    }

    /**
     * Gets the value of the catBT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catBT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatBT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatGen }
     * 
     * 
     */
    public List<AamWebCatGen> getCatBT() {
        if (catBT == null) {
            catBT = new ArrayList<AamWebCatGen>();
        }
        return this.catBT;
    }

    /**
     * Gets the value of the catCst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catCst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatCst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatCST }
     * 
     * 
     */
    public List<AamWebCatCST> getCatCst() {
        if (catCst == null) {
            catCst = new ArrayList<AamWebCatCST>();
        }
        return this.catCst;
    }

    /**
     * Gets the value of the catCt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catCt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatCt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatCT }
     * 
     * 
     */
    public List<AamWebCatCT> getCatCt() {
        if (catCt == null) {
            catCt = new ArrayList<AamWebCatCT>();
        }
        return this.catCt;
    }

    /**
     * Gets the value of the catMetFl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catMetFl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatMetFl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatMetFl }
     * 
     * 
     */
    public List<AamWebCatMetFl> getCatMetFl() {
        if (catMetFl == null) {
            catMetFl = new ArrayList<AamWebCatMetFl>();
        }
        return this.catMetFl;
    }

    /**
     * Gets the value of the catOt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catOt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatOt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatOT }
     * 
     * 
     */
    public List<AamWebCatOT> getCatOt() {
        if (catOt == null) {
            catOt = new ArrayList<AamWebCatOT>();
        }
        return this.catOt;
    }

    /**
     * Gets the value of the catRc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catRc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatRc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatRC }
     * 
     * 
     */
    public List<AamWebCatRC> getCatRc() {
        if (catRc == null) {
            catRc = new ArrayList<AamWebCatRC>();
        }
        return this.catRc;
    }

    /**
     * Gets the value of the catRsc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catRsc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatRsc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatRSC }
     * 
     * 
     */
    public List<AamWebCatRSC> getCatRsc() {
        if (catRsc == null) {
            catRsc = new ArrayList<AamWebCatRSC>();
        }
        return this.catRsc;
    }

    /**
     * Gets the value of the catSL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catSL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatSL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatGen }
     * 
     * 
     */
    public List<AamWebCatGen> getCatSL() {
        if (catSL == null) {
            catSL = new ArrayList<AamWebCatGen>();
        }
        return this.catSL;
    }

    /**
     * Gets the value of the catSg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catSg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatSg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatSG }
     * 
     * 
     */
    public List<AamWebCatSG> getCatSg() {
        if (catSg == null) {
            catSg = new ArrayList<AamWebCatSG>();
        }
        return this.catSg;
    }

    /**
     * Gets the value of the catSsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catSsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatSsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatSSG }
     * 
     * 
     */
    public List<AamWebCatSSG> getCatSsg() {
        if (catSsg == null) {
            catSsg = new ArrayList<AamWebCatSSG>();
        }
        return this.catSsg;
    }

    /**
     * Gets the value of the catTipoAut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catTipoAut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatTipoAut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebCatGen }
     * 
     * 
     */
    public List<AamWebCatGen> getCatTipoAut() {
        if (catTipoAut == null) {
            catTipoAut = new ArrayList<AamWebCatGen>();
        }
        return this.catTipoAut;
    }

    /**
     * Gets the value of the paramSCR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the paramSCR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamSCR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AamWebParamScrDel }
     * 
     * 
     */
    public List<AamWebParamScrDel> getParamSCR() {
        if (paramSCR == null) {
            paramSCR = new ArrayList<AamWebParamScrDel>();
        }
        return this.paramSCR;
    }

}

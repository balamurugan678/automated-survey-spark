
package com.estar.sbe.ws.retrievepnr;

import com.estar.sbe.ws.retrievepnr.input.SearchPnrInput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchPnr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchPnr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchPnrInput" type="{http://input.retrievepnr.ws.sbe.estar.com/}searchPnrInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPnr", propOrder = {
    "searchPnrInput"
})
public class SearchPnr {

    @XmlElement(name = "SearchPnrInput")
    protected SearchPnrInput searchPnrInput;

    /**
     * Gets the value of the searchPnrInput property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPnrInput }
     *     
     */
    public SearchPnrInput getSearchPnrInput() {
        return searchPnrInput;
    }

    /**
     * Sets the value of the searchPnrInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPnrInput }
     *     
     */
    public void setSearchPnrInput(SearchPnrInput value) {
        this.searchPnrInput = value;
    }

}

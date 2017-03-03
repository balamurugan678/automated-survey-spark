
package com.estar.sbe.ws.retrievepnr;

import com.estar.sbe.ws.retrievepnr.output.SearchPnrOutput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchPnrResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchPnrResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchPnrOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}searchPnrOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPnrResponse", propOrder = {
    "searchPnrOutput"
})
public class SearchPnrResponse {

    @XmlElement(name = "SearchPnrOutput")
    protected SearchPnrOutput searchPnrOutput;

    /**
     * Gets the value of the searchPnrOutput property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPnrOutput }
     *     
     */
    public SearchPnrOutput getSearchPnrOutput() {
        return searchPnrOutput;
    }

    /**
     * Sets the value of the searchPnrOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPnrOutput }
     *     
     */
    public void setSearchPnrOutput(SearchPnrOutput value) {
        this.searchPnrOutput = value;
    }

}

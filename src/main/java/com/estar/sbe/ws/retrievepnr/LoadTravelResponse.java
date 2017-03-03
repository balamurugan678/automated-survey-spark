
package com.estar.sbe.ws.retrievepnr;

import com.estar.sbe.ws.retrievepnr.output.LoadTravelOutput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadTravelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadTravelResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoadTravelOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}loadTravelOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadTravelResponse", propOrder = {
    "loadTravelOutput"
})
public class LoadTravelResponse {

    @XmlElement(name = "LoadTravelOutput")
    protected LoadTravelOutput loadTravelOutput;

    /**
     * Gets the value of the loadTravelOutput property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTravelOutput }
     *     
     */
    public LoadTravelOutput getLoadTravelOutput() {
        return loadTravelOutput;
    }

    /**
     * Sets the value of the loadTravelOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTravelOutput }
     *     
     */
    public void setLoadTravelOutput(LoadTravelOutput value) {
        this.loadTravelOutput = value;
    }

}

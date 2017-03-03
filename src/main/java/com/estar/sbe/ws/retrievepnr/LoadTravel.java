
package com.estar.sbe.ws.retrievepnr;

import com.estar.sbe.ws.retrievepnr.input.LoadTravelInput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadTravel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadTravel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoadTravelInput" type="{http://input.retrievepnr.ws.sbe.estar.com/}loadTravelInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadTravel", propOrder = {
    "loadTravelInput"
})
public class LoadTravel {

    @XmlElement(name = "LoadTravelInput")
    protected LoadTravelInput loadTravelInput;

    /**
     * Gets the value of the loadTravelInput property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTravelInput }
     *     
     */
    public LoadTravelInput getLoadTravelInput() {
        return loadTravelInput;
    }

    /**
     * Sets the value of the loadTravelInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTravelInput }
     *     
     */
    public void setLoadTravelInput(LoadTravelInput value) {
        this.loadTravelInput = value;
    }

}

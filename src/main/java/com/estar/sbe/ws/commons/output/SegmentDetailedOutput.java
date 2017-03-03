
package com.estar.sbe.ws.commons.output;

import com.estar.sbe.ws.retrievepnr.output.TravelSegment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentDetailedOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentDetailedOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://output.commons.ws.sbe.estar.com/}segmentBaseOutput"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="marketingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketingCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatingCarrierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatingTrainNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentDetailedOutput", propOrder = {
    "marketingCarrierCode",
    "marketingCarrierName",
    "operatingCarrierCode",
    "operatingCarrierName",
    "operatingTrainNumber"
})
@XmlSeeAlso({
    TravelSegment.class
})
public class SegmentDetailedOutput
    extends SegmentBaseOutput
{

    protected String marketingCarrierCode;
    protected String marketingCarrierName;
    protected String operatingCarrierCode;
    protected String operatingCarrierName;
    protected String operatingTrainNumber;

    /**
     * Gets the value of the marketingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrierCode() {
        return marketingCarrierCode;
    }

    /**
     * Sets the value of the marketingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCarrierCode(String value) {
        this.marketingCarrierCode = value;
    }

    /**
     * Gets the value of the marketingCarrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrierName() {
        return marketingCarrierName;
    }

    /**
     * Sets the value of the marketingCarrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCarrierName(String value) {
        this.marketingCarrierName = value;
    }

    /**
     * Gets the value of the operatingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrierCode() {
        return operatingCarrierCode;
    }

    /**
     * Sets the value of the operatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrierCode(String value) {
        this.operatingCarrierCode = value;
    }

    /**
     * Gets the value of the operatingCarrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrierName() {
        return operatingCarrierName;
    }

    /**
     * Sets the value of the operatingCarrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrierName(String value) {
        this.operatingCarrierName = value;
    }

    /**
     * Gets the value of the operatingTrainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingTrainNumber() {
        return operatingTrainNumber;
    }

    /**
     * Sets the value of the operatingTrainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingTrainNumber(String value) {
        this.operatingTrainNumber = value;
    }

}


package com.estar.sbe.ws.retrievepnr.input;

import com.estar.sbe.ws.commons.LocalDateSbe;
import com.estar.sbe.ws.commons.input.CommonServiceInput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loadTravelInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadTravelInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basicPassengerInformation" type="{http://input.retrievepnr.ws.sbe.estar.com/}basicPassengerInformation" minOccurs="0"/&gt;
 *         &lt;element name="commonService" type="{http://input.commons.ws.sbe.estar.com/}commonServiceInput"/&gt;
 *         &lt;element name="eligibilityAfterSales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eligibilityMod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="history" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnrReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="travelDate" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadTravelInput", propOrder = {
    "basicPassengerInformation",
    "commonService",
    "eligibilityAfterSales",
    "eligibilityMod",
    "history",
    "pnrReference",
    "travelDate"
})
public class LoadTravelInput {

    @XmlElement(nillable = true)
    protected BasicPassengerInformation basicPassengerInformation;
    @XmlElement(required = true)
    protected CommonServiceInput commonService;
    @XmlElement(nillable = true)
    protected String eligibilityAfterSales;
    @XmlElement(nillable = true)
    protected String eligibilityMod;
    @XmlElement(nillable = true)
    protected String history;
    @XmlElement(required = true)
    protected String pnrReference;
    @XmlElement(nillable = true)
    protected LocalDateSbe travelDate;

    /**
     * Gets the value of the basicPassengerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BasicPassengerInformation }
     *     
     */
    public BasicPassengerInformation getBasicPassengerInformation() {
        return basicPassengerInformation;
    }

    /**
     * Sets the value of the basicPassengerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicPassengerInformation }
     *     
     */
    public void setBasicPassengerInformation(BasicPassengerInformation value) {
        this.basicPassengerInformation = value;
    }

    /**
     * Gets the value of the commonService property.
     * 
     * @return
     *     possible object is
     *     {@link CommonServiceInput }
     *     
     */
    public CommonServiceInput getCommonService() {
        return commonService;
    }

    /**
     * Sets the value of the commonService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonServiceInput }
     *     
     */
    public void setCommonService(CommonServiceInput value) {
        this.commonService = value;
    }

    /**
     * Gets the value of the eligibilityAfterSales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityAfterSales() {
        return eligibilityAfterSales;
    }

    /**
     * Sets the value of the eligibilityAfterSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityAfterSales(String value) {
        this.eligibilityAfterSales = value;
    }

    /**
     * Gets the value of the eligibilityMod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityMod() {
        return eligibilityMod;
    }

    /**
     * Sets the value of the eligibilityMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityMod(String value) {
        this.eligibilityMod = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistory(String value) {
        this.history = value;
    }

    /**
     * Gets the value of the pnrReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrReference() {
        return pnrReference;
    }

    /**
     * Sets the value of the pnrReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrReference(String value) {
        this.pnrReference = value;
    }

    /**
     * Gets the value of the travelDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *     
     */
    public LocalDateSbe getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *     
     */
    public void setTravelDate(LocalDateSbe value) {
        this.travelDate = value;
    }

}

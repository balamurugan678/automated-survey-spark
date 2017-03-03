
package com.estar.sbe.ws.retrievepnr.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fareInformationRetrievePnrOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareInformationRetrievePnrOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eligibilityChangeMeal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eligibilityChangeSeat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eligibilityExchange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eligibilityForcedExchange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eligibilityForcedRefund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eligibilityRefund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eligibilityUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fareCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flexibilityLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="maskedPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reducedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareInformationRetrievePnrOutput", propOrder = {
    "classOfService",
    "eligibilityChangeMeal",
    "eligibilityChangeSeat",
    "eligibilityExchange",
    "eligibilityForcedExchange",
    "eligibilityForcedRefund",
    "eligibilityRefund",
    "eligibilityUpgrade",
    "fareCode",
    "flexibilityLevel",
    "maskedPrice",
    "reducedAmount",
    "totalAmount"
})
public class FareInformationRetrievePnrOutput {

    protected String classOfService;
    protected Boolean eligibilityChangeMeal;
    protected Boolean eligibilityChangeSeat;
    protected Boolean eligibilityExchange;
    protected Boolean eligibilityForcedExchange;
    protected Boolean eligibilityForcedRefund;
    protected Boolean eligibilityRefund;
    protected Boolean eligibilityUpgrade;
    protected String fareCode;
    protected Integer flexibilityLevel;
    protected Boolean maskedPrice;
    protected Double reducedAmount;
    protected Double totalAmount;

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the eligibilityChangeMeal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibilityChangeMeal() {
        return eligibilityChangeMeal;
    }

    /**
     * Sets the value of the eligibilityChangeMeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibilityChangeMeal(Boolean value) {
        this.eligibilityChangeMeal = value;
    }

    /**
     * Gets the value of the eligibilityChangeSeat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibilityChangeSeat() {
        return eligibilityChangeSeat;
    }

    /**
     * Sets the value of the eligibilityChangeSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibilityChangeSeat(Boolean value) {
        this.eligibilityChangeSeat = value;
    }

    /**
     * Gets the value of the eligibilityExchange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibilityExchange() {
        return eligibilityExchange;
    }

    /**
     * Sets the value of the eligibilityExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibilityExchange(Boolean value) {
        this.eligibilityExchange = value;
    }

    /**
     * Gets the value of the eligibilityForcedExchange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibilityForcedExchange() {
        return eligibilityForcedExchange;
    }

    /**
     * Sets the value of the eligibilityForcedExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibilityForcedExchange(Boolean value) {
        this.eligibilityForcedExchange = value;
    }

    /**
     * Gets the value of the eligibilityForcedRefund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibilityForcedRefund() {
        return eligibilityForcedRefund;
    }

    /**
     * Sets the value of the eligibilityForcedRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibilityForcedRefund(Boolean value) {
        this.eligibilityForcedRefund = value;
    }

    /**
     * Gets the value of the eligibilityRefund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibilityRefund() {
        return eligibilityRefund;
    }

    /**
     * Sets the value of the eligibilityRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibilityRefund(Boolean value) {
        this.eligibilityRefund = value;
    }

    /**
     * Gets the value of the eligibilityUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibilityUpgrade() {
        return eligibilityUpgrade;
    }

    /**
     * Sets the value of the eligibilityUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibilityUpgrade(Boolean value) {
        this.eligibilityUpgrade = value;
    }

    /**
     * Gets the value of the fareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCode() {
        return fareCode;
    }

    /**
     * Sets the value of the fareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCode(String value) {
        this.fareCode = value;
    }

    /**
     * Gets the value of the flexibilityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlexibilityLevel() {
        return flexibilityLevel;
    }

    /**
     * Sets the value of the flexibilityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlexibilityLevel(Integer value) {
        this.flexibilityLevel = value;
    }

    /**
     * Gets the value of the maskedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaskedPrice() {
        return maskedPrice;
    }

    /**
     * Sets the value of the maskedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaskedPrice(Boolean value) {
        this.maskedPrice = value;
    }

    /**
     * Gets the value of the reducedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReducedAmount() {
        return reducedAmount;
    }

    /**
     * Sets the value of the reducedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReducedAmount(Double value) {
        this.reducedAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
        this.totalAmount = value;
    }

}

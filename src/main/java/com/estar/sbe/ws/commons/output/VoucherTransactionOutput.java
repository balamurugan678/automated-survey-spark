
package com.estar.sbe.ws.commons.output;

import com.estar.sbe.ws.commons.LocalDateSbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voucherTransactionOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voucherTransactionOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionDate" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *         &lt;element name="pspTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voucherTransactionOutput", propOrder = {
    "actionDate",
    "amount",
    "expiryDate",
    "pspTransactionId",
    "voucherId"
})
public class VoucherTransactionOutput {

    protected LocalDateSbe actionDate;
    protected Double amount;
    protected LocalDateSbe expiryDate;
    protected String pspTransactionId;
    protected String voucherId;

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *     
     */
    public LocalDateSbe getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *     
     */
    public void setActionDate(LocalDateSbe value) {
        this.actionDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *     
     */
    public LocalDateSbe getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *     
     */
    public void setExpiryDate(LocalDateSbe value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the pspTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPspTransactionId() {
        return pspTransactionId;
    }

    /**
     * Sets the value of the pspTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPspTransactionId(String value) {
        this.pspTransactionId = value;
    }

    /**
     * Gets the value of the voucherId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherId() {
        return voucherId;
    }

    /**
     * Sets the value of the voucherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherId(String value) {
        this.voucherId = value;
    }

}

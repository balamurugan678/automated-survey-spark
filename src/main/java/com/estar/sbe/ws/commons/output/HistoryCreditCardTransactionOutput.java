
package com.estar.sbe.ws.commons.output;

import com.estar.sbe.ws.commons.LocalDateSbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historyCreditCardTransactionOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="historyCreditCardTransactionOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cardScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditCardSurchage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dccAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dccCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dccExchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *         &lt;element name="pspTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tokenCreditCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historyCreditCardTransactionOutput", propOrder = {
    "amount",
    "cardScheme",
    "creditCardSurchage",
    "dccAmount",
    "dccCurrency",
    "dccExchangeRate",
    "expiryDate",
    "pspTransactionId",
    "tokenCreditCard"
})
public class HistoryCreditCardTransactionOutput {

    protected Double amount;
    protected String cardScheme;
    protected Double creditCardSurchage;
    protected Double dccAmount;
    protected String dccCurrency;
    protected String dccExchangeRate;
    protected LocalDateSbe expiryDate;
    protected String pspTransactionId;
    protected String tokenCreditCard;

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
     * Gets the value of the cardScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardScheme() {
        return cardScheme;
    }

    /**
     * Sets the value of the cardScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardScheme(String value) {
        this.cardScheme = value;
    }

    /**
     * Gets the value of the creditCardSurchage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCreditCardSurchage() {
        return creditCardSurchage;
    }

    /**
     * Sets the value of the creditCardSurchage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCreditCardSurchage(Double value) {
        this.creditCardSurchage = value;
    }

    /**
     * Gets the value of the dccAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDccAmount() {
        return dccAmount;
    }

    /**
     * Sets the value of the dccAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDccAmount(Double value) {
        this.dccAmount = value;
    }

    /**
     * Gets the value of the dccCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccCurrency() {
        return dccCurrency;
    }

    /**
     * Sets the value of the dccCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccCurrency(String value) {
        this.dccCurrency = value;
    }

    /**
     * Gets the value of the dccExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDccExchangeRate() {
        return dccExchangeRate;
    }

    /**
     * Sets the value of the dccExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDccExchangeRate(String value) {
        this.dccExchangeRate = value;
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
     * Gets the value of the tokenCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenCreditCard() {
        return tokenCreditCard;
    }

    /**
     * Sets the value of the tokenCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenCreditCard(String value) {
        this.tokenCreditCard = value;
    }

}

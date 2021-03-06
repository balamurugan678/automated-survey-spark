
package com.estar.sbe.ws.retrievepnr.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eftCertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promocodeInformation" type="{http://output.retrievepnr.ws.sbe.estar.com/}promocodeInformationOutput" minOccurs="0"/&gt;
 *         &lt;element name="providerSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="singleOrReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productOutput", propOrder = {
    "amount",
    "currency",
    "description",
    "eftCertificateNumber",
    "promocodeInformation",
    "providerSystem",
    "reference",
    "singleOrReturn",
    "type"
})
@XmlSeeAlso({
    CreateProductOutput.class,
    DeleteProductOutput.class,
    UpdateProductOutput.class
})
public class ProductOutput {

    protected Double amount;
    protected String currency;
    protected String description;
    protected String eftCertificateNumber;
    protected PromocodeInformationOutput promocodeInformation;
    protected String providerSystem;
    protected String reference;
    protected String singleOrReturn;
    protected String type;

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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the eftCertificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEftCertificateNumber() {
        return eftCertificateNumber;
    }

    /**
     * Sets the value of the eftCertificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEftCertificateNumber(String value) {
        this.eftCertificateNumber = value;
    }

    /**
     * Gets the value of the promocodeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PromocodeInformationOutput }
     *     
     */
    public PromocodeInformationOutput getPromocodeInformation() {
        return promocodeInformation;
    }

    /**
     * Sets the value of the promocodeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromocodeInformationOutput }
     *     
     */
    public void setPromocodeInformation(PromocodeInformationOutput value) {
        this.promocodeInformation = value;
    }

    /**
     * Gets the value of the providerSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderSystem() {
        return providerSystem;
    }

    /**
     * Sets the value of the providerSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderSystem(String value) {
        this.providerSystem = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the singleOrReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleOrReturn() {
        return singleOrReturn;
    }

    /**
     * Sets the value of the singleOrReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleOrReturn(String value) {
        this.singleOrReturn = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}

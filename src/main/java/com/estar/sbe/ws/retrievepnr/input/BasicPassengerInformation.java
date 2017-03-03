
package com.estar.sbe.ws.retrievepnr.input;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basicPassengerInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basicPassengerInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditCardNumberToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eftCinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basicPassengerInformation", propOrder = {
    "creditCardNumberToken",
    "eftCinNumber",
    "emailAdress",
    "lastname"
})
public class BasicPassengerInformation {

    @XmlElement(nillable = true)
    protected String creditCardNumberToken;
    @XmlElement(nillable = true)
    protected String eftCinNumber;
    @XmlElement(nillable = true)
    protected String emailAdress;
    @XmlElement(nillable = true)
    protected String lastname;

    /**
     * Gets the value of the creditCardNumberToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumberToken() {
        return creditCardNumberToken;
    }

    /**
     * Sets the value of the creditCardNumberToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumberToken(String value) {
        this.creditCardNumberToken = value;
    }

    /**
     * Gets the value of the eftCinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEftCinNumber() {
        return eftCinNumber;
    }

    /**
     * Sets the value of the eftCinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEftCinNumber(String value) {
        this.eftCinNumber = value;
    }

    /**
     * Gets the value of the emailAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdress() {
        return emailAdress;
    }

    /**
     * Sets the value of the emailAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAdress(String value) {
        this.emailAdress = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

}

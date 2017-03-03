
package com.estar.sbe.ws.retrievepnr.output;


import com.estar.sbe.ws.commons.output.AncillaryProductBaseOutput;
import com.estar.sbe.ws.commons.output.CommonServiceOutput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for loadTravelOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadTravelOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AncillaryProductBaseOutputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AncillaryProductBaseOutput" type="{http://output.commons.ws.sbe.estar.com/}ancillaryProductBaseOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="commonServiceOutput" type="{http://output.commons.ws.sbe.estar.com/}commonServiceOutput" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://output.retrievepnr.ws.sbe.estar.com/}contactRetrievePnrOutput" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="history" type="{http://output.retrievepnr.ws.sbe.estar.com/}historyOutput" minOccurs="0"/&gt;
 *         &lt;element name="JourneyRetrievePnrOutputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="JourneyRetrievePnrOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}journeyRetrievePnrOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LinkedPnrs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LinkedPnr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PassengerRetrievePnrOutputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PassengerRetrievePnrOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}passengerRetrievePnrOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paymentInformation" type="{http://output.retrievepnr.ws.sbe.estar.com/}paymentInformation" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadTravelOutput", propOrder = {
    "ancillaryProductBaseOutputs",
    "commonServiceOutput",
    "contact",
    "currency",
    "history",
    "journeyRetrievePnrOutputs",
    "linkedPnrs",
    "passengerRetrievePnrOutputs",
    "paymentInformation",
    "pointOfSale",
    "totalPrice"
})
public class LoadTravelOutput {

    @XmlElement(name = "AncillaryProductBaseOutputs")
    protected LoadTravelOutput.AncillaryProductBaseOutputs ancillaryProductBaseOutputs;
    protected CommonServiceOutput commonServiceOutput;
    protected ContactRetrievePnrOutput contact;
    protected String currency;
    protected HistoryOutput history;
    @XmlElement(name = "JourneyRetrievePnrOutputs")
    protected LoadTravelOutput.JourneyRetrievePnrOutputs journeyRetrievePnrOutputs;
    @XmlElement(name = "LinkedPnrs")
    protected LoadTravelOutput.LinkedPnrs linkedPnrs;
    @XmlElement(name = "PassengerRetrievePnrOutputs")
    protected LoadTravelOutput.PassengerRetrievePnrOutputs passengerRetrievePnrOutputs;
    protected PaymentInformation paymentInformation;
    protected String pointOfSale;
    protected Double totalPrice;

    /**
     * Gets the value of the ancillaryProductBaseOutputs property.
     *
     * @return
     *     possible object is
     *     {@link LoadTravelOutput.AncillaryProductBaseOutputs }
     *
     */
    public LoadTravelOutput.AncillaryProductBaseOutputs getAncillaryProductBaseOutputs() {
        return ancillaryProductBaseOutputs;
    }

    /**
     * Sets the value of the ancillaryProductBaseOutputs property.
     *
     * @param value
     *     allowed object is
     *     {@link LoadTravelOutput.AncillaryProductBaseOutputs }
     *
     */
    public void setAncillaryProductBaseOutputs(LoadTravelOutput.AncillaryProductBaseOutputs value) {
        this.ancillaryProductBaseOutputs = value;
    }

    /**
     * Gets the value of the commonServiceOutput property.
     *
     * @return
     *     possible object is
     *     {@link CommonServiceOutput }
     *
     */
    public CommonServiceOutput getCommonServiceOutput() {
        return commonServiceOutput;
    }

    /**
     * Sets the value of the commonServiceOutput property.
     *
     * @param value
     *     allowed object is
     *     {@link CommonServiceOutput }
     *
     */
    public void setCommonServiceOutput(CommonServiceOutput value) {
        this.commonServiceOutput = value;
    }

    /**
     * Gets the value of the contact property.
     *
     * @return
     *     possible object is
     *     {@link ContactRetrievePnrOutput }
     *
     */
    public ContactRetrievePnrOutput getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     *
     * @param value
     *     allowed object is
     *     {@link ContactRetrievePnrOutput }
     *
     */
    public void setContact(ContactRetrievePnrOutput value) {
        this.contact = value;
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
     * Gets the value of the history property.
     *
     * @return
     *     possible object is
     *     {@link HistoryOutput }
     *
     */
    public HistoryOutput getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     *
     * @param value
     *     allowed object is
     *     {@link HistoryOutput }
     *
     */
    public void setHistory(HistoryOutput value) {
        this.history = value;
    }

    /**
     * Gets the value of the journeyRetrievePnrOutputs property.
     *
     * @return
     *     possible object is
     *     {@link LoadTravelOutput.JourneyRetrievePnrOutputs }
     *
     */
    public LoadTravelOutput.JourneyRetrievePnrOutputs getJourneyRetrievePnrOutputs() {
        return journeyRetrievePnrOutputs;
    }

    /**
     * Sets the value of the journeyRetrievePnrOutputs property.
     *
     * @param value
     *     allowed object is
     *     {@link LoadTravelOutput.JourneyRetrievePnrOutputs }
     *
     */
    public void setJourneyRetrievePnrOutputs(LoadTravelOutput.JourneyRetrievePnrOutputs value) {
        this.journeyRetrievePnrOutputs = value;
    }

    /**
     * Gets the value of the linkedPnrs property.
     *
     * @return
     *     possible object is
     *     {@link LoadTravelOutput.LinkedPnrs }
     *
     */
    public LoadTravelOutput.LinkedPnrs getLinkedPnrs() {
        return linkedPnrs;
    }

    /**
     * Sets the value of the linkedPnrs property.
     *
     * @param value
     *     allowed object is
     *     {@link LoadTravelOutput.LinkedPnrs }
     *
     */
    public void setLinkedPnrs(LoadTravelOutput.LinkedPnrs value) {
        this.linkedPnrs = value;
    }

    /**
     * Gets the value of the passengerRetrievePnrOutputs property.
     *
     * @return
     *     possible object is
     *     {@link LoadTravelOutput.PassengerRetrievePnrOutputs }
     *
     */
    public LoadTravelOutput.PassengerRetrievePnrOutputs getPassengerRetrievePnrOutputs() {
        return passengerRetrievePnrOutputs;
    }

    /**
     * Sets the value of the passengerRetrievePnrOutputs property.
     *
     * @param value
     *     allowed object is
     *     {@link LoadTravelOutput.PassengerRetrievePnrOutputs }
     *
     */
    public void setPassengerRetrievePnrOutputs(LoadTravelOutput.PassengerRetrievePnrOutputs value) {
        this.passengerRetrievePnrOutputs = value;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformation }
     *     
     */
    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    /**
     * Sets the value of the paymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformation }
     *     
     */
    public void setPaymentInformation(PaymentInformation value) {
        this.paymentInformation = value;
    }

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSale(String value) {
        this.pointOfSale = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPrice(Double value) {
        this.totalPrice = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AncillaryProductBaseOutput" type="{http://output.commons.ws.sbe.estar.com/}ancillaryProductBaseOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ancillaryProductBaseOutput"
    })
    public static class AncillaryProductBaseOutputs {

        @XmlElement(name = "AncillaryProductBaseOutput")
        protected List<AncillaryProductBaseOutput> ancillaryProductBaseOutput;

        /**
         * Gets the value of the ancillaryProductBaseOutput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ancillaryProductBaseOutput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAncillaryProductBaseOutput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AncillaryProductBaseOutput }
         * 
         * 
         */
        public List<AncillaryProductBaseOutput> getAncillaryProductBaseOutput() {
            if (ancillaryProductBaseOutput == null) {
                ancillaryProductBaseOutput = new ArrayList<AncillaryProductBaseOutput>();
            }
            return this.ancillaryProductBaseOutput;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="JourneyRetrievePnrOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}journeyRetrievePnrOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "journeyRetrievePnrOutput"
    })
    public static class JourneyRetrievePnrOutputs {

        @XmlElement(name = "JourneyRetrievePnrOutput")
        protected List<JourneyRetrievePnrOutput> journeyRetrievePnrOutput;

        /**
         * Gets the value of the journeyRetrievePnrOutput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the journeyRetrievePnrOutput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJourneyRetrievePnrOutput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JourneyRetrievePnrOutput }
         * 
         * 
         */
        public List<JourneyRetrievePnrOutput> getJourneyRetrievePnrOutput() {
            if (journeyRetrievePnrOutput == null) {
                journeyRetrievePnrOutput = new ArrayList<JourneyRetrievePnrOutput>();
            }
            return this.journeyRetrievePnrOutput;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LinkedPnr" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "linkedPnr"
    })
    public static class LinkedPnrs {

        @XmlElement(name = "LinkedPnr")
        protected List<String> linkedPnr;

        /**
         * Gets the value of the linkedPnr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkedPnr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinkedPnr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLinkedPnr() {
            if (linkedPnr == null) {
                linkedPnr = new ArrayList<String>();
            }
            return this.linkedPnr;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PassengerRetrievePnrOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}passengerRetrievePnrOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passengerRetrievePnrOutput"
    })
    public static class PassengerRetrievePnrOutputs {

        @XmlElement(name = "PassengerRetrievePnrOutput")
        protected List<PassengerRetrievePnrOutput> passengerRetrievePnrOutput;

        /**
         * Gets the value of the passengerRetrievePnrOutput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerRetrievePnrOutput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerRetrievePnrOutput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PassengerRetrievePnrOutput }
         * 
         * 
         */
        public List<PassengerRetrievePnrOutput> getPassengerRetrievePnrOutput() {
            if (passengerRetrievePnrOutput == null) {
                passengerRetrievePnrOutput = new ArrayList<PassengerRetrievePnrOutput>();
            }
            return this.passengerRetrievePnrOutput;
        }

    }

}

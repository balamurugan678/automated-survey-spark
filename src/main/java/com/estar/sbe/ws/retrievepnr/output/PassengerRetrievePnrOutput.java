
package com.estar.sbe.ws.retrievepnr.output;

import com.estar.sbe.ws.commons.output.TrueNameOutput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for passengerRetrievePnrOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passengerRetrievePnrOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ctrReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eftNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notAllowedToTravelAlonePassenger" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="passengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnrReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeatRetrievePnrOutputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SeatRetrievePnrOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}seatRetrievePnrOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trueName" type="{http://output.commons.ws.sbe.estar.com/}trueNameOutput" minOccurs="0"/&gt;
 *         &lt;element name="wheelchair" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passengerRetrievePnrOutput", propOrder = {
    "ctrReference",
    "eftNumber",
    "id",
    "notAllowedToTravelAlonePassenger",
    "passengerType",
    "pnrReference",
    "seatRetrievePnrOutputs",
    "trueName",
    "wheelchair"
})
public class PassengerRetrievePnrOutput {

    protected String ctrReference;
    protected String eftNumber;
    protected String id;
    protected Boolean notAllowedToTravelAlonePassenger;
    protected String passengerType;
    protected String pnrReference;
    @XmlElement(name = "SeatRetrievePnrOutputs")
    protected PassengerRetrievePnrOutput.SeatRetrievePnrOutputs seatRetrievePnrOutputs;
    protected TrueNameOutput trueName;
    protected Boolean wheelchair;

    /**
     * Gets the value of the ctrReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCtrReference() {
        return ctrReference;
    }

    /**
     * Sets the value of the ctrReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCtrReference(String value) {
        this.ctrReference = value;
    }

    /**
     * Gets the value of the eftNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEftNumber() {
        return eftNumber;
    }

    /**
     * Sets the value of the eftNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEftNumber(String value) {
        this.eftNumber = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the notAllowedToTravelAlonePassenger property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isNotAllowedToTravelAlonePassenger() {
        return notAllowedToTravelAlonePassenger;
    }

    /**
     * Sets the value of the notAllowedToTravelAlonePassenger property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setNotAllowedToTravelAlonePassenger(Boolean value) {
        this.notAllowedToTravelAlonePassenger = value;
    }

    /**
     * Gets the value of the passengerType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
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
     * Gets the value of the seatRetrievePnrOutputs property.
     *
     * @return
     *     possible object is
     *     {@link PassengerRetrievePnrOutput.SeatRetrievePnrOutputs }
     *
     */
    public PassengerRetrievePnrOutput.SeatRetrievePnrOutputs getSeatRetrievePnrOutputs() {
        return seatRetrievePnrOutputs;
    }

    /**
     * Sets the value of the seatRetrievePnrOutputs property.
     *
     * @param value
     *     allowed object is
     *     {@link PassengerRetrievePnrOutput.SeatRetrievePnrOutputs }
     *
     */
    public void setSeatRetrievePnrOutputs(PassengerRetrievePnrOutput.SeatRetrievePnrOutputs value) {
        this.seatRetrievePnrOutputs = value;
    }

    /**
     * Gets the value of the trueName property.
     * 
     * @return
     *     possible object is
     *     {@link TrueNameOutput }
     *     
     */
    public TrueNameOutput getTrueName() {
        return trueName;
    }

    /**
     * Sets the value of the trueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueNameOutput }
     *     
     */
    public void setTrueName(TrueNameOutput value) {
        this.trueName = value;
    }

    /**
     * Gets the value of the wheelchair property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchair() {
        return wheelchair;
    }

    /**
     * Sets the value of the wheelchair property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchair(Boolean value) {
        this.wheelchair = value;
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
     *         &lt;element name="SeatRetrievePnrOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}seatRetrievePnrOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "seatRetrievePnrOutput"
    })
    public static class SeatRetrievePnrOutputs {

        @XmlElement(name = "SeatRetrievePnrOutput")
        protected List<SeatRetrievePnrOutput> seatRetrievePnrOutput;

        /**
         * Gets the value of the seatRetrievePnrOutput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seatRetrievePnrOutput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeatRetrievePnrOutput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeatRetrievePnrOutput }
         * 
         * 
         */
        public List<SeatRetrievePnrOutput> getSeatRetrievePnrOutput() {
            if (seatRetrievePnrOutput == null) {
                seatRetrievePnrOutput = new ArrayList<SeatRetrievePnrOutput>();
            }
            return this.seatRetrievePnrOutput;
        }

    }

}

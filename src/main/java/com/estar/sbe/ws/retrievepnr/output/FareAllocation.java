
package com.estar.sbe.ws.retrievepnr.output;

import com.estar.sbe.ws.retrievepnr.CheckedInTicketOutput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for fareAllocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareAllocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fareInformation" type="{http://output.retrievepnr.ws.sbe.estar.com/}fareInformationRetrievePnrOutput" minOccurs="0"/&gt;
 *         &lt;element name="CheckedInTickets" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CheckedInTicket" type="{http://retrievepnr.ws.sbe.estar.com}checkedInTicketOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PassengerIds" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PassengerId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="passengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegmentIds" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tcn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareAllocation", propOrder = {
    "fareInformation",
    "checkedInTickets",
    "passengerIds",
    "passengerTypeCode",
    "segmentIds",
    "tcn"
})
public class FareAllocation {

    protected FareInformationRetrievePnrOutput fareInformation;
    @XmlElement(name = "CheckedInTickets")
    protected FareAllocation.CheckedInTickets checkedInTickets;
    @XmlElement(name = "PassengerIds")
    protected FareAllocation.PassengerIds passengerIds;
    protected String passengerTypeCode;
    @XmlElement(name = "SegmentIds")
    protected FareAllocation.SegmentIds segmentIds;
    protected String tcn;

    /**
     * Gets the value of the fareInformation property.
     *
     * @return
     *     possible object is
     *     {@link FareInformationRetrievePnrOutput }
     *
     */
    public FareInformationRetrievePnrOutput getFareInformation() {
        return fareInformation;
    }

    /**
     * Sets the value of the fareInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link FareInformationRetrievePnrOutput }
     *
     */
    public void setFareInformation(FareInformationRetrievePnrOutput value) {
        this.fareInformation = value;
    }

    /**
     * Gets the value of the checkedInTickets property.
     *
     * @return
     *     possible object is
     *     {@link FareAllocation.CheckedInTickets }
     *
     */
    public FareAllocation.CheckedInTickets getCheckedInTickets() {
        return checkedInTickets;
    }

    /**
     * Sets the value of the checkedInTickets property.
     *
     * @param value
     *     allowed object is
     *     {@link FareAllocation.CheckedInTickets }
     *
     */
    public void setCheckedInTickets(FareAllocation.CheckedInTickets value) {
        this.checkedInTickets = value;
    }

    /**
     * Gets the value of the passengerIds property.
     *
     * @return
     *     possible object is
     *     {@link FareAllocation.PassengerIds }
     *
     */
    public FareAllocation.PassengerIds getPassengerIds() {
        return passengerIds;
    }

    /**
     * Sets the value of the passengerIds property.
     *
     * @param value
     *     allowed object is
     *     {@link FareAllocation.PassengerIds }
     *
     */
    public void setPassengerIds(FareAllocation.PassengerIds value) {
        this.passengerIds = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Gets the value of the segmentIds property.
     *
     * @return
     *     possible object is
     *     {@link FareAllocation.SegmentIds }
     *
     */
    public FareAllocation.SegmentIds getSegmentIds() {
        return segmentIds;
    }

    /**
     * Sets the value of the segmentIds property.
     *
     * @param value
     *     allowed object is
     *     {@link FareAllocation.SegmentIds }
     *
     */
    public void setSegmentIds(FareAllocation.SegmentIds value) {
        this.segmentIds = value;
    }

    /**
     * Gets the value of the tcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcn() {
        return tcn;
    }

    /**
     * Sets the value of the tcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcn(String value) {
        this.tcn = value;
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
     *         &lt;element name="CheckedInTicket" type="{http://retrievepnr.ws.sbe.estar.com}checkedInTicketOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "checkedInTicket"
    })
    public static class CheckedInTickets {

        @XmlElement(name = "CheckedInTicket")
        protected List<CheckedInTicketOutput> checkedInTicket;

        /**
         * Gets the value of the checkedInTicket property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkedInTicket property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckedInTicket().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CheckedInTicketOutput }
         * 
         * 
         */
        public List<CheckedInTicketOutput> getCheckedInTicket() {
            if (checkedInTicket == null) {
                checkedInTicket = new ArrayList<CheckedInTicketOutput>();
            }
            return this.checkedInTicket;
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
     *         &lt;element name="PassengerId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "passengerId"
    })
    public static class PassengerIds {

        @XmlElement(name = "PassengerId")
        protected List<String> passengerId;

        /**
         * Gets the value of the passengerId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPassengerId() {
            if (passengerId == null) {
                passengerId = new ArrayList<String>();
            }
            return this.passengerId;
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
     *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "segmentId"
    })
    public static class SegmentIds {

        @XmlElement(name = "SegmentId", type = Integer.class)
        protected List<Integer> segmentId;

        /**
         * Gets the value of the segmentId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getSegmentId() {
            if (segmentId == null) {
                segmentId = new ArrayList<Integer>();
            }
            return this.segmentId;
        }

    }

}

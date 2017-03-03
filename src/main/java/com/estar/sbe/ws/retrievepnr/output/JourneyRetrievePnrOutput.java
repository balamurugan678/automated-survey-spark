
package com.estar.sbe.ws.retrievepnr.output;

import com.estar.sbe.ws.commons.LocalDateSbe;
import com.estar.sbe.ws.commons.output.OdBaseOutput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for journeyRetrievePnrOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journeyRetrievePnrOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://output.commons.ws.sbe.estar.com/}odBaseOutput"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arrivalDate" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *         &lt;element name="departureDate" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *         &lt;element name="FareAllocations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FareAllocation" type="{http://output.retrievepnr.ws.sbe.estar.com/}fareAllocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="outboundIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelSegments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TravelSegment" type="{http://output.retrievepnr.ws.sbe.estar.com/}travelSegment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journeyRetrievePnrOutput", propOrder = {
    "arrivalDate",
    "departureDate",
    "fareAllocations",
    "id",
    "outboundIndicator",
    "travelSegments"
})
public class JourneyRetrievePnrOutput
    extends OdBaseOutput
{

    protected LocalDateSbe arrivalDate;
    protected LocalDateSbe departureDate;
    @XmlElement(name = "FareAllocations")
    protected JourneyRetrievePnrOutput.FareAllocations fareAllocations;
    protected Integer id;
    protected Boolean outboundIndicator;
    @XmlElement(name = "TravelSegments")
    protected JourneyRetrievePnrOutput.TravelSegments travelSegments;

    /**
     * Gets the value of the arrivalDate property.
     *
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *
     */
    public LocalDateSbe getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     *
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *
     */
    public void setArrivalDate(LocalDateSbe value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the departureDate property.
     *
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *
     */
    public LocalDateSbe getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     *
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *
     */
    public void setDepartureDate(LocalDateSbe value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the fareAllocations property.
     *
     * @return
     *     possible object is
     *     {@link JourneyRetrievePnrOutput.FareAllocations }
     *
     */
    public JourneyRetrievePnrOutput.FareAllocations getFareAllocations() {
        return fareAllocations;
    }

    /**
     * Sets the value of the fareAllocations property.
     *
     * @param value
     *     allowed object is
     *     {@link JourneyRetrievePnrOutput.FareAllocations }
     *
     */
    public void setFareAllocations(JourneyRetrievePnrOutput.FareAllocations value) {
        this.fareAllocations = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the outboundIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isOutboundIndicator() {
        return outboundIndicator;
    }

    /**
     * Sets the value of the outboundIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setOutboundIndicator(Boolean value) {
        this.outboundIndicator = value;
    }

    /**
     * Gets the value of the travelSegments property.
     *
     * @return
     *     possible object is
     *     {@link JourneyRetrievePnrOutput.TravelSegments }
     *
     */
    public JourneyRetrievePnrOutput.TravelSegments getTravelSegments() {
        return travelSegments;
    }

    /**
     * Sets the value of the travelSegments property.
     *
     * @param value
     *     allowed object is
     *     {@link JourneyRetrievePnrOutput.TravelSegments }
     *
     */
    public void setTravelSegments(JourneyRetrievePnrOutput.TravelSegments value) {
        this.travelSegments = value;
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
     *         &lt;element name="FareAllocation" type="{http://output.retrievepnr.ws.sbe.estar.com/}fareAllocation" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "fareAllocation"
    })
    public static class FareAllocations {

        @XmlElement(name = "FareAllocation")
        protected List<FareAllocation> fareAllocation;

        /**
         * Gets the value of the fareAllocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareAllocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareAllocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareAllocation }
         * 
         * 
         */
        public List<FareAllocation> getFareAllocation() {
            if (fareAllocation == null) {
                fareAllocation = new ArrayList<FareAllocation>();
            }
            return this.fareAllocation;
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
     *         &lt;element name="TravelSegment" type="{http://output.retrievepnr.ws.sbe.estar.com/}travelSegment" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "travelSegment"
    })
    public static class TravelSegments {

        @XmlElement(name = "TravelSegment")
        protected List<TravelSegment> travelSegment;

        /**
         * Gets the value of the travelSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelSegment }
         * 
         * 
         */
        public List<TravelSegment> getTravelSegment() {
            if (travelSegment == null) {
                travelSegment = new ArrayList<TravelSegment>();
            }
            return this.travelSegment;
        }

    }

}

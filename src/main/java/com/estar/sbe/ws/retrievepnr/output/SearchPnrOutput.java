
package com.estar.sbe.ws.retrievepnr.output;

import com.estar.sbe.ws.commons.output.CommonServiceOutput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for searchPnrOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchPnrOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bookings"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Booking" type="{http://output.retrievepnr.ws.sbe.estar.com/}booking" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="commonServiceOutput" type="{http://output.commons.ws.sbe.estar.com/}commonServiceOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPnrOutput", propOrder = {
    "bookings",
    "commonServiceOutput"
})
public class SearchPnrOutput {

    @XmlElement(name = "Bookings", required = true)
    protected SearchPnrOutput.Bookings bookings;
    protected CommonServiceOutput commonServiceOutput;

    /**
     * Gets the value of the bookings property.
     *
     * @return
     *     possible object is
     *     {@link SearchPnrOutput.Bookings }
     *
     */
    public SearchPnrOutput.Bookings getBookings() {
        return bookings;
    }

    /**
     * Sets the value of the bookings property.
     *
     * @param value
     *     allowed object is
     *     {@link SearchPnrOutput.Bookings }
     *
     */
    public void setBookings(SearchPnrOutput.Bookings value) {
        this.bookings = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Booking" type="{http://output.retrievepnr.ws.sbe.estar.com/}booking" maxOccurs="unbounded"/&gt;
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
        "booking"
    })
    public static class Bookings {

        @XmlElement(name = "Booking", required = true)
        protected List<Booking> booking;

        /**
         * Gets the value of the booking property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the booking property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBooking().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Booking }
         * 
         * 
         */
        public List<Booking> getBooking() {
            if (booking == null) {
                booking = new ArrayList<Booking>();
            }
            return this.booking;
        }

    }

}

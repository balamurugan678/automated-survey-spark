
package com.estar.sbe.ws.retrievepnr.output;


import com.estar.sbe.ws.commons.LocalDateSbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for booking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="booking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOfBooking" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *         &lt;element name="Pnrs"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Pnr" type="{http://output.retrievepnr.ws.sbe.estar.com/}pnrReference" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booking", propOrder = {
    "contactEmailAddress",
    "contactLastName",
    "dateOfBooking",
    "pnrs"
})
public class Booking {

    protected String contactEmailAddress;
    protected String contactLastName;
    protected LocalDateSbe dateOfBooking;
    @XmlElement(name = "Pnrs", required = true)
    protected Booking.Pnrs pnrs;

    /**
     * Gets the value of the contactEmailAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    /**
     * Sets the value of the contactEmailAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContactEmailAddress(String value) {
        this.contactEmailAddress = value;
    }

    /**
     * Gets the value of the contactLastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * Sets the value of the contactLastName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    /**
     * Gets the value of the dateOfBooking property.
     *
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *
     */
    public LocalDateSbe getDateOfBooking() {
        return dateOfBooking;
    }

    /**
     * Sets the value of the dateOfBooking property.
     *
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *
     */
    public void setDateOfBooking(LocalDateSbe value) {
        this.dateOfBooking = value;
    }

    /**
     * Gets the value of the pnrs property.
     *
     * @return
     *     possible object is
     *     {@link Booking.Pnrs }
     *
     */
    public Booking.Pnrs getPnrs() {
        return pnrs;
    }

    /**
     * Sets the value of the pnrs property.
     *
     * @param value
     *     allowed object is
     *     {@link Booking.Pnrs }
     *
     */
    public void setPnrs(Booking.Pnrs value) {
        this.pnrs = value;
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
     *         &lt;element name="Pnr" type="{http://output.retrievepnr.ws.sbe.estar.com/}pnrReference" maxOccurs="unbounded"/&gt;
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
        "pnr"
    })
    public static class Pnrs {

        @XmlElement(name = "Pnr", required = true)
        protected List<PnrReference> pnr;

        /**
         * Gets the value of the pnr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pnr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPnr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PnrReference }
         * 
         * 
         */
        public List<PnrReference> getPnr() {
            if (pnr == null) {
                pnr = new ArrayList<PnrReference>();
            }
            return this.pnr;
        }

    }

}

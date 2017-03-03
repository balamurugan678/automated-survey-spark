
package com.estar.sbe.ws.retrievepnr.input;

import com.estar.sbe.ws.commons.LocalDateSbe;
import com.estar.sbe.ws.commons.input.AncillaryProductSearchPnrInput;
import com.estar.sbe.ws.commons.input.CommonServiceInput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchPnrInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchPnrInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ancillaryProduct" type="{http://input.commons.ws.sbe.estar.com/}ancillaryProductSearchPnrInput" minOccurs="0"/&gt;
 *         &lt;element name="commonService" type="{http://input.commons.ws.sbe.estar.com/}commonServiceInput"/&gt;
 *         &lt;element name="contactInformation" type="{http://input.retrievepnr.ws.sbe.estar.com/}contactRetrievePnrInput" minOccurs="0"/&gt;
 *         &lt;element name="dateOfBookingMax" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *         &lt;element name="dateOfBookingMin" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *         &lt;element name="trainBookingReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPnrInput", propOrder = {
    "ancillaryProduct",
    "commonService",
    "contactInformation",
    "dateOfBookingMax",
    "dateOfBookingMin",
    "trainBookingReference"
})
public class SearchPnrInput {

    @XmlElement(nillable = true)
    protected AncillaryProductSearchPnrInput ancillaryProduct;
    @XmlElement(required = true)
    protected CommonServiceInput commonService;
    @XmlElement(nillable = true)
    protected ContactRetrievePnrInput contactInformation;
    protected LocalDateSbe dateOfBookingMax;
    protected LocalDateSbe dateOfBookingMin;
    protected String trainBookingReference;

    /**
     * Gets the value of the ancillaryProduct property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryProductSearchPnrInput }
     *     
     */
    public AncillaryProductSearchPnrInput getAncillaryProduct() {
        return ancillaryProduct;
    }

    /**
     * Sets the value of the ancillaryProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryProductSearchPnrInput }
     *     
     */
    public void setAncillaryProduct(AncillaryProductSearchPnrInput value) {
        this.ancillaryProduct = value;
    }

    /**
     * Gets the value of the commonService property.
     * 
     * @return
     *     possible object is
     *     {@link CommonServiceInput }
     *     
     */
    public CommonServiceInput getCommonService() {
        return commonService;
    }

    /**
     * Sets the value of the commonService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonServiceInput }
     *     
     */
    public void setCommonService(CommonServiceInput value) {
        this.commonService = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRetrievePnrInput }
     *     
     */
    public ContactRetrievePnrInput getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRetrievePnrInput }
     *     
     */
    public void setContactInformation(ContactRetrievePnrInput value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the dateOfBookingMax property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *     
     */
    public LocalDateSbe getDateOfBookingMax() {
        return dateOfBookingMax;
    }

    /**
     * Sets the value of the dateOfBookingMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *     
     */
    public void setDateOfBookingMax(LocalDateSbe value) {
        this.dateOfBookingMax = value;
    }

    /**
     * Gets the value of the dateOfBookingMin property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *     
     */
    public LocalDateSbe getDateOfBookingMin() {
        return dateOfBookingMin;
    }

    /**
     * Sets the value of the dateOfBookingMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *     
     */
    public void setDateOfBookingMin(LocalDateSbe value) {
        this.dateOfBookingMin = value;
    }

    /**
     * Gets the value of the trainBookingReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainBookingReference() {
        return trainBookingReference;
    }

    /**
     * Sets the value of the trainBookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainBookingReference(String value) {
        this.trainBookingReference = value;
    }

}

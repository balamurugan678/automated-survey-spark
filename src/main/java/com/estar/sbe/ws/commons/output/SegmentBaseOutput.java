
package com.estar.sbe.ws.commons.output;

import com.estar.sbe.ws.commons.LocalDateSbe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentBaseOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentBaseOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *         &lt;element name="equipmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="marketingTrainNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="od" type="{http://output.commons.ws.sbe.estar.com/}odBaseOutput" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentBaseOutput", propOrder = {
    "duration",
    "endDate",
    "equipmentType",
    "id",
    "marketingTrainNumber",
    "od",
    "startDate"
})
@XmlSeeAlso({
    SegmentDetailedOutput.class
})
public class SegmentBaseOutput {

    protected Integer duration;
    protected LocalDateSbe endDate;
    protected String equipmentType;
    protected Integer id;
    protected String marketingTrainNumber;
    protected OdBaseOutput od;
    protected LocalDateSbe startDate;

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *     
     */
    public LocalDateSbe getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *     
     */
    public void setEndDate(LocalDateSbe value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
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
     * Gets the value of the marketingTrainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingTrainNumber() {
        return marketingTrainNumber;
    }

    /**
     * Sets the value of the marketingTrainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingTrainNumber(String value) {
        this.marketingTrainNumber = value;
    }

    /**
     * Gets the value of the od property.
     * 
     * @return
     *     possible object is
     *     {@link OdBaseOutput }
     *     
     */
    public OdBaseOutput getOd() {
        return od;
    }

    /**
     * Sets the value of the od property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdBaseOutput }
     *     
     */
    public void setOd(OdBaseOutput value) {
        this.od = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *     
     */
    public LocalDateSbe getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *     
     */
    public void setStartDate(LocalDateSbe value) {
        this.startDate = value;
    }

}

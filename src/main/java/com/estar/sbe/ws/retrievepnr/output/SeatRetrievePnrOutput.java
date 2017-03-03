
package com.estar.sbe.ws.retrievepnr.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seatRetrievePnrOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seatRetrievePnrOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coachNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mealAtSeat" type="{http://output.retrievepnr.ws.sbe.estar.com/}mealAtSeat" minOccurs="0"/&gt;
 *         &lt;element name="seatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="specialMeal" type="{http://output.retrievepnr.ws.sbe.estar.com/}specialMeal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seatRetrievePnrOutput", propOrder = {
    "coachNumber",
    "mealAtSeat",
    "seatNumber",
    "segmentId",
    "specialMeal"
})
public class SeatRetrievePnrOutput {

    protected String coachNumber;
    protected MealAtSeat mealAtSeat;
    protected String seatNumber;
    protected Integer segmentId;
    protected SpecialMeal specialMeal;

    /**
     * Gets the value of the coachNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoachNumber() {
        return coachNumber;
    }

    /**
     * Sets the value of the coachNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoachNumber(String value) {
        this.coachNumber = value;
    }

    /**
     * Gets the value of the mealAtSeat property.
     * 
     * @return
     *     possible object is
     *     {@link MealAtSeat }
     *     
     */
    public MealAtSeat getMealAtSeat() {
        return mealAtSeat;
    }

    /**
     * Sets the value of the mealAtSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MealAtSeat }
     *     
     */
    public void setMealAtSeat(MealAtSeat value) {
        this.mealAtSeat = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentId(Integer value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the specialMeal property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialMeal }
     *     
     */
    public SpecialMeal getSpecialMeal() {
        return specialMeal;
    }

    /**
     * Sets the value of the specialMeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialMeal }
     *     
     */
    public void setSpecialMeal(SpecialMeal value) {
        this.specialMeal = value;
    }

}

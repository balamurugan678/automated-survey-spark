
package com.estar.sbe.ws.retrievepnr.output;

import com.estar.sbe.ws.commons.output.SegmentDetailedOutput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for travelSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="travelSegment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://output.commons.ws.sbe.estar.com/}segmentDetailedOutput"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classOfAccommodation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disruptionInformation" type="{http://output.retrievepnr.ws.sbe.estar.com/}disruptionInformation" minOccurs="0"/&gt;
 *         &lt;element name="MealAvailables" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MealAvailable" type="{http://output.retrievepnr.ws.sbe.estar.com/}mealAvailable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MethodOfDeliverys" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MethodOfDelivery" type="{http://output.retrievepnr.ws.sbe.estar.com/}methodOfDelivery" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "travelSegment", propOrder = {
    "classOfAccommodation",
    "disruptionInformation",
    "mealAvailables",
    "methodOfDeliverys"
})
public class TravelSegment
    extends SegmentDetailedOutput
{

    protected String classOfAccommodation;
    protected DisruptionInformation disruptionInformation;
    @XmlElement(name = "MealAvailables")
    protected TravelSegment.MealAvailables mealAvailables;
    @XmlElement(name = "MethodOfDeliverys")
    protected TravelSegment.MethodOfDeliverys methodOfDeliverys;

    /**
     * Gets the value of the classOfAccommodation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClassOfAccommodation() {
        return classOfAccommodation;
    }

    /**
     * Sets the value of the classOfAccommodation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClassOfAccommodation(String value) {
        this.classOfAccommodation = value;
    }

    /**
     * Gets the value of the disruptionInformation property.
     *
     * @return
     *     possible object is
     *     {@link DisruptionInformation }
     *
     */
    public DisruptionInformation getDisruptionInformation() {
        return disruptionInformation;
    }

    /**
     * Sets the value of the disruptionInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link DisruptionInformation }
     *
     */
    public void setDisruptionInformation(DisruptionInformation value) {
        this.disruptionInformation = value;
    }

    /**
     * Gets the value of the mealAvailables property.
     *
     * @return
     *     possible object is
     *     {@link TravelSegment.MealAvailables }
     *
     */
    public TravelSegment.MealAvailables getMealAvailables() {
        return mealAvailables;
    }

    /**
     * Sets the value of the mealAvailables property.
     *
     * @param value
     *     allowed object is
     *     {@link TravelSegment.MealAvailables }
     *
     */
    public void setMealAvailables(TravelSegment.MealAvailables value) {
        this.mealAvailables = value;
    }

    /**
     * Gets the value of the methodOfDeliverys property.
     *
     * @return
     *     possible object is
     *     {@link TravelSegment.MethodOfDeliverys }
     *
     */
    public TravelSegment.MethodOfDeliverys getMethodOfDeliverys() {
        return methodOfDeliverys;
    }

    /**
     * Sets the value of the methodOfDeliverys property.
     *
     * @param value
     *     allowed object is
     *     {@link TravelSegment.MethodOfDeliverys }
     *
     */
    public void setMethodOfDeliverys(TravelSegment.MethodOfDeliverys value) {
        this.methodOfDeliverys = value;
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
     *         &lt;element name="MealAvailable" type="{http://output.retrievepnr.ws.sbe.estar.com/}mealAvailable" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "mealAvailable"
    })
    public static class MealAvailables {

        @XmlElement(name = "MealAvailable")
        protected List<MealAvailable> mealAvailable;

        /**
         * Gets the value of the mealAvailable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mealAvailable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMealAvailable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MealAvailable }
         * 
         * 
         */
        public List<MealAvailable> getMealAvailable() {
            if (mealAvailable == null) {
                mealAvailable = new ArrayList<MealAvailable>();
            }
            return this.mealAvailable;
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
     *         &lt;element name="MethodOfDelivery" type="{http://output.retrievepnr.ws.sbe.estar.com/}methodOfDelivery" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "methodOfDelivery"
    })
    public static class MethodOfDeliverys {

        @XmlElement(name = "MethodOfDelivery")
        protected List<MethodOfDelivery> methodOfDelivery;

        /**
         * Gets the value of the methodOfDelivery property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the methodOfDelivery property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMethodOfDelivery().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MethodOfDelivery }
         * 
         * 
         */
        public List<MethodOfDelivery> getMethodOfDelivery() {
            if (methodOfDelivery == null) {
                methodOfDelivery = new ArrayList<MethodOfDelivery>();
            }
            return this.methodOfDelivery;
        }

    }

}

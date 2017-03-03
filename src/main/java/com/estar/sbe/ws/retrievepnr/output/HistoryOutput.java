
package com.estar.sbe.ws.retrievepnr.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for historyOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="historyOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PerformedActionOutputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PerformedActionOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}performedActionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "historyOutput", propOrder = {
    "performedActionOutputs"
})
public class HistoryOutput {

    @XmlElement(name = "PerformedActionOutputs")
    protected HistoryOutput.PerformedActionOutputs performedActionOutputs;

    /**
     * Gets the value of the performedActionOutputs property.
     *
     * @return
     *     possible object is
     *     {@link HistoryOutput.PerformedActionOutputs }
     *
     */
    public HistoryOutput.PerformedActionOutputs getPerformedActionOutputs() {
        return performedActionOutputs;
    }

    /**
     * Sets the value of the performedActionOutputs property.
     *
     * @param value
     *     allowed object is
     *     {@link HistoryOutput.PerformedActionOutputs }
     *
     */
    public void setPerformedActionOutputs(HistoryOutput.PerformedActionOutputs value) {
        this.performedActionOutputs = value;
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
     *         &lt;element name="PerformedActionOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}performedActionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "performedActionOutput"
    })
    public static class PerformedActionOutputs {

        @XmlElement(name = "PerformedActionOutput")
        protected List<PerformedActionOutput> performedActionOutput;

        /**
         * Gets the value of the performedActionOutput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the performedActionOutput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPerformedActionOutput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PerformedActionOutput }
         * 
         * 
         */
        public List<PerformedActionOutput> getPerformedActionOutput() {
            if (performedActionOutput == null) {
                performedActionOutput = new ArrayList<PerformedActionOutput>();
            }
            return this.performedActionOutput;
        }

    }

}

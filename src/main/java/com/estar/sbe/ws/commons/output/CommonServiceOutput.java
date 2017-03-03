
package com.estar.sbe.ws.commons.output;

import com.estar.sbe.ws.commons.WarningBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for commonServiceOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commonServiceOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="echoToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarningBeans" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="WarningBean" type="{http://commons.ws.sbe.estar.com/}warningBean" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "commonServiceOutput", propOrder = {
    "echoToken",
    "warningBeans"
})
public class CommonServiceOutput {

    protected String echoToken;
    @XmlElement(name = "WarningBeans")
    protected CommonServiceOutput.WarningBeans warningBeans;

    /**
     * Gets the value of the echoToken property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the warningBeans property.
     *
     * @return
     *     possible object is
     *     {@link CommonServiceOutput.WarningBeans }
     *
     */
    public CommonServiceOutput.WarningBeans getWarningBeans() {
        return warningBeans;
    }

    /**
     * Sets the value of the warningBeans property.
     *
     * @param value
     *     allowed object is
     *     {@link CommonServiceOutput.WarningBeans }
     *
     */
    public void setWarningBeans(CommonServiceOutput.WarningBeans value) {
        this.warningBeans = value;
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
     *         &lt;element name="WarningBean" type="{http://commons.ws.sbe.estar.com/}warningBean" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "warningBean"
    })
    public static class WarningBeans {

        @XmlElement(name = "WarningBean")
        protected List<WarningBean> warningBean;

        /**
         * Gets the value of the warningBean property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warningBean property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarningBean().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WarningBean }
         * 
         * 
         */
        public List<WarningBean> getWarningBean() {
            if (warningBean == null) {
                warningBean = new ArrayList<WarningBean>();
            }
            return this.warningBean;
        }

    }

}

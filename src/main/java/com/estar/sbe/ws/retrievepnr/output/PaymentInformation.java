
package com.estar.sbe.ws.retrievepnr.output;

import com.estar.sbe.ws.commons.output.CreditCardTransactionOutput;
import com.estar.sbe.ws.commons.output.VoucherTransactionOutput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for paymentInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditCardTransactions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CreditCardTransaction" type="{http://output.commons.ws.sbe.estar.com/}creditCardTransactionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VoucherTransactions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VoucherTransaction" type="{http://output.commons.ws.sbe.estar.com/}voucherTransactionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "paymentInformation", propOrder = {
    "creditCardTransactions",
    "voucherTransactions"
})
public class PaymentInformation {

    @XmlElement(name = "CreditCardTransactions")
    protected PaymentInformation.CreditCardTransactions creditCardTransactions;
    @XmlElement(name = "VoucherTransactions")
    protected PaymentInformation.VoucherTransactions voucherTransactions;

    /**
     * Gets the value of the creditCardTransactions property.
     *
     * @return
     *     possible object is
     *     {@link PaymentInformation.CreditCardTransactions }
     *
     */
    public PaymentInformation.CreditCardTransactions getCreditCardTransactions() {
        return creditCardTransactions;
    }

    /**
     * Sets the value of the creditCardTransactions property.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentInformation.CreditCardTransactions }
     *
     */
    public void setCreditCardTransactions(PaymentInformation.CreditCardTransactions value) {
        this.creditCardTransactions = value;
    }

    /**
     * Gets the value of the voucherTransactions property.
     *
     * @return
     *     possible object is
     *     {@link PaymentInformation.VoucherTransactions }
     *
     */
    public PaymentInformation.VoucherTransactions getVoucherTransactions() {
        return voucherTransactions;
    }

    /**
     * Sets the value of the voucherTransactions property.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentInformation.VoucherTransactions }
     *
     */
    public void setVoucherTransactions(PaymentInformation.VoucherTransactions value) {
        this.voucherTransactions = value;
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
     *         &lt;element name="CreditCardTransaction" type="{http://output.commons.ws.sbe.estar.com/}creditCardTransactionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "creditCardTransaction"
    })
    public static class CreditCardTransactions {

        @XmlElement(name = "CreditCardTransaction")
        protected List<CreditCardTransactionOutput> creditCardTransaction;

        /**
         * Gets the value of the creditCardTransaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creditCardTransaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreditCardTransaction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CreditCardTransactionOutput }
         * 
         * 
         */
        public List<CreditCardTransactionOutput> getCreditCardTransaction() {
            if (creditCardTransaction == null) {
                creditCardTransaction = new ArrayList<CreditCardTransactionOutput>();
            }
            return this.creditCardTransaction;
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
     *         &lt;element name="VoucherTransaction" type="{http://output.commons.ws.sbe.estar.com/}voucherTransactionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "voucherTransaction"
    })
    public static class VoucherTransactions {

        @XmlElement(name = "VoucherTransaction")
        protected List<VoucherTransactionOutput> voucherTransaction;

        /**
         * Gets the value of the voucherTransaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voucherTransaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoucherTransaction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VoucherTransactionOutput }
         * 
         * 
         */
        public List<VoucherTransactionOutput> getVoucherTransaction() {
            if (voucherTransaction == null) {
                voucherTransaction = new ArrayList<VoucherTransactionOutput>();
            }
            return this.voucherTransaction;
        }

    }

}

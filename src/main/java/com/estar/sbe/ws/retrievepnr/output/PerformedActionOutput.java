
package com.estar.sbe.ws.retrievepnr.output;

import com.estar.sbe.ws.commons.LocalDateSbe;
import com.estar.sbe.ws.commons.output.HistoryCreditCardTransactionOutput;
import com.estar.sbe.ws.commons.output.HistoryVoucherTransactionOutput;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for performedActionOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="performedActionOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://commons.ws.sbe.estar.com/}localDateSbe" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardTransactions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CreditCardTransaction" type="{http://output.commons.ws.sbe.estar.com/}historyCreditCardTransactionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreateProductOutputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CreateProductOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}createProductOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeleteProductOutputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DeleteProductOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}deleteProductOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UpdateProductOutputs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UpdateProductOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}updateProductOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                   &lt;element name="VoucherTransaction" type="{http://output.commons.ws.sbe.estar.com/}historyVoucherTransactionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "performedActionOutput", propOrder = {
    "actionType",
    "date",
    "id",
    "creditCardTransactions",
    "createProductOutputs",
    "deleteProductOutputs",
    "updateProductOutputs",
    "voucherTransactions"
})
public class PerformedActionOutput {

    protected String actionType;
    protected LocalDateSbe date;
    protected Integer id;
    @XmlElement(name = "CreditCardTransactions")
    protected PerformedActionOutput.CreditCardTransactions creditCardTransactions;
    @XmlElement(name = "CreateProductOutputs")
    protected PerformedActionOutput.CreateProductOutputs createProductOutputs;
    @XmlElement(name = "DeleteProductOutputs")
    protected PerformedActionOutput.DeleteProductOutputs deleteProductOutputs;
    @XmlElement(name = "UpdateProductOutputs")
    protected PerformedActionOutput.UpdateProductOutputs updateProductOutputs;
    @XmlElement(name = "VoucherTransactions")
    protected PerformedActionOutput.VoucherTransactions voucherTransactions;

    /**
     * Gets the value of the actionType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the date property.
     *
     * @return
     *     possible object is
     *     {@link LocalDateSbe }
     *
     */
    public LocalDateSbe getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value
     *     allowed object is
     *     {@link LocalDateSbe }
     *
     */
    public void setDate(LocalDateSbe value) {
        this.date = value;
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
     * Gets the value of the creditCardTransactions property.
     *
     * @return
     *     possible object is
     *     {@link PerformedActionOutput.CreditCardTransactions }
     *
     */
    public PerformedActionOutput.CreditCardTransactions getCreditCardTransactions() {
        return creditCardTransactions;
    }

    /**
     * Sets the value of the creditCardTransactions property.
     *
     * @param value
     *     allowed object is
     *     {@link PerformedActionOutput.CreditCardTransactions }
     *
     */
    public void setCreditCardTransactions(PerformedActionOutput.CreditCardTransactions value) {
        this.creditCardTransactions = value;
    }

    /**
     * Gets the value of the createProductOutputs property.
     *
     * @return
     *     possible object is
     *     {@link PerformedActionOutput.CreateProductOutputs }
     *
     */
    public PerformedActionOutput.CreateProductOutputs getCreateProductOutputs() {
        return createProductOutputs;
    }

    /**
     * Sets the value of the createProductOutputs property.
     *
     * @param value
     *     allowed object is
     *     {@link PerformedActionOutput.CreateProductOutputs }
     *
     */
    public void setCreateProductOutputs(PerformedActionOutput.CreateProductOutputs value) {
        this.createProductOutputs = value;
    }

    /**
     * Gets the value of the deleteProductOutputs property.
     *
     * @return
     *     possible object is
     *     {@link PerformedActionOutput.DeleteProductOutputs }
     *
     */
    public PerformedActionOutput.DeleteProductOutputs getDeleteProductOutputs() {
        return deleteProductOutputs;
    }

    /**
     * Sets the value of the deleteProductOutputs property.
     *
     * @param value
     *     allowed object is
     *     {@link PerformedActionOutput.DeleteProductOutputs }
     *
     */
    public void setDeleteProductOutputs(PerformedActionOutput.DeleteProductOutputs value) {
        this.deleteProductOutputs = value;
    }

    /**
     * Gets the value of the updateProductOutputs property.
     *
     * @return
     *     possible object is
     *     {@link PerformedActionOutput.UpdateProductOutputs }
     *
     */
    public PerformedActionOutput.UpdateProductOutputs getUpdateProductOutputs() {
        return updateProductOutputs;
    }

    /**
     * Sets the value of the updateProductOutputs property.
     *
     * @param value
     *     allowed object is
     *     {@link PerformedActionOutput.UpdateProductOutputs }
     *
     */
    public void setUpdateProductOutputs(PerformedActionOutput.UpdateProductOutputs value) {
        this.updateProductOutputs = value;
    }

    /**
     * Gets the value of the voucherTransactions property.
     *
     * @return
     *     possible object is
     *     {@link PerformedActionOutput.VoucherTransactions }
     *
     */
    public PerformedActionOutput.VoucherTransactions getVoucherTransactions() {
        return voucherTransactions;
    }

    /**
     * Sets the value of the voucherTransactions property.
     *
     * @param value
     *     allowed object is
     *     {@link PerformedActionOutput.VoucherTransactions }
     *
     */
    public void setVoucherTransactions(PerformedActionOutput.VoucherTransactions value) {
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
     *         &lt;element name="CreateProductOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}createProductOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "createProductOutput"
    })
    public static class CreateProductOutputs {

        @XmlElement(name = "CreateProductOutput")
        protected List<CreateProductOutput> createProductOutput;

        /**
         * Gets the value of the createProductOutput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the createProductOutput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreateProductOutput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CreateProductOutput }
         * 
         * 
         */
        public List<CreateProductOutput> getCreateProductOutput() {
            if (createProductOutput == null) {
                createProductOutput = new ArrayList<CreateProductOutput>();
            }
            return this.createProductOutput;
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
     *         &lt;element name="CreditCardTransaction" type="{http://output.commons.ws.sbe.estar.com/}historyCreditCardTransactionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        protected List<HistoryCreditCardTransactionOutput> creditCardTransaction;

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
         * {@link HistoryCreditCardTransactionOutput }
         * 
         * 
         */
        public List<HistoryCreditCardTransactionOutput> getCreditCardTransaction() {
            if (creditCardTransaction == null) {
                creditCardTransaction = new ArrayList<HistoryCreditCardTransactionOutput>();
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
     *         &lt;element name="DeleteProductOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}deleteProductOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "deleteProductOutput"
    })
    public static class DeleteProductOutputs {

        @XmlElement(name = "DeleteProductOutput")
        protected List<DeleteProductOutput> deleteProductOutput;

        /**
         * Gets the value of the deleteProductOutput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deleteProductOutput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeleteProductOutput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeleteProductOutput }
         * 
         * 
         */
        public List<DeleteProductOutput> getDeleteProductOutput() {
            if (deleteProductOutput == null) {
                deleteProductOutput = new ArrayList<DeleteProductOutput>();
            }
            return this.deleteProductOutput;
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
     *         &lt;element name="UpdateProductOutput" type="{http://output.retrievepnr.ws.sbe.estar.com/}updateProductOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "updateProductOutput"
    })
    public static class UpdateProductOutputs {

        @XmlElement(name = "UpdateProductOutput")
        protected List<UpdateProductOutput> updateProductOutput;

        /**
         * Gets the value of the updateProductOutput property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the updateProductOutput property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUpdateProductOutput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UpdateProductOutput }
         * 
         * 
         */
        public List<UpdateProductOutput> getUpdateProductOutput() {
            if (updateProductOutput == null) {
                updateProductOutput = new ArrayList<UpdateProductOutput>();
            }
            return this.updateProductOutput;
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
     *         &lt;element name="VoucherTransaction" type="{http://output.commons.ws.sbe.estar.com/}historyVoucherTransactionOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        protected List<HistoryVoucherTransactionOutput> voucherTransaction;

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
         * {@link HistoryVoucherTransactionOutput }
         * 
         * 
         */
        public List<HistoryVoucherTransactionOutput> getVoucherTransaction() {
            if (voucherTransaction == null) {
                voucherTransaction = new ArrayList<HistoryVoucherTransactionOutput>();
            }
            return this.voucherTransaction;
        }

    }

}

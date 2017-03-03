
package com.estar.sbe.ws.commons;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.estar.sbe.ws.commons package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FunctionalException_QNAME = new QName("http://commons.ws.sbe.estar.com/", "FunctionalException");
    private final static QName _TechnicalException_QNAME = new QName("http://commons.ws.sbe.estar.com/", "TechnicalException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.estar.sbe.ws.commons
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FunctionalException }
     * 
     */
    public FunctionalException createFunctionalException() {
        return new FunctionalException();
    }

    /**
     * Create an instance of {@link TechnicalException }
     * 
     */
    public TechnicalException createTechnicalException() {
        return new TechnicalException();
    }

    /**
     * Create an instance of {@link LocalDateSbe }
     * 
     */
    public LocalDateSbe createLocalDateSbe() {
        return new LocalDateSbe();
    }

    /**
     * Create an instance of {@link WarningBean }
     * 
     */
    public WarningBean createWarningBean() {
        return new WarningBean();
    }

    /**
     * Create an instance of {@link MessageBean }
     * 
     */
    public MessageBean createMessageBean() {
        return new MessageBean();
    }

    /**
     * Create an instance of {@link ExceptionBean }
     * 
     */
    public ExceptionBean createExceptionBean() {
        return new ExceptionBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FunctionalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commons.ws.sbe.estar.com/", name = "FunctionalException")
    public JAXBElement<FunctionalException> createFunctionalException(FunctionalException value) {
        return new JAXBElement<FunctionalException>(_FunctionalException_QNAME, FunctionalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://commons.ws.sbe.estar.com/", name = "TechnicalException")
    public JAXBElement<TechnicalException> createTechnicalException(TechnicalException value) {
        return new JAXBElement<TechnicalException>(_TechnicalException_QNAME, TechnicalException.class, null, value);
    }

}

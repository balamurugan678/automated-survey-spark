
package com.estar.sbe.ws.retrievepnr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.estar.sbe.ws.retrievepnr package. 
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

    private final static QName _LoadTravel_QNAME = new QName("http://retrievepnr.ws.sbe.estar.com", "loadTravel");
    private final static QName _LoadTravelResponse_QNAME = new QName("http://retrievepnr.ws.sbe.estar.com", "loadTravelResponse");
    private final static QName _SearchPnr_QNAME = new QName("http://retrievepnr.ws.sbe.estar.com", "searchPnr");
    private final static QName _SearchPnrResponse_QNAME = new QName("http://retrievepnr.ws.sbe.estar.com", "searchPnrResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.estar.sbe.ws.retrievepnr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoadTravel }
     * 
     */
    public LoadTravel createLoadTravel() {
        return new LoadTravel();
    }

    /**
     * Create an instance of {@link LoadTravelResponse }
     * 
     */
    public LoadTravelResponse createLoadTravelResponse() {
        return new LoadTravelResponse();
    }

    /**
     * Create an instance of {@link SearchPnr }
     * 
     */
    public SearchPnr createSearchPnr() {
        return new SearchPnr();
    }

    /**
     * Create an instance of {@link SearchPnrResponse }
     * 
     */
    public SearchPnrResponse createSearchPnrResponse() {
        return new SearchPnrResponse();
    }

    /**
     * Create an instance of {@link CheckedInTicketOutput }
     * 
     */
    public CheckedInTicketOutput createCheckedInTicketOutput() {
        return new CheckedInTicketOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTravel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://retrievepnr.ws.sbe.estar.com", name = "loadTravel")
    public JAXBElement<LoadTravel> createLoadTravel(LoadTravel value) {
        return new JAXBElement<LoadTravel>(_LoadTravel_QNAME, LoadTravel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadTravelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://retrievepnr.ws.sbe.estar.com", name = "loadTravelResponse")
    public JAXBElement<LoadTravelResponse> createLoadTravelResponse(LoadTravelResponse value) {
        return new JAXBElement<LoadTravelResponse>(_LoadTravelResponse_QNAME, LoadTravelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPnr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://retrievepnr.ws.sbe.estar.com", name = "searchPnr")
    public JAXBElement<SearchPnr> createSearchPnr(SearchPnr value) {
        return new JAXBElement<SearchPnr>(_SearchPnr_QNAME, SearchPnr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPnrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://retrievepnr.ws.sbe.estar.com", name = "searchPnrResponse")
    public JAXBElement<SearchPnrResponse> createSearchPnrResponse(SearchPnrResponse value) {
        return new JAXBElement<SearchPnrResponse>(_SearchPnrResponse_QNAME, SearchPnrResponse.class, null, value);
    }

}

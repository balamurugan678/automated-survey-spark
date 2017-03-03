
package com.estar.sbe.ws.retrievepnr.input;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.estar.sbe.ws.retrievepnr.input package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.estar.sbe.ws.retrievepnr.input
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchPnrInput }
     * 
     */
    public SearchPnrInput createSearchPnrInput() {
        return new SearchPnrInput();
    }

    /**
     * Create an instance of {@link ContactRetrievePnrInput }
     * 
     */
    public ContactRetrievePnrInput createContactRetrievePnrInput() {
        return new ContactRetrievePnrInput();
    }

    /**
     * Create an instance of {@link LoadTravelInput }
     * 
     */
    public LoadTravelInput createLoadTravelInput() {
        return new LoadTravelInput();
    }

    /**
     * Create an instance of {@link BasicPassengerInformation }
     * 
     */
    public BasicPassengerInformation createBasicPassengerInformation() {
        return new BasicPassengerInformation();
    }

}

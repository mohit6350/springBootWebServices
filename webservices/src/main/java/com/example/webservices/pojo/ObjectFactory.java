//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.10 at 11:18:36 PM IST 
//


package com.example.webservices.pojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.webservices.pojo package. 
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

    private final static QName _Television_QNAME = new QName("http://www.example.org/products", "television");
    private final static QName _ElectronicProductsRequest_QNAME = new QName("http://www.example.org/products", "ElectronicProductsRequest");
    private final static QName _Mobile_QNAME = new QName("http://www.example.org/products", "mobile");
    private final static QName _ElectronicProductsResponse_QNAME = new QName("http://www.example.org/products", "ElectronicProductsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.webservices.pojo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Television }
     * 
     */
    public Television createTelevision() {
        return new Television();
    }

    /**
     * Create an instance of {@link Mobile }
     * 
     */
    public Mobile createMobile() {
        return new Mobile();
    }

    /**
     * Create an instance of {@link ElectronicProductsResponse }
     * 
     */
    public ElectronicProductsResponse createElectronicProductsResponse() {
        return new ElectronicProductsResponse();
    }

    /**
     * Create an instance of {@link ElectronicProductsRequest }
     * 
     */
    public ElectronicProductsRequest createElectronicProductsRequest() {
        return new ElectronicProductsRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Television }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/products", name = "television")
    public JAXBElement<Television> createTelevision(Television value) {
        return new JAXBElement<Television>(_Television_QNAME, Television.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicProductsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/products", name = "ElectronicProductsRequest")
    public JAXBElement<ElectronicProductsRequest> createElectronicProductsRequest(ElectronicProductsRequest value) {
        return new JAXBElement<ElectronicProductsRequest>(_ElectronicProductsRequest_QNAME, ElectronicProductsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mobile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/products", name = "mobile")
    public JAXBElement<Mobile> createMobile(Mobile value) {
        return new JAXBElement<Mobile>(_Mobile_QNAME, Mobile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/products", name = "ElectronicProductsResponse")
    public JAXBElement<ElectronicProductsResponse> createElectronicProductsResponse(ElectronicProductsResponse value) {
        return new JAXBElement<ElectronicProductsResponse>(_ElectronicProductsResponse_QNAME, ElectronicProductsResponse.class, null, value);
    }

}
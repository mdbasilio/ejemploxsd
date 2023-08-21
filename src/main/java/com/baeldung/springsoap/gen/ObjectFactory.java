//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.21 a las 11:53:51 AM ECT 
//


package com.baeldung.springsoap.gen;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baeldung.springsoap.gen package. 
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

    private final static QName _AnularFacturaUnica_QNAME = new QName("http://www.baeldung.com/springsoap/gen", "anularFacturaUnica");
    private final static QName _AnularFacturaUnicaResponse_QNAME = new QName("http://www.baeldung.com/springsoap/gen", "anularFacturaUnicaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baeldung.springsoap.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnularFacturaUnicaRequest }
     * 
     */
    public AnularFacturaUnicaRequest createAnularFacturaUnicaRequest() {
        return new AnularFacturaUnicaRequest();
    }

    /**
     * Create an instance of {@link AnularFacturaUnicaResponse }
     * 
     */
    public AnularFacturaUnicaResponse createAnularFacturaUnicaResponse() {
        return new AnularFacturaUnicaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularFacturaUnicaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnularFacturaUnicaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.baeldung.com/springsoap/gen", name = "anularFacturaUnica")
    public JAXBElement<AnularFacturaUnicaRequest> createAnularFacturaUnica(AnularFacturaUnicaRequest value) {
        return new JAXBElement<AnularFacturaUnicaRequest>(_AnularFacturaUnica_QNAME, AnularFacturaUnicaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularFacturaUnicaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnularFacturaUnicaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.baeldung.com/springsoap/gen", name = "anularFacturaUnicaResponse")
    public JAXBElement<AnularFacturaUnicaResponse> createAnularFacturaUnicaResponse(AnularFacturaUnicaResponse value) {
        return new JAXBElement<AnularFacturaUnicaResponse>(_AnularFacturaUnicaResponse_QNAME, AnularFacturaUnicaResponse.class, null, value);
    }

}

//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.21 a las 02:01:03 PM ECT 
//


package com.example.demosoap.gen;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demosoap.gen package. 
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

    private final static QName _AnularFacturaUnicaRequest_QNAME = new QName("http://www.example.com/demosoap/gen", "anularFacturaUnicaRequest");
    private final static QName _AnularFacturaUnicaResponse_QNAME = new QName("http://www.example.com/demosoap/gen", "anularFacturaUnicaResponse");
    private final static QName _ConciliarFacturaUnicaRequest_QNAME = new QName("http://www.example.com/demosoap/gen", "conciliarFacturaUnicaRequest");
    private final static QName _ConciliarFacturaUnicaResponse_QNAME = new QName("http://www.example.com/demosoap/gen", "conciliarFacturaUnicaResponse");
    private final static QName _EnviarFacturaUnicaRequest_QNAME = new QName("http://www.example.com/demosoap/gen", "enviarFacturaUnicaRequest");
    private final static QName _EnviarFacturaUnicaResponse_QNAME = new QName("http://www.example.com/demosoap/gen", "enviarFacturaUnicaResponse");
    private final static QName _VerificarOrdenEntregaRequest_QNAME = new QName("http://www.example.com/demosoap/gen", "verificarOrdenEntregaRequest");
    private final static QName _VerificarOrdenEntregaResponse_QNAME = new QName("http://www.example.com/demosoap/gen", "verificarOrdenEntregaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demosoap.gen
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
     * Create an instance of {@link ConciliarFacturaUnicaRequest }
     * 
     */
    public ConciliarFacturaUnicaRequest createConciliarFacturaUnicaRequest() {
        return new ConciliarFacturaUnicaRequest();
    }

    /**
     * Create an instance of {@link ConciliarFacturaUnicaResponse }
     * 
     */
    public ConciliarFacturaUnicaResponse createConciliarFacturaUnicaResponse() {
        return new ConciliarFacturaUnicaResponse();
    }

    /**
     * Create an instance of {@link EnviarFacturaUnicaRequest }
     * 
     */
    public EnviarFacturaUnicaRequest createEnviarFacturaUnicaRequest() {
        return new EnviarFacturaUnicaRequest();
    }

    /**
     * Create an instance of {@link EnviarFacturaUnicaResponse }
     * 
     */
    public EnviarFacturaUnicaResponse createEnviarFacturaUnicaResponse() {
        return new EnviarFacturaUnicaResponse();
    }

    /**
     * Create an instance of {@link VerificarOrdenEntregaRequest }
     * 
     */
    public VerificarOrdenEntregaRequest createVerificarOrdenEntregaRequest() {
        return new VerificarOrdenEntregaRequest();
    }

    /**
     * Create an instance of {@link VerificarOrdenEntregaResponse }
     * 
     */
    public VerificarOrdenEntregaResponse createVerificarOrdenEntregaResponse() {
        return new VerificarOrdenEntregaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularFacturaUnicaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnularFacturaUnicaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/demosoap/gen", name = "anularFacturaUnicaRequest")
    public JAXBElement<AnularFacturaUnicaRequest> createAnularFacturaUnicaRequest(AnularFacturaUnicaRequest value) {
        return new JAXBElement<AnularFacturaUnicaRequest>(_AnularFacturaUnicaRequest_QNAME, AnularFacturaUnicaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularFacturaUnicaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnularFacturaUnicaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/demosoap/gen", name = "anularFacturaUnicaResponse")
    public JAXBElement<AnularFacturaUnicaResponse> createAnularFacturaUnicaResponse(AnularFacturaUnicaResponse value) {
        return new JAXBElement<AnularFacturaUnicaResponse>(_AnularFacturaUnicaResponse_QNAME, AnularFacturaUnicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConciliarFacturaUnicaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConciliarFacturaUnicaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/demosoap/gen", name = "conciliarFacturaUnicaRequest")
    public JAXBElement<ConciliarFacturaUnicaRequest> createConciliarFacturaUnicaRequest(ConciliarFacturaUnicaRequest value) {
        return new JAXBElement<ConciliarFacturaUnicaRequest>(_ConciliarFacturaUnicaRequest_QNAME, ConciliarFacturaUnicaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConciliarFacturaUnicaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConciliarFacturaUnicaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/demosoap/gen", name = "conciliarFacturaUnicaResponse")
    public JAXBElement<ConciliarFacturaUnicaResponse> createConciliarFacturaUnicaResponse(ConciliarFacturaUnicaResponse value) {
        return new JAXBElement<ConciliarFacturaUnicaResponse>(_ConciliarFacturaUnicaResponse_QNAME, ConciliarFacturaUnicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarFacturaUnicaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnviarFacturaUnicaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/demosoap/gen", name = "enviarFacturaUnicaRequest")
    public JAXBElement<EnviarFacturaUnicaRequest> createEnviarFacturaUnicaRequest(EnviarFacturaUnicaRequest value) {
        return new JAXBElement<EnviarFacturaUnicaRequest>(_EnviarFacturaUnicaRequest_QNAME, EnviarFacturaUnicaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarFacturaUnicaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnviarFacturaUnicaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/demosoap/gen", name = "enviarFacturaUnicaResponse")
    public JAXBElement<EnviarFacturaUnicaResponse> createEnviarFacturaUnicaResponse(EnviarFacturaUnicaResponse value) {
        return new JAXBElement<EnviarFacturaUnicaResponse>(_EnviarFacturaUnicaResponse_QNAME, EnviarFacturaUnicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarOrdenEntregaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificarOrdenEntregaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/demosoap/gen", name = "verificarOrdenEntregaRequest")
    public JAXBElement<VerificarOrdenEntregaRequest> createVerificarOrdenEntregaRequest(VerificarOrdenEntregaRequest value) {
        return new JAXBElement<VerificarOrdenEntregaRequest>(_VerificarOrdenEntregaRequest_QNAME, VerificarOrdenEntregaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarOrdenEntregaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificarOrdenEntregaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.example.com/demosoap/gen", name = "verificarOrdenEntregaResponse")
    public JAXBElement<VerificarOrdenEntregaResponse> createVerificarOrdenEntregaResponse(VerificarOrdenEntregaResponse value) {
        return new JAXBElement<VerificarOrdenEntregaResponse>(_VerificarOrdenEntregaResponse_QNAME, VerificarOrdenEntregaResponse.class, null, value);
    }

}

//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.19 a las 09:55:37 AM ECT 
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
    private final static QName _ConciliarFacturaUnica_QNAME = new QName("http://www.baeldung.com/springsoap/gen", "conciliarFacturaUnica");
    private final static QName _ConciliarFacturaUnicaResponse_QNAME = new QName("http://www.baeldung.com/springsoap/gen", "conciliarFacturaUnicaResponse");
    private final static QName _EnviarFacturaUnica_QNAME = new QName("http://www.baeldung.com/springsoap/gen", "enviarFacturaUnica");
    private final static QName _EnviarFacturaUnicaResponse_QNAME = new QName("http://www.baeldung.com/springsoap/gen", "enviarFacturaUnicaResponse");
    private final static QName _VerificarOrdenEntrega_QNAME = new QName("http://www.baeldung.com/springsoap/gen", "verificarOrdenEntrega");
    private final static QName _VerificarOrdenEntregaResponse_QNAME = new QName("http://www.baeldung.com/springsoap/gen", "verificarOrdenEntregaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baeldung.springsoap.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnularFacturaUnica }
     * 
     */
    public AnularFacturaUnica createAnularFacturaUnica() {
        return new AnularFacturaUnica();
    }

    /**
     * Create an instance of {@link AnularFacturaUnicaResponse }
     * 
     */
    public AnularFacturaUnicaResponse createAnularFacturaUnicaResponse() {
        return new AnularFacturaUnicaResponse();
    }

    /**
     * Create an instance of {@link ConciliarFacturaUnica }
     * 
     */
    public ConciliarFacturaUnica createConciliarFacturaUnica() {
        return new ConciliarFacturaUnica();
    }

    /**
     * Create an instance of {@link ConciliarFacturaUnicaResponse }
     * 
     */
    public ConciliarFacturaUnicaResponse createConciliarFacturaUnicaResponse() {
        return new ConciliarFacturaUnicaResponse();
    }

    /**
     * Create an instance of {@link EnviarFacturaUnica }
     * 
     */
    public EnviarFacturaUnica createEnviarFacturaUnica() {
        return new EnviarFacturaUnica();
    }

    /**
     * Create an instance of {@link EnviarFacturaUnicaResponse }
     * 
     */
    public EnviarFacturaUnicaResponse createEnviarFacturaUnicaResponse() {
        return new EnviarFacturaUnicaResponse();
    }

    /**
     * Create an instance of {@link VerificarOrdenEntrega }
     * 
     */
    public VerificarOrdenEntrega createVerificarOrdenEntrega() {
        return new VerificarOrdenEntrega();
    }

    /**
     * Create an instance of {@link VerificarOrdenEntregaResponse }
     * 
     */
    public VerificarOrdenEntregaResponse createVerificarOrdenEntregaResponse() {
        return new VerificarOrdenEntregaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularFacturaUnica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnularFacturaUnica }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.baeldung.com/springsoap/gen", name = "anularFacturaUnica")
    public JAXBElement<AnularFacturaUnica> createAnularFacturaUnica(AnularFacturaUnica value) {
        return new JAXBElement<AnularFacturaUnica>(_AnularFacturaUnica_QNAME, AnularFacturaUnica.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConciliarFacturaUnica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConciliarFacturaUnica }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.baeldung.com/springsoap/gen", name = "conciliarFacturaUnica")
    public JAXBElement<ConciliarFacturaUnica> createConciliarFacturaUnica(ConciliarFacturaUnica value) {
        return new JAXBElement<ConciliarFacturaUnica>(_ConciliarFacturaUnica_QNAME, ConciliarFacturaUnica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConciliarFacturaUnicaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConciliarFacturaUnicaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.baeldung.com/springsoap/gen", name = "conciliarFacturaUnicaResponse")
    public JAXBElement<ConciliarFacturaUnicaResponse> createConciliarFacturaUnicaResponse(ConciliarFacturaUnicaResponse value) {
        return new JAXBElement<ConciliarFacturaUnicaResponse>(_ConciliarFacturaUnicaResponse_QNAME, ConciliarFacturaUnicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarFacturaUnica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnviarFacturaUnica }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.baeldung.com/springsoap/gen", name = "enviarFacturaUnica")
    public JAXBElement<EnviarFacturaUnica> createEnviarFacturaUnica(EnviarFacturaUnica value) {
        return new JAXBElement<EnviarFacturaUnica>(_EnviarFacturaUnica_QNAME, EnviarFacturaUnica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarFacturaUnicaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnviarFacturaUnicaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.baeldung.com/springsoap/gen", name = "enviarFacturaUnicaResponse")
    public JAXBElement<EnviarFacturaUnicaResponse> createEnviarFacturaUnicaResponse(EnviarFacturaUnicaResponse value) {
        return new JAXBElement<EnviarFacturaUnicaResponse>(_EnviarFacturaUnicaResponse_QNAME, EnviarFacturaUnicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarOrdenEntrega }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificarOrdenEntrega }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.baeldung.com/springsoap/gen", name = "verificarOrdenEntrega")
    public JAXBElement<VerificarOrdenEntrega> createVerificarOrdenEntrega(VerificarOrdenEntrega value) {
        return new JAXBElement<VerificarOrdenEntrega>(_VerificarOrdenEntrega_QNAME, VerificarOrdenEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarOrdenEntregaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificarOrdenEntregaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.baeldung.com/springsoap/gen", name = "verificarOrdenEntregaResponse")
    public JAXBElement<VerificarOrdenEntregaResponse> createVerificarOrdenEntregaResponse(VerificarOrdenEntregaResponse value) {
        return new JAXBElement<VerificarOrdenEntregaResponse>(_VerificarOrdenEntregaResponse_QNAME, VerificarOrdenEntregaResponse.class, null, value);
    }

}

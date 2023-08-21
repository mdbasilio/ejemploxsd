//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.21 a las 02:01:03 PM ECT 
//


package com.example.demosoap.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conciliarFacturaUnicaRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conciliarFacturaUnicaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tramaconcilia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conciliarFacturaUnicaRequest", propOrder = {
    "tramaconcilia"
})
public class ConciliarFacturaUnicaRequest {

    protected String tramaconcilia;

    /**
     * Obtiene el valor de la propiedad tramaconcilia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTramaconcilia() {
        return tramaconcilia;
    }

    /**
     * Define el valor de la propiedad tramaconcilia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTramaconcilia(String value) {
        this.tramaconcilia = value;
    }

}

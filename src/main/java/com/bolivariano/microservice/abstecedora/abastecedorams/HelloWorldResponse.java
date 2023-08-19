package com.bolivariano.microservice.abstecedora.abastecedorams;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HelloWorldResponse")
public class HelloWorldResponse {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
package com.bolivariano.microservice.abstecedora.abastecedorams;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HelloWorldRequest")
public class HelloWorldRequest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
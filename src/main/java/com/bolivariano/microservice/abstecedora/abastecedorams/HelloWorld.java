package com.bolivariano.microservice.abstecedora.abastecedorams;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class HelloWorld {

    @PayloadRoot(namespace = "http://localhost:8080/hello-world", localPart = "HelloWorldRequest")
    @ResponsePayload
    public HelloWorldResponse helloWorld(@RequestPayload HelloWorldRequest request) {
        HelloWorldResponse response = new HelloWorldResponse();
        response.setMessage("Hello, " + request.getName() + "!");
        return response;
    }

}



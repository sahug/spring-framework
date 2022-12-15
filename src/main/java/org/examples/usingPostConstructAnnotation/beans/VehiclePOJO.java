package org.examples.usingPostConstructAnnotation.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class VehiclePOJO {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }

    @PostConstruct
    public void initialize() {
        this.name = "Name from PostConstruct Annotation";
    }

}

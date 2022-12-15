package org.examples.usingComponentAnnotation.beans;

import org.springframework.stereotype.Component;

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

}

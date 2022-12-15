package org.examples.usingPreDestroyAnnotation.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

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

    /* Executed before destroying the bean */
    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Vehicle Bean");
    }

}

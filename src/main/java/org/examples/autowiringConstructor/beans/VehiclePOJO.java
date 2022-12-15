package org.examples.autowiringConstructor.beans;

import org.springframework.stereotype.Component;

@Component
public class VehiclePOJO {

    public VehiclePOJO(){
        System.out.println("Vehicle bean created by Spring");
    }
    private String name = "Audi 8";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println(
                "Printing Hello from Component Vehicle Bean");
    }

    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}

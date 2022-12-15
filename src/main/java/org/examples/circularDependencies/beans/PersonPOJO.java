package org.examples.circularDependencies.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonPOJO {
    private String name = "Lucy";
    private final VehiclePOJO vehiclePOJO;

    @Autowired
    public PersonPOJO(VehiclePOJO vehiclePOJO){
        System.out.println("Person bean created by Spring");
        this.vehiclePOJO = vehiclePOJO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehiclePOJO getVehiclePOJO() {
        return vehiclePOJO;
    }
}

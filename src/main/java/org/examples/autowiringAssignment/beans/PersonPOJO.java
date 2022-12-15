package org.examples.autowiringAssignment.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class PersonPOJO {

    private String name = "Lucy";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final VehiclePOJO vehiclePOJO;

    public VehiclePOJO getVehiclePOJO() {
        return vehiclePOJO;
    }

    @Autowired
    public PersonPOJO(VehiclePOJO vehiclePOJO){
        this.vehiclePOJO = vehiclePOJO;
    }
}

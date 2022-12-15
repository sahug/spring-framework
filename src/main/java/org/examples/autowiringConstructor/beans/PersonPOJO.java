package org.examples.autowiringConstructor.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonPOJO {

    private String name = "Lucy";

    /*
    The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */

    @Autowired
    public PersonPOJO(VehiclePOJO vehiclePOJO) {
        System.out.println("Person bean created by Spring");
        this.vehiclePOJO = vehiclePOJO;
    }

    private VehiclePOJO vehiclePOJO;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehiclePOJO getVehiclePOJO(){
        return vehiclePOJO;
    }

    /*@Autowired*/
    public void setVehiclePOJO(VehiclePOJO vehiclePOJO) {
        this.vehiclePOJO = vehiclePOJO;
    }
}

package org.examples.wiringBeansWAutowiring.beans;

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

    public void setVehiclePOJO(VehiclePOJO vehiclePOJO) {
        this.vehiclePOJO = vehiclePOJO;
    }
}

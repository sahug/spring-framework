package org.examples.eagerInstantiation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
/* Default scope is Singleton in Spring */
/* Default instantiation is eager */
public class VehiclePOJO {

    @Autowired
    public VehiclePOJO(){
        System.out.println("Vehicle bean created by Spring");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package org.examples.lazyInstantiation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
/* Default scope is Singleton in Spring */
/* Default instantiation is eager. Use @Lazy to make the instantiation lazy */
@Lazy
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

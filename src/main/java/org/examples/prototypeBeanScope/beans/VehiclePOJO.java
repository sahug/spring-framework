package org.examples.prototypeBeanScope.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/* Default scope is Singleton in Spring */
/* With Prototype scope we get different bean every time we reference it */
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
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

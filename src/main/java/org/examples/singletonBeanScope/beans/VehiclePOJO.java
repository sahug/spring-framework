package org.examples.singletonBeanScope.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/* Default scope is Singleton in Spring */
@Scope(BeanDefinition.SCOPE_SINGLETON)
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

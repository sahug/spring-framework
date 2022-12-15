package org.examples.autowiringInsideSpring.main;

import org.examples.autowiringInsideSpring.beans.PersonPOJO;
import org.examples.autowiringInsideSpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringInsideSpring {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        PersonPOJO personPOJO = context.getBean(PersonPOJO.class);
        System.out.println("Person name from Spring Context is: " + personPOJO.getName());
        System.out.println("Vehicle that Person own is: " + personPOJO.getVehiclePOJO());
    }

}

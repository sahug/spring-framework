package org.examples.circularDependencies.main;

import org.examples.circularDependencies.beans.PersonPOJO;
import org.examples.circularDependencies.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependencies {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        PersonPOJO personPOJO = context.getBean(PersonPOJO.class);
        System.out.println("Person name from Spring Context is: " + personPOJO.getName());
        System.out.println("Vehicle that Person own is: " + personPOJO.getVehiclePOJO());
    }

}

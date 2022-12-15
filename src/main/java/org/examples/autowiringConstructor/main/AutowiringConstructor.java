package org.examples.autowiringConstructor.main;

import org.examples.autowiringConstructor.beans.PersonPOJO;
import org.examples.autowiringConstructor.beans.VehiclePOJO;
import org.examples.autowiringConstructor.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringConstructor {

    public static void main(String args[]) {
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        PersonPOJO personPOJO = annotationConfigApplicationContext.getBean(PersonPOJO.class);
        VehiclePOJO vehiclePOJO = annotationConfigApplicationContext.getBean(VehiclePOJO.class);
        System.out.println("Person name from Spring Context is: " + personPOJO.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO.getName());
        System.out.println("Vehicle that Person own is: " + personPOJO.getVehiclePOJO());
    }
}

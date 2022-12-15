package org.examples.wiringBeansWAutowiring.main;

import org.examples.wiringBeansWAutowiring.beans.PersonPOJO;
import org.examples.wiringBeansWAutowiring.beans.VehiclePOJO;
import org.examples.wiringBeansWAutowiring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WiringBeansWAutowiring {

    public static void main(String args[]) {
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        PersonPOJO personPOJO = annotationConfigApplicationContext.getBean(PersonPOJO.class);
        VehiclePOJO vehiclePOJO = annotationConfigApplicationContext.getBean(VehiclePOJO.class);
        System.out.println("Person name from Spring Context is: " + personPOJO.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO.getName());
        System.out.println("Vehicle that Person own is: " + personPOJO.getVehiclePOJO());
    }
}

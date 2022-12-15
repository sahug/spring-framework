package org.examples.wiringBeansWMethodCall.main;

import org.examples.wiringBeansWMethodCall.beans.PersonPOJO;
import org.examples.wiringBeansWMethodCall.beans.VehiclePOJO;
import org.examples.wiringBeansWMethodCall.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WiringBeansWMethodCall {

    public static void main(String args[]) {
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        PersonPOJO personPOJO = annotationConfigApplicationContext.getBean(PersonPOJO.class);
        VehiclePOJO vehiclePOJO = annotationConfigApplicationContext.getBean(VehiclePOJO.class);
        System.out.println("Person name from Spring Context is: " + personPOJO.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO.getName());
        System.out.println("Vehicle that Person own is: " + personPOJO.getVehiclePOJO());
    }
}

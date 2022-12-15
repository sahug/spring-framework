package org.examples.usingPrimaryAnnotation.main;


import org.examples.usingPrimaryAnnotation.beans.VehiclePOJO;
import org.examples.usingPrimaryAnnotation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsingPrimaryAnnotation {

    public static void main(String[] args) {

        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehiclePOJO vehiclePOJO1 = annotationConfigApplicationContext.getBean("audiVehicle", VehiclePOJO.class);
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO1.getName());

        VehiclePOJO vehiclePOJO2 = annotationConfigApplicationContext.getBean("bmwVehicle", VehiclePOJO.class);
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO2.getName());

        VehiclePOJO vehiclePOJO3 = annotationConfigApplicationContext.getBean("mercedesVehicle", VehiclePOJO.class);
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO3.getName());

        /* If name for the bean is not provided Primary bean will be called */
        VehiclePOJO vehiclePOJO4 = annotationConfigApplicationContext.getBean(VehiclePOJO.class);
        System.out.println("PRIMARY or DEFAULT Vehicle name from Spring Context is: " + vehiclePOJO4.getName());

    }
}

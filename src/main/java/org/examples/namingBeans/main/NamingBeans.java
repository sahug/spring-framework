package org.examples.namingBeans.main;


import org.examples.namingBeans.beans.VehiclePOJO;
import org.examples.namingBeans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NamingBeans {

    public static void main(String[] args) {

        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehiclePOJO vehiclePOJO1 = annotationConfigApplicationContext.getBean("audiVehicle", VehiclePOJO.class);
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO1.getName());

        VehiclePOJO vehiclePOJO2 = annotationConfigApplicationContext.getBean("bmwVehicle", VehiclePOJO.class);
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO2.getName());

        VehiclePOJO vehiclePOJO3 = annotationConfigApplicationContext.getBean("mercedesVehicle", VehiclePOJO.class);
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO3.getName());

    }
}

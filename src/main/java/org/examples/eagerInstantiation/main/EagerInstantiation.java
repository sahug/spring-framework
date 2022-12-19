package org.examples.eagerInstantiation.main;

import org.examples.eagerInstantiation.beans.VehiclePOJO;
import org.examples.eagerInstantiation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EagerInstantiation {

    public static void main(String[] args) {

        /* With eager instantiation the beans are created at the start of the application.
        * Here we can see in the output that the message from the bean is displayed before the msg from the mail class */
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the Vehicle bean from the Spring Context");
        VehiclePOJO vehiclePOJO = annotationConfigApplicationContext.getBean(VehiclePOJO.class);
        System.out.println("After retrieving the Vehicle bean from the Spring Context");
    }
}

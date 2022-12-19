package org.examples.lazyInstantiation.main;

import org.examples.lazyInstantiation.beans.VehiclePOJO;
import org.examples.lazyInstantiation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyInstantiation {

    public static void main(String[] args) {

        /* With lazy instantiation the beans are created when the application context is created. */
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the Vehicle bean from the Spring Context");
        /* Beans are created here */
        VehiclePOJO vehiclePOJO = annotationConfigApplicationContext.getBean(VehiclePOJO.class);
        System.out.println("After retrieving the Vehicle bean from the Spring Context");
    }
}

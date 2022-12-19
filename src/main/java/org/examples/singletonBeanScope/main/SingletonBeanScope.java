package org.examples.singletonBeanScope.main;

import org.examples.singletonBeanScope.beans.VehiclePOJO;
import org.examples.singletonBeanScope.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonBeanScope {

    public static void main(String[] args) {

        /* Create IoC using ApplicationContext interface and pass configuration */
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehiclePOJO vehiclePOJO1 = annotationConfigApplicationContext.getBean(VehiclePOJO.class);
        VehiclePOJO vehiclePOJO2 = annotationConfigApplicationContext.getBean(VehiclePOJO.class);

        System.out.println("Component Vehicle name from spring context : " + vehiclePOJO1.hashCode());
        System.out.println("Component Vehicle name from spring context : " + vehiclePOJO2.hashCode());

        if(vehiclePOJO1 == vehiclePOJO2) {
            System.out.println("VehicleServices bean is a singleton scoped bean.");
        }
    }
}

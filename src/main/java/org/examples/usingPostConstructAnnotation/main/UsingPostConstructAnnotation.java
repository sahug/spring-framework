package org.examples.usingPostConstructAnnotation.main;

import org.examples.usingPostConstructAnnotation.beans.VehiclePOJO;
import org.examples.usingPostConstructAnnotation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsingPostConstructAnnotation {

    public static void main(String[] args) {

        /* Create IoC using ApplicationContext interface and pass configuration */
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehiclePOJO vehiclePOJO = annotationConfigApplicationContext.getBean(VehiclePOJO.class);

        /* The name is set on PostConstruct * */
        System.out.println("Component Vehicle name from spring context : " + vehiclePOJO.getName());

        vehiclePOJO.printHello();
    }
}

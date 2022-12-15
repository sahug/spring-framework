package org.examples.usingComponentAnnotation.main;

import org.examples.usingComponentAnnotation.beans.VehiclePOJO;
import org.examples.usingComponentAnnotation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsingComponentAnnotation {

    public static void main(String[] args) {

        /* Create IoC using ApplicationContext interface and pass configuration */
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehiclePOJO vehiclePOJO = annotationConfigApplicationContext.getBean(VehiclePOJO.class);

        /* The name will print Null as we do not have control of creating the object via component.
        Object will be created automatically during run time.
        * */
        System.out.println("Component Vehicle name from spring context : " + vehiclePOJO.getName());

        vehiclePOJO.printHello();
    }
}

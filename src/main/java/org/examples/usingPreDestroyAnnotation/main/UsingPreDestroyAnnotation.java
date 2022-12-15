package org.examples.usingPreDestroyAnnotation.main;

import org.examples.usingPreDestroyAnnotation.beans.VehiclePOJO;
import org.examples.usingPreDestroyAnnotation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsingPreDestroyAnnotation {

    public static void main(String[] args) {

        /* Create IoC using ApplicationContext interface and pass configuration */
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehiclePOJO vehiclePOJO = annotationConfigApplicationContext.getBean(VehiclePOJO.class);

        /* The name is set on PostConstruct * */
        System.out.println("Component Vehicle name from spring context : " + vehiclePOJO.getName());

        vehiclePOJO.printHello();

        /* PreDestroy will be called before closing the bean */
        annotationConfigApplicationContext.close();
    }
}

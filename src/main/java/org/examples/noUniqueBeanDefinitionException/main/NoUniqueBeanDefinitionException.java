package org.examples.noUniqueBeanDefinitionException.main;

import org.examples.noUniqueBeanDefinitionException.beans.VehiclePOJO;
import org.examples.noUniqueBeanDefinitionException.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NoUniqueBeanDefinitionException {

    public static void main(String[] args) {

        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /* Throws NoUniqueBeanDefinitionException */
//        VehiclePOJO vehiclePOJO1 = annotationConfigApplicationContext.getBean(VehiclePOJO.class);

        /* Calling bean by method name to handle NoUniqueBeanDefinitionException */
        VehiclePOJO vehiclePOJO2 = annotationConfigApplicationContext.getBean("vehicle1", VehiclePOJO.class);
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO2.getName());
    }
}

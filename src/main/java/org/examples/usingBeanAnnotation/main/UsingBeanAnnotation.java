package org.examples.usingBeanAnnotation.main;

import org.examples.usingBeanAnnotation.beans.VehiclePOJO;
import org.examples.usingBeanAnnotation.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsingBeanAnnotation {

    public static void main(String[] args) {

        /* Object using Non Spring Context */
        VehiclePOJO vehiclePOJO1 = new VehiclePOJO();
        vehiclePOJO1.setName("Honda City");
        System.out.println("Vehicle name from non-spring context : " + vehiclePOJO1.getName());

        /* Objects using Spring Context */
        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */

        /* Create IoC using ApplicationContext interface and pass configuration */
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /* Fetch primary bean */
        VehiclePOJO vehiclePOJO2 = annotationConfigApplicationContext.getBean(VehiclePOJO.class);
        System.out.println("Vehicle name from spring context : " + vehiclePOJO2.getName());

        /*
        We don’t need to do any explicit casting while fetching a bean from context.
        Spring is smart enough to look for a bean of the type you requested in its context.
        If such a bean doesn't exist,Spring will throw an exception.
        * */
        String hello = annotationConfigApplicationContext.getBean(String.class);
        System.out.println("String value from Spring Context is: " + hello);
        Integer num = annotationConfigApplicationContext.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: " + num);
    }
}

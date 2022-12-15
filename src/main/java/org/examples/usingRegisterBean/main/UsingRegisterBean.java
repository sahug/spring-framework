package org.examples.usingRegisterBean.main;

import org.examples.usingRegisterBean.beans.VehiclePOJO;
import org.examples.usingRegisterBean.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class UsingRegisterBean {

    public static void main(String[] args) {

        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /* One way to create Supplier */
        VehiclePOJO volkswagen = new VehiclePOJO();
        volkswagen.setName("Volkswagen");
        Supplier<VehiclePOJO> volkswagenSupplier = () -> volkswagen;

        /* Another way to create Supplier */
        Supplier<VehiclePOJO> audiSupplier = () -> {
            VehiclePOJO audi = new VehiclePOJO();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("RandomNumber = " + randomNumber);

        /* Register beans based on the condition */
        /* Need to supply bean name, bean class and supplier */
        if((randomNumber % 2) == 0) {
            annotationConfigApplicationContext.registerBean("volkswagen", VehiclePOJO.class, volkswagenSupplier);
        } else {
            annotationConfigApplicationContext.registerBean("audi", VehiclePOJO.class, audiSupplier);
        }

        VehiclePOJO vwVehicle = null;
        VehiclePOJO audiVehicle = null;

        /* Get the registered beans.
        * Bean are registered based on the above condition based on random number.
        * Since we don't know which beans will be created we are using Try/Catch to catch any exception */
        try {
            vwVehicle  = annotationConfigApplicationContext.getBean("volkswagen", VehiclePOJO.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating Volkswagen vehicle");
        }

        try {
            audiVehicle  = annotationConfigApplicationContext.getBean("audi", VehiclePOJO.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while creating Audi vehicle");
        }

        /* Call the getName method for the beans */
        if(null != vwVehicle) {
            System.out.println("Programming Vehicle name from Spring Context is: " + vwVehicle.getName());
        } else {
            System.out.println("Programming Vehicle name from Spring Context is: " + audiVehicle.getName());
        }

    }
}

package org.examples.usingXMLConfiguration.main;

import org.examples.usingXMLConfiguration.beans.VehiclePOJO;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UsingXMLConfiguration {

    public static void main(String[] args) {

        var classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        VehiclePOJO vehiclePOJO = classPathXmlApplicationContext.getBean(VehiclePOJO.class);
        System.out.println("Vehicle name from Spring Context is: " + vehiclePOJO.getName());
    }
}

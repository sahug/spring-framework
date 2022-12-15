package org.examples.autowiringInsideSpring.config;

import org.examples.autowiringInsideSpring.beans.VehiclePOJO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.

To tell Spring it needs to search for classes annotated
with stereotype annotations, we use the @ComponentScan annotation over the
configuration class.
* */

@Configuration
@ComponentScan(basePackages = "org.examples.autowiringInsideSpring.beans")
public class ProjectConfig {

    /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned
    value to the context.
    * */
    @Bean
    VehiclePOJO vehiclePOJO1() {
        var veh = new VehiclePOJO();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    VehiclePOJO vehiclePOJO2() {
        var veh = new VehiclePOJO();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    @Primary
    VehiclePOJO vehiclePOJO3() {
        var veh = new VehiclePOJO();
        veh.setName("Ferrari");
        return veh;
    }
}

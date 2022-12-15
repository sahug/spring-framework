package org.examples.namingBeans.config;

import org.examples.namingBeans.beans.VehiclePOJO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */

@Configuration
public class ProjectConfig {

    /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned
    value to the context.
    * */
    @Bean(name = "audiVehicle")
    VehiclePOJO vehicle1() {
        var veh = new VehiclePOJO();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean(value = "bmwVehicle")
    VehiclePOJO vehicle2() {
        var veh = new VehiclePOJO();
        veh.setName("BMW XS");
        return veh;
    }

    @Bean("mercedesVehicle")
    VehiclePOJO vehicle3() {
        var veh = new VehiclePOJO();
        veh.setName("Mercedes");
        return veh;
    }
}

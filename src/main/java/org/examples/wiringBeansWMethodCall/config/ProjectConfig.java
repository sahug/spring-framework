package org.examples.wiringBeansWMethodCall.config;

import org.examples.wiringBeansWMethodCall.beans.VehiclePOJO;
import org.examples.wiringBeansWMethodCall.beans.PersonPOJO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */

@Configuration
public class ProjectConfig {

    @Bean
    public VehiclePOJO vehiclePojo() {
        var vehicle = new VehiclePOJO();
        vehicle.setName("Audi 8");
        return vehicle;
    }

    /*
    Here in the below code, we are trying to wire or establish a relationship between Person and
    Vehicle, by invoking the vehiclePOJO() bean method from personPOJO() bean method.
    Spring will make sure to have only 1 vehicle bean is created and also vehicle bean will
    be created first always as person bean has dependency on it.
    * */

    @Bean
    public PersonPOJO personPOJO() {
        var person = new PersonPOJO();
        person.setName("Lucy");
        person.setVehiclePOJO(vehiclePojo());
        return person;
    }

}

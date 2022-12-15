package org.examples.wiringBeansWMethodParameter.config;

import org.examples.wiringBeansWMethodParameter.beans.VehiclePOJO;
import org.examples.wiringBeansWMethodParameter.beans.PersonPOJO;
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
    Here in the below code, we are trying to wire or establish a relationship between Person
    and Vehicle, by passing the vehicle as a method parameter to the person() bean method.
    Spring injects the vehicle bean to the person bean using Dependency Injection. Spring will
    make sure to have only 1 vehicle bean is created and also vehicle bean will be created
    first always as person bean has dependency on it.
    * */

    @Bean
    public PersonPOJO personPOJO(VehiclePOJO vehiclePOJO) {
        var person = new PersonPOJO();
        person.setName("Lucy");
        person.setVehiclePOJO(vehiclePOJO);
        return person;
    }

}

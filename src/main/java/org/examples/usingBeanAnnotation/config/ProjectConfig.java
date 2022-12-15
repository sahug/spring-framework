package org.examples.usingBeanAnnotation.config;

import org.examples.usingBeanAnnotation.beans.VehiclePOJO;
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

    /* You can use name or value to name a bean and fetch it using this name */
    @Bean
    VehiclePOJO vehiclePojo() {
        var veh = new VehiclePOJO();
        veh.setName("Audi 8");
        return veh;
    }

    /*
    The method names usually follow verbs notation.But for methods
    which we will use to create beans, can use nouns as names.
    This will be a good practise as the method names will become
    bean names as well in the context.
    * */

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number(){
        return 16;
    }
}

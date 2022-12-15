package org.examples.autowiringInsideSpring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PersonPOJO {
    private String name = "Lucy";
    private final VehiclePOJO vehiclePOJO;

    /* Below code will throw error as the Spring context has no clue which bean we are referring to.
    Throws NoUniqueBeanDefinitionException
    * */

    /*
    @Autowired
    public PersonPOJO(VehiclePOJO vehiclePOJO){
        System.out.println("Person bean created by Spring");
        this.vehiclePOJO = vehiclePOJO;
    }
    */

    /* In the code below we are referring to bean vehiclePOJO1 by parameter name
    It will refer to the bean ProjectConfig.vehiclePOJO1
    * */
    /*
    @Autowired
    public PersonPOJO(VehiclePOJO vehiclePOJO1){
        System.out.println("Person bean created by Spring");
        this.vehiclePOJO = vehiclePOJO1;
    }*/

    /* The code below is similar to the first code block. But here we have declared ProjectConfig.vehiclePOJO1 as Primary
    * So in this case the default or Primary bean will be referred */
    /*
    @Autowired
    public PersonPOJO(VehiclePOJO vehiclePOJO){
        System.out.println("Person bean created by Spring");
        this.vehiclePOJO = vehiclePOJO;
    }*/

    /* Here we are using @Qualifier annotation to refer to the bean.
    The benefit of this is that we can avoid updating the name of bean by mistake as the qualifier indicates the name of the bean.
    And it should not be changed by any developer.
    * */
    @Autowired
    public PersonPOJO(@Qualifier("vehiclePOJO2") VehiclePOJO vehiclePOJO){
        System.out.println("Person bean created by Spring");
        this.vehiclePOJO = vehiclePOJO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehiclePOJO getVehiclePOJO() {
        return vehiclePOJO;
    }
}

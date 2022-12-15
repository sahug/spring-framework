package org.examples.circularDependencies.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class VehiclePOJO {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    private PersonPOJO personPOJO;

    public PersonPOJO getPersonPOJO() {
        return personPOJO;
    }

    public void setPersonPOJO(PersonPOJO personPOJO) {
        this.personPOJO = personPOJO;
    }

    public void printHello(){
        System.out.println(
                "Printing Hello from Component Vehicle Bean");
    }

    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}

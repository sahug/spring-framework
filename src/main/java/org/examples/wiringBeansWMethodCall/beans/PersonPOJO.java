package org.examples.wiringBeansWMethodCall.beans;

public class PersonPOJO {

    public PersonPOJO(){
        System.out.println("Person Bean created by Spring");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* Just creating an object here is not enough for Spring to understand that there is a relation between PersonPOJO and VehiclePOJO
    We have to make sure that while creating the bean for PersonPOJO we establish this link.
    * */
    private VehiclePOJO vehiclePOJO;

    public VehiclePOJO getVehiclePOJO(){
        return vehiclePOJO;
    }

    public void setVehiclePOJO(VehiclePOJO vehiclePOJO) {
        this.vehiclePOJO = vehiclePOJO;
    }
}

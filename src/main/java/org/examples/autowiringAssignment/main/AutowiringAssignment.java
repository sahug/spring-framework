package org.examples.autowiringAssignment.main;

import org.examples.autowiringAssignment.beans.PersonPOJO;
import org.examples.autowiringAssignment.beans.VehiclePOJO;
import org.examples.autowiringAssignment.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringAssignment {

    public static void main(String[] args) {
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = annotationConfigApplicationContext.getBeanNamesForType(PersonPOJO.class);
        PersonPOJO personPOJO = annotationConfigApplicationContext.getBean(PersonPOJO.class);
        String[] names = annotationConfigApplicationContext.getBeanNamesForType(VehiclePOJO.class);

        VehiclePOJO vehiclePOJO = annotationConfigApplicationContext.getBean(VehiclePOJO.class);
        vehiclePOJO.getVehicleServices().playMusic();
        vehiclePOJO.getVehicleServices().moveVehicle();

        personPOJO.getVehiclePOJO().getVehicleServices().playMusic();
        personPOJO.getVehiclePOJO().getVehicleServices().moveVehicle();
    }
}

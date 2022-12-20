package org.examples.customAdviceInsideAOP.main;

import org.examples.customAdviceInsideAOP.config.ProjectConfig;
import org.examples.customAdviceInsideAOP.model.Song;
import org.examples.customAdviceInsideAOP.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomAdviceInsideAOP {

    public static void main(String[] args) {
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleServices = annotationConfigApplicationContext.getBean(VehicleServices.class);

        System.out.println(vehicleServices.getClass());

        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");

        /* Set False to test the Before aspect*/
        /* boolean vehicleStarted = false; */
        boolean vehicleStarted = true;

        String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
        String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
    }
}

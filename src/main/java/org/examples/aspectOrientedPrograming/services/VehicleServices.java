package org.examples.aspectOrientedPrograming.services;

import org.examples.aspectOrientedPrograming.interfaces.Speakers;
import org.examples.aspectOrientedPrograming.interfaces.Tyres;
import org.examples.aspectOrientedPrograming.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class VehicleServices {

    private final Logger logger = Logger.getLogger(VehicleServices.class.getName());

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public String playMusic(boolean vehicleStarted, Song song) {
        /* Commented code is an example of how non-business logic such as logging, etc. will be implemented without AOP.
        * With AOP these logics can be moved to Aspect and keep only business logic here.*/
        /*
        Instant start = Instant.now();
        logger.info("method execution start");

        String music = null;
        if (vehicleStarted) {
            music = speakers.makeSound(song);
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the" +
                    " operation");
        }

        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        */
        return speakers.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted) {
        /* Commented code is an example of how non-business logic such as logging, etc. will be implemented without AOP.
         * With AOP these logics can be moved to Aspect and keep only business logic here.*/
        /*
        Instant start = Instant.now();
        logger.info("method execution start");

        String status = null;
        if (vehicleStarted) {
            status = tyres.rotate();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the" + " operation");
        }

        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        */

        return tyres.rotate();
    }

    public String applyBrake(boolean vehicleStarted) {
        /* Commented code is an example of how non-business logic such as logging, etc. will be implemented without AOP.
         * With AOP these logics can be moved to Aspect and keep only business logic here.*/
        /*
        Instant start = Instant.now();
        logger.info("method execution start");

        String status = null;
        if (vehicleStarted) {
            status = tyres.stop();
        } else {
            logger.log(Level.SEVERE, "Vehicle not started to perform the" + " operation");
        }

        logger.info("method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        */

        return tyres.stop();
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }


}

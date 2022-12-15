package org.examples.autowiringAssignment.implementation;

import org.examples.autowiringAssignment.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(){
        return "Playing music with Bose speakers";
    }
}

package org.examples.aspectOrientedPrograming.implementation;

import org.examples.aspectOrientedPrograming.interfaces.Speakers;
import org.examples.aspectOrientedPrograming.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    public String makeSound(Song song) {
        return "Playing the song " + song.getTitle() + " by "
                + song.getSingerName() +
                " with Sony speakers";
    }

}

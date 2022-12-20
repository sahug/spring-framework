package org.examples.customAdviceInsideAOP.implementation;

import org.examples.customAdviceInsideAOP.interfaces.Speakers;
import org.examples.customAdviceInsideAOP.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound(Song song) {
        return "Playing the song " + song.getTitle() + " by "
                + song.getSingerName() +
                " with Bose speakers";
    }
}

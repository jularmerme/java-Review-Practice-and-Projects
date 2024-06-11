package main.java;

import javax.print.attribute.standard.Media;

public interface State {

    void pause(MediaPlayer mediaPlayer);
    void play(MediaPlayer mediaPlayer);

}

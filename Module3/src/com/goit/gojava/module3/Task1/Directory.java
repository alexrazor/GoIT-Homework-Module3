package com.goit.gojava.module3.Task1;

/**
 * Created by a.lyahovich on 30.05.2016.
 */
public class Directory {
    private TextFile textFile;
    private AudioFile audioFile;
    private PictureFile pictureFile;

    public TextFile getTextFile() {
        return textFile;
    }

    public void setTextFile(TextFile textFile) {
        this.textFile = textFile;
    }

    public AudioFile getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(AudioFile audioFile) {
        this.audioFile = audioFile;
    }

    public PictureFile getPictureFile() {
        return pictureFile;
    }

    public void setPictureFile(PictureFile pictureFile) {
        this.pictureFile = pictureFile;
    }
}

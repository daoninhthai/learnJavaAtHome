package com.company;

public class Television {
    int channel;
    int volumeChannel = 1 ;
    boolean isOn = false;

    public Television(int channel, int volumeChannel, boolean isOn) {
        this.channel = channel;
        this.volumeChannel = volumeChannel;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "Television{" +
                "channel=" + channel +
                ", volumeChannel=" + volumeChannel +
                ", isOn=" + isOn +
                '}';
    }
}

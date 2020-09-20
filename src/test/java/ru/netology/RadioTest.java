package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    public Radio radio = new Radio();

    @Test
    public void shouldNextRadioStation() {
        radio.setStationNumber(8);
        radio.nextRadioStation();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void shouldPrevRadioStation() {
        radio.setStationNumber(1);
        radio.prevRadioStation();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void shouldUpVolumeLevel() {
        radio.setVolumeLevel(10);
        radio.upVolumeLevel();
        assertEquals(10, radio.getVolumeLevel());
        System.out.println("Текущий уровень громкости = " + radio.getVolumeLevel());
    }

    @Test
    public void shouldDownVolumeLevel() {
        radio.setVolumeLevel(5);
        radio.downVolumeLevel();
        assertEquals(4, radio.getVolumeLevel());
        System.out.println("Текущий уровень громкости = " + radio.getVolumeLevel());
    }
 
}


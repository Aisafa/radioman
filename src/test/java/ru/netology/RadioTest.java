package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    public Radio radio = new Radio();

    @Test
    public void shouldNextRadioStation1() {
        radio.setStationNumber(0);
        radio.nextRadioStation();
        assertEquals(1, radio.getStationNumber());
    }

    @Test
    public void shouldNextRadioStation2() {
        radio.setStationNumber(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void shouldPrevRadioStation1() {
        radio.setStationNumber(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getStationNumber());
    }

    @Test
    public void shouldPrevRadioStation2() {
        radio.setStationNumber(3);
        radio.prevRadioStation();
        assertEquals(2, radio.getStationNumber());
    }

    @Test
    public void shouldUpVolumeLevel() {
        radio.setVolumeLevel(5);
        radio.upVolumeLevel();
        assertEquals(6, radio.getVolumeLevel());
        System.out.println("Текущий уровень громкости = " + radio.getVolumeLevel());
    }
    @Test
    public void shouldUpVolumeLevel2() {
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

    @Test
    public void shouldDownVolumeLevel2() {
        radio.setVolumeLevel(0);
        radio.downVolumeLevel();
        assertEquals(0, radio.getVolumeLevel());
        System.out.println("Текущий уровень громкости = " + radio.getVolumeLevel());
    }
}


package ru.netology.constructor;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
Radio radio = new Radio(10, 0, 100, 0 );
ru.netology.Radio radio1 = new ru.netology.Radio(radio);

    @ParameterizedTest
    @CsvFileSource(resources = "/NextRadioStation.csv")
    public void shouldNextRadioStation(String test, int StationNumber, int expected) {
        radio1.setStationNumber(StationNumber);
        radio1.nextRadioStation();
        assertEquals(expected, radio1.getStationNumber());
        System.out.println("Текущая Радиостанция = " + radio1.getStationNumber());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/PrevRadioStation.csv")
    public void shouldPrevRadioStation(String test, int StationNumber, int expected) {
        radio1.setStationNumber(StationNumber);
        radio1.prevRadioStation();
        assertEquals(expected, radio1.getStationNumber());
        System.out.println("Текущая Радиостанция = " + radio1.getStationNumber());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/UpVolumeLevel.csv")
    public void shouldUpVolumeLevel(String test, int VolumeLevel, int expected) {
        radio1.setVolumeLevel(VolumeLevel);
        radio1.upVolumeLevel();
        assertEquals(expected, radio1.getVolumeLevel());
        System.out.println("Текущий уровень громкости = " + radio1.getVolumeLevel());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DownVolumeLevel.csv")
    public void shouldDownVolumeLevel(String test, int VolumeLevel, int expected) {
        radio1.setVolumeLevel(VolumeLevel);
        radio1.downVolumeLevel();
        assertEquals(expected, radio1.getVolumeLevel());
        System.out.println("Текущий уровень громкости = " + radio1.getVolumeLevel());
    }

}


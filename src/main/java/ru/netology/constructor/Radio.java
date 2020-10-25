package ru.netology.constructor;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Radio {
    private int stationNumber = 2;
    private int volumeLevel = 11;
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolumeLevel = 100;
    private int minVolumeLevel = 0;

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolumeLevel() {
        return maxVolumeLevel;
    }

    public int getMinVolumeLevel() {
        return minVolumeLevel;
    }

    public int getStationNumber() {
        return this.stationNumber;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

}

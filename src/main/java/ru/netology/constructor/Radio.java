package ru.netology.constructor;

public class Radio {
    private int stationNumber=5;
    private int volumeLevel;
    private int maxStation = 9;
    private int minStation = 1;
    private int maxVolumeLevel = 25;
    private int minVolumeLevel = 1;

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

    public Radio(int maxStation, int minStation, int maxVolumeLevel, int minVolumeLevel) {
        this.stationNumber = stationNumber;
        this.volumeLevel = volumeLevel;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolumeLevel = maxVolumeLevel;
        this.minVolumeLevel = minVolumeLevel;


    }
}

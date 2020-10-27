package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private int stationNumber;
    private int volumeLevel;
    private int maxStation;
    private int minStation;
    private int maxVolumeLevel;
    private int minVolumeLevel;

    public int getStationNumber() {
        return this.stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber > maxStation) {
            this.stationNumber = this.maxStation;
            return;
        }
        if (stationNumber < minStation) {
            this.stationNumber = this.minStation;
            return;
        }
        this.stationNumber = stationNumber;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel > maxVolumeLevel) {
            this.volumeLevel = this.maxVolumeLevel;
            return;
        }
        if (volumeLevel < minVolumeLevel) {
            this.volumeLevel = this.minVolumeLevel;
            return;
        }
        this.volumeLevel = volumeLevel;
    }

    public void nextRadioStation() {
        if (this.stationNumber < maxStation) {
            this.stationNumber += 1;
        } else {
            this.stationNumber = minStation;
        }
    }

    public void prevRadioStation() {
        {
            if (this.stationNumber > minStation) {
                this.stationNumber -= 1;
            } else {
                this.stationNumber = maxStation;
            }
        }
    }

    public void upVolumeLevel() {
        if (this.volumeLevel < maxVolumeLevel) {
            this.volumeLevel += 1;
        }
    }

    public void downVolumeLevel() {
        if (this.volumeLevel > minVolumeLevel) {
            this.volumeLevel -= 1;
        }
    }
}





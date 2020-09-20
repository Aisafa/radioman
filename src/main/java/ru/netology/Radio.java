package ru.netology;

public class Radio {
    private int stationNumber;
    private int volumeLevel;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolumeLevel = 10;
    private int minVolumeLevel = 0;

    public int getStationNumber() {
        return this.stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void nextRadioStation() {
        if (this.stationNumber < maxStation) {
            this.stationNumber += 1;
            System.out.println("Текущая Радиостанция = " + this.stationNumber);
        } else if (this.stationNumber == maxStation) {
            this.stationNumber = minStation;
        }
    }

    public void prevRadioStation() {
        {
            if (this.stationNumber > minStation) {
                this.stationNumber -= 1;
            } else if (this.stationNumber == minStation) {
                this.stationNumber = maxStation;
            }
            System.out.println("Текущая Радиостанция = " + this.stationNumber);
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





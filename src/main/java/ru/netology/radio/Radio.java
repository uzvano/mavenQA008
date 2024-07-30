package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int numberRadioStation = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = numberRadioStation - 1;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio() {
    }

    public Radio(int station) {
        this.maxRadioStation = station - 1;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int station) {
        if (station >= minRadioStation) {
            if (station <= maxRadioStation) {
                currentRadioStation = station;
            }
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= minVolume) {
            if (volume <= maxVolume) {
                currentVolume = volume;
            }
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        } else {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}

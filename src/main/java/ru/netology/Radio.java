package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 9 && currentRadioStation >= 1) {
            currentRadioStation++;
        } else if (currentRadioStation == 9){
            currentRadioStation = 0;
        } else {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public int getSoundVolume() {
        return soundVolume;
    }
    public void setSoundVolume(int soundVolume) {
        if (soundVolume >= 0 && soundVolume < 10) {
            soundVolume++;
        } else if (soundVolume == 10) {
            soundVolume = 10;
        } else {
            return;
        }
        this.soundVolume = soundVolume;
    }


}

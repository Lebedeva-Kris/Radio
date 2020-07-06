package ru.netology;

public class Radio {
    private int currentRadioStation = 5;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentSoundVolume = 5;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }
    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }


    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }


    public void nextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = 0;
            return;
        } this.currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = 9;
            return;
        } this.currentRadioStation--;
    }


    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }
    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }


    public int getMinSoundVolume() {
        return minSoundVolume;
    }
    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }


    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }
    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public void volumeUp() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        } this.currentSoundVolume++;
    }

    public void volumeDown() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        } this.currentSoundVolume--;
    }


}

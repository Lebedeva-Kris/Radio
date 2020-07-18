package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void nextRadioStation() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public void prevRadioStation() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }


    public void volumeUp() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        this.currentSoundVolume++;
    }

    public void volumeDown() {
        if (currentSoundVolume == minSoundVolume) {
            return;
        }
        this.currentSoundVolume--;
    }


}

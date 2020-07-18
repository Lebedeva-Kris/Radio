package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void shouldSwitchNextRadioStation() {
        Radio radio = new Radio(5, 0, 10, 50, 0, 100);
        int radioStationBeforeNext = radio.getCurrentRadioStation();
        radio.nextRadioStation();
        assertEquals(radioStationBeforeNext + 1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchRadioMoreThanMax() {
        Radio radio = new Radio(12, 0, 10, 50, 0, 100);
        radio.setCurrentRadioStation(radio.getCurrentRadioStation());
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchPrevRadioStation() {
        Radio radio = new Radio(5, 0, 10, 50, 0, 100);
        int radioStationBeforePrev = radio.getCurrentRadioStation();
        radio.prevRadioStation();
        assertEquals(radioStationBeforePrev - 1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchMinPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.prevRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchRadioLessThanMin() {
        Radio radio = new Radio(-1, 0, 10, 50, 0, 100);
        radio.setCurrentRadioStation(radio.getCurrentRadioStation());
        radio.prevRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio(5, 0, 10, 50, 0, 100);
        int soundVolumeBeforeUp = radio.getCurrentSoundVolume();
        radio.volumeUp();
        assertEquals(soundVolumeBeforeUp + 1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldMaxVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(radio.getMaxSoundVolume());
        radio.volumeUp();
        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio(5, 0, 10, 50, 0, 100);
        int soundVolumeBeforeDown = radio.getCurrentSoundVolume();
        radio.volumeDown();
        assertEquals(soundVolumeBeforeDown - 1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldMinVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(radio.getMinSoundVolume());
        radio.volumeDown();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

}
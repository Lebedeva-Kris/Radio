package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldSwitchNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
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
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
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
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.prevRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(50);
        radio.volumeUp();
        assertEquals(51, radio.getCurrentSoundVolume());
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
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(50);
        radio.volumeDown();
        assertEquals(49, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldMinVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(radio.getMinSoundVolume());
        radio.volumeDown();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

}
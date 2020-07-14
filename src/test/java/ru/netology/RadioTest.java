package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    private Radio radio = new Radio(10, 100);

    @Test
    void shouldSwitchNextRadioStation() {
        int radioStationBeforeNext = this.radio.getCurrentRadioStation();
        radio.nextRadioStation();
        assertEquals(radioStationBeforeNext+1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchMaxRadioStation() {
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchPrevRadioStation() {
        int radioStationBeforePrev = radio.getCurrentRadioStation();
        radio.prevRadioStation();
        assertEquals(radioStationBeforePrev-1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchMinPrevRadioStation() {
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.prevRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    void shouldVolumeUp() {
        int soundVolumeBeforeUp = radio.getCurrentSoundVolume();
        radio.volumeUp();
        assertEquals(soundVolumeBeforeUp+1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldMaxVolumeUp() {
        radio.setCurrentSoundVolume(radio.getMaxSoundVolume());
        radio.volumeUp();
        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldVolumeDown() {
        int soundVolumeBeforeDown = radio.getCurrentSoundVolume();
        radio.volumeDown();
        assertEquals(soundVolumeBeforeDown-1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldMinVolumeDown() {
        radio.setCurrentSoundVolume(radio.getMinSoundVolume());
        radio.volumeDown();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

}
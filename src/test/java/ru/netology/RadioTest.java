package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void nextRadioStation() {
        Radio radio = new Radio();
        int radioStationBeforeNext = radio.getCurrentRadioStation();
        radio.nextRadioStation();
        assertEquals(radioStationBeforeNext+1, radio.getCurrentRadioStation());
    }

    @Test
    void maxNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void prevRadioStation() {
        Radio radio = new Radio();
        int radioStationBeforePrev = radio.getCurrentRadioStation();
        radio.prevRadioStation();
        assertEquals(radioStationBeforePrev-1, radio.getCurrentRadioStation());
    }

    @Test
    void minPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio();
        int soundVolumeBeforeUp = radio.getCurrentSoundVolume();
        radio.volumeUp();
        assertEquals(soundVolumeBeforeUp+1, radio.getCurrentSoundVolume());
    }

    @Test
    void maxSoundVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(radio.getMaxSoundVolume());
        radio.volumeUp();
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio();
        int soundVolumeBeforeDown = radio.getCurrentSoundVolume();
        radio.volumeDown();
        assertEquals(soundVolumeBeforeDown-1, radio.getCurrentSoundVolume());
    }

    @Test
    void minSoundVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(radio.getMinSoundVolume());
        radio.volumeDown();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

}
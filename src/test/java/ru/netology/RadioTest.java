package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldChangeCurrentRadioStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(6);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCalculateMaxRadioStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCalculateMinRadioStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeCurrentSoundVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getSoundVolume());
        radio.setSoundVolume(6);
        assertEquals(7, radio.getSoundVolume());
    }

    @Test
    void shouldChangeMaxSoundVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getSoundVolume());
        radio.setSoundVolume(10);
        assertEquals(10, radio.getSoundVolume());
    }

    @Test
    void shouldChangeMinSoundVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getSoundVolume());
        radio.setSoundVolume(0);
        assertEquals(0, radio.getSoundVolume());
    }

}
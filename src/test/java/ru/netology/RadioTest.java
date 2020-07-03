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

}
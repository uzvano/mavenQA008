package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radioOne = new Radio();
    Radio radioTwo = new Radio(20);


    @Test
    public void testSetRadioStationValid() {
        radioOne.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radioOne.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetRadioStationInvalid() {
        radioOne.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radioOne.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetRadioStationInvalid1() {
        radioOne.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radioOne.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRadioStation() {
        for (int i = 0; i <= 9; i++) {
            radioOne.nextRadioStation();
        }
        int expected = 0;
        int actual = radioOne.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRadioStation() {
        for (int i = 9; i >= 0; i--) {
            radioOne.prevRadioStation();
        }
        int expected = 0;
        int actual = radioOne.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetRadioStationValidOne() {
        radioTwo.setCurrentRadioStation(19);
        int expected = 19;
        int actual = radioTwo.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetRadioStationValidTwo() {
        radioTwo.setCurrentRadioStation(20);
        int expected = 0;
        int actual = radioTwo.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeValid() {
        radioOne.setCurrentVolume(50);
        int expected = 50;
        int actual = radioOne.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeInvalid() {
        radioOne.setCurrentVolume(101);
        int expected = 0;
        int actual = radioOne.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeInvalid1() {
        radioOne.setCurrentVolume(-1);
        int expected = 0;
        int actual = radioOne.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {
        for (int i = 0; i <= 100; i++) {
            radioOne.increaseVolume();
        }
        int expected = 100;
        int actual = radioOne.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        for (int i = 100; i >= 0; i--) {
            radioOne.setCurrentVolume(i);
            radioOne.decreaseVolume();
        }
        int expected = 0;
        int actual = radioOne.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

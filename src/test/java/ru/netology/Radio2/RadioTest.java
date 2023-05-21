package ru.netology.Radio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void ifStationNumberBetweenZeroAndNine () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(4);

        int expected = 4;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifStationNumberNine () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifStationNumberMoreThenNine () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifStationNumberEight () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifStationNumberLessThan0 () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifStationNumberTwo () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(2);

        int expected = 2;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifStationNumberZewo () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifcurrentSoundVolumeBetweenZeroAndHundrend () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(50);

        int expected = 50;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ifCurrentSoundVolumeZero () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(5);
        radio.setCurrentSoundVolume(0);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void ifcurrentSoundVolumeLessZero () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifcurrentSoundVolumeOne () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifcurrentSoundVolume100 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifcurrentSoundVolume101 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(101);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifcurrentSoundVolume99 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(99);

        int expected = 99;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationNumberBetween0And9 () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(7);
        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationNumber0 () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationNumber1 () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);
        radio.nextStation();

        int expected = 2;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationNumber9 () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStationNumber8 () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationNumberBetween0and9 () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationNumberIf9 () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationNumberIf0 () {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextVolumeBetween0and100 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(5);
        radio.nextVolume();

        int expected = 6;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextVolumeBetween0 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextVolum99 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(99);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextVolum100 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolumeBetween0And100 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(6);
        radio.prevVolume();

        int expected = 5;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolume0 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolume1 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolume100 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.prevVolume();

        int expected = 99;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolume99 () {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(99);
        radio.prevVolume();

        int expected = 98;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void stationCounterItCounteris20ansStationNum14 () {
        Radio radio = new Radio(20 );
        radio.setCurrentStationNumber(14);

        int expected = 14;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }
}

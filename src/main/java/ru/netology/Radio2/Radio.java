package ru.netology.Radio2;

public class Radio {
    private int currentStationNumber;
    private int currentSoundVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > 9) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 100)
            return;
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;

    }

    public void nextStation () {
        if (currentStationNumber != 9) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prevStation () {
        if (currentStationNumber != 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = 9;
        }
    }
    public void nextVolume () {
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }
    public void prevVolume () {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }
}
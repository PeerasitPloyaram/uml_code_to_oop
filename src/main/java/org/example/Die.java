package org.example;

public class Die {
    private int faceValue;

    private void setFaceValue(int faceValue){
        this.faceValue = faceValue;
    }
    public int getFaceValue() {
        return faceValue;
    }

    public int roll() {
        int value = (int)(Math.random()*(6 - 1 + 1) + 1);
        setFaceValue(value);
        return value;
    }
}

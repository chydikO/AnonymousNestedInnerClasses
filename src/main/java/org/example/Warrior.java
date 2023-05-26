package org.example;

import java.util.List;

public class Warrior extends Unit implements Actions {
    private int accuracy;

    public Warrior(String name, int health, int armor, List<String> weapons, int accuracy) {
        super(name, health, armor, weapons);
        this.accuracy = accuracy;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "Warrior: accuracy=" + accuracy ;
    }


    @Override
    public void Move() {

    }

    @Override
    public void Fight() {

    }

    @Override
    public void Defend() {

    }
}

package org.example;

import java.util.List;

public class Worker extends Unit implements Actions {
    private int power;


    public Worker(String name, int health, int armor, List<String> weapons, int power) {
        super(name ,health, armor, weapons);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + "Worker: power=" + power;
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

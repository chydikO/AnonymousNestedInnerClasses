package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Для одного з класів-нащадків створити вкладений
 * статичний клас (наприклад, для класу «Воїн» це може
 * бути клас «Зброя»). Вкладений клас повинен мати свої
 * поля та методи. Продемонструвати роботу вкладених
 * статичних класів.
 */
public class Warrior extends Unit implements Actions {
    private int accuracy;
    private Weapon weapon = new Weapon();

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

    private class Weapon {
        private String weaponName;

        public Weapon() {
            List<String> weapons = new ArrayList<>(Arrays.asList("sword", "knife", "onion", "crossbow"));
            this.weaponName = weapons.get(new Random().nextInt(weapons.size() - 1));
        }

        @Override
        public String toString() {
            return "Weapon: weaponName= " + weaponName;
        }
    }

    @Override
    public String toString() {
        return "Warrior: accuracy=" + accuracy ;
    }


    @Override
    public void Move() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println("Class name: " + getClass().getName() + " method: " + methodName);
    }

    @Override
    public void Fight() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println("Class name: " + getClass().getName() + " method: " + methodName + " " + weapon);
    }

    @Override
    public void Defend() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println("Class name: " + getClass().getName() + " method: " + methodName);
    }
}

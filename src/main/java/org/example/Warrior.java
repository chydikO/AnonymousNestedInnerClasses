package org.example;

import java.util.*;

/**
 * Для одного з класів-нащадків створити вкладений
 * статичний клас (наприклад, для класу «Воїн» це може
 * бути клас «Зброя»). Вкладений клас повинен мати свої
 * поля та методи. Продемонструвати роботу вкладених
 * статичних класів.
 */
public class Warrior extends Unit implements Actions {
    private int accuracy;
    private Backpack backpack = new Backpack();

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

    private class Backpack {
        List<String> usefulThings;

        public Backpack() {
            List<String> usefulThings = new ArrayList<>(Arrays.asList("first aid kit", "blue electrical tape", "Super glue"));
            this.usefulThings = Collections.singletonList(usefulThings.get(new Random().nextInt(usefulThings.size() - 1)));
        }

        @Override
        public String toString() {
            return "Weapon: weaponName= " + usefulThings;
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
        System.out.println("Class name: " + getClass().getName()
                + ", method: " + methodName
                + ", weapon: " + getRandomWeapon()
                + ", BackPack " + backpack.usefulThings);
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

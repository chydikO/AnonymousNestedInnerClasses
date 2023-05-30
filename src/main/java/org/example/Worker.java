package org.example;

import java.util.List;

/**
 * Для одного з класів-нащадків створити один звичайний
 * та один статичний методи з внутрішніми локальними
 * класами (наприклад, для класу «Робітник» це може бути
 * метод «Працювати» з класом «Робота» та метод
 * «Будувати» з класом «Будівля).В методах повинні бути
 * свої поля, у внутрішніх локальних класах – поля та
 * методи. Продемонструвати можливості внутрішніх
 * локальних класів.
 */
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

    public void working(String workType) {
        class Work {
            String workType;
            public Work(String workType) {
                this.workType = workType;
            }
            void makeWork() {
                System.out.println("Make work " + workType);
            }
        }
    }

    public static void building (String buildingType) {

        class Build {
            String buildingType;
            public Build(String buildingType) {
                this.buildingType = buildingType;
            }
            void maikeBuilding() {
                System.out.println("Make building " + buildingType);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Worker: power=" + power;
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
        System.out.println("Class name: " + getClass().getName() + " method: " + methodName);
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

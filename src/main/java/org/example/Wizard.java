package org.example;

import java.util.List;
import java.util.Random;

public class Wizard extends Unit implements Actions {
    private int powerOfMagic;
    Spell spell;


    public Wizard(String name, int health, int armor, List<String> weapons, int powerOfMagic) {
        super(name, health, armor, weapons);
        this.powerOfMagic = powerOfMagic;
        spell = new Spell();
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    @Override
    public String toString() {
        return super.toString() + "Wizard: powerOfMagic=" + powerOfMagic + "\n";
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
                + ", commitWitchcraft: " + spell.getRandomSpell());
    }

    @Override
    public void Defend() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println("Class name: " + getClass().getName() + " method: " + methodName);
    }

    private class Spell {
        private String[] spills;

        public Spell() {
            this.spills = new String[]{"add health", "add strength", "add protection"};
        }

        public int getSpillsSize() {
            return spills.length;
        }

        public String getRandomSpell() {
            return spills[(new Random().nextInt(spills.length - 1))];
        }

        private String commitWitchcraft(int indexWitchcraft) {
            String result;
            if ((indexWitchcraft < 0) || (indexWitchcraft >= spills.length)) {
                result = "no such witchcraft";
            } else {
                result = spills[indexWitchcraft];
            }
            return result;
        }
    }
}

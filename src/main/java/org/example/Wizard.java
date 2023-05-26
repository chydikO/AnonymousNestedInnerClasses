package org.example;

import java.util.List;

public class Wizard extends Unit implements Actions {
    private int powerOfMagic;


    public Wizard(String name, int health, int armor, List<String> weapons, int powerOfMagic) {
        super(name, health, armor, weapons);
        this.powerOfMagic = powerOfMagic;
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

    }

    @Override
    public void Fight() {

    }

    @Override
    public void Defend() {

    }

    private class Spell {
        private String[] spills;

        public Spell() {
            this.spills = new String[] {"add health", "add strength", "add protection"};
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

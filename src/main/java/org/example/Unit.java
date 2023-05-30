package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Unit {
    private String name;
    private int health;
    private int armor;
    private List<String> weaponsList;

    public Unit(String name, int health, int armor, List<String> weaponsList) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.weaponsList = weaponsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public List<String> getWeapon() {
        return weaponsList;
    }

    public void setWeapon(List<String> weaponsList) {
        this.weaponsList = weaponsList;
    }

    protected String getRandomWeapon() {
        String randomWeapon = weaponsList.get(new Random().nextInt(weaponsList.size() - 1));
        return randomWeapon;
    }

    @Override
    public String toString() {
        return "Unit: name= " + name + " health=" + health + ", armor=" + armor + " weapons= " + weaponsList + "\n";
    }
}

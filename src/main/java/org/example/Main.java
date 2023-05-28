package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Actions wizard = new Wizard(
                "WARLOCK"
                , 100
                , 200
                , new ArrayList<>(Arrays.asList("staff", "dagger", "sword"))
                , 300);

        Actions warrior = new Warrior(
                "warrior"
                ,100
                , 125
                , new ArrayList<>(Arrays.asList("sword", "knife", "onion", "crossbow"))
                , 60);

        Actions worker = new Worker(
                "worker"
                ,100
                , 20
                , new ArrayList<>(Arrays.asList("knife"))
                , 20);

        List<Actions> units = new ArrayList<>();
        units.add(wizard);
        units.add(warrior);
        units.add(worker);

        for (Actions action: units) {
            action.Fight();
        }
        System.out.println();
    }
}
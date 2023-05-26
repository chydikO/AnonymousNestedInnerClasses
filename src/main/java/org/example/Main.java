package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard(
                "WARLOCK"
                , 100
                , 200
                , new ArrayList<>(Arrays.asList("staff", "dagger", "sword"))
                , 300);

        System.out.println();
    }
}
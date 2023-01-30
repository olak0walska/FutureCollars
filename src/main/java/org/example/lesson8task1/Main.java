package org.example.lesson8task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

        List<String> uniqueNames = new ArrayList<>();
        for (String name : names) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }
        System.out.println("Lista bez duplikatów: " + uniqueNames);
        List<String> reverseNames = new ArrayList<>();
        for (int i = uniqueNames.size() - 1; i >= 0; i--) {
            reverseNames.add(uniqueNames.get(i));
        }
        System.out.println("Elementy w odwrotnej kolejności: " + reverseNames);


        String changeFrom = "Anna";
        String changeTo = "Joanna";
        for (int i = 0; i < reverseNames.size(); i++) {
            if (reverseNames.get(i).equals(changeFrom)) {
                reverseNames.set(i, changeTo);
            }
        }
        System.out.println("Elementy po zamianie: " + changeFrom + " -> " + changeTo + ":\n" + reverseNames);
    }
}

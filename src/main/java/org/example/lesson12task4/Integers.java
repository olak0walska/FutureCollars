package org.example.lesson12task4;

import java.util.List;

public class Integers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 10, 11, 13, 22);
        Thread avgThread = new Thread(() -> {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            double avg = (double) sum / numbers.size();
            System.out.println("średnia wynosi: " + avg);
        });
        Thread sumThread = new Thread(() -> {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Suma wynosi: " + sum);
        });
        avgThread.start();
        sumThread.start();
    }
}

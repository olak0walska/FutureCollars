package org.example.lesson5task2;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 15 == 0) {
                System.out.println("FizBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
package org.example.lesson5task2;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < 100; i++)
            array[i] = i + 1;

        for (int i = 0; i < 100; i++) {

            if ((i + 1) % 3 == 0 && ((i + 1) % 5 != 0))
                System.out.println("Fizz");

            if ((i + 1) % 5 == 0 && ((i + 1) % 3 != 0))
                System.out.println("Buzz");

            if ((i + 1) % 15 == 0)
                System.out.println("FizBuzz");

            if ((i + 1) % 3 != 0 && ((i + 1) % 5 != 0))
                System.out.println(array[i]);
        }
    }
}
package org.example.lesson6task9;

public class NumberDivisibility {
    public static void validate(int[] numbers) {
        for (int number : numbers) {
            try {
                if (number % 3 != 0) {
                    throw new IllegalArgumentException("Podana liczba nie jest podzielna przez 3");
                } else System.out.println("podana liczba jest podzielna przez 3");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
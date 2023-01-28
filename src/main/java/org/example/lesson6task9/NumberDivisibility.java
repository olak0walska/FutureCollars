package org.example.lesson6task9;

public class NumberDivisibility {
    public static String divisibility(int[] numbers) {
        for (int number : numbers) {
            try {
                if (number % 3 != 0) {
                    System.out.println("błąd");
                    throw new IllegalArgumentException("Podana liczba nie jest podzielna przez 3");
                } else System.out.println("podana liczba jest podzielna przez 3");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return "";
    }
}


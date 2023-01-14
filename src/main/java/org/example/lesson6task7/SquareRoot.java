package org.example.lesson6task7;

import static java.lang.Math.sqrt;

public class SquareRoot {
    public static double Sqrt(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("liczby ujemnej nie można spierwiastkować!");
        } else {
            return sqrt(number);
        }
    }
}
package org.example.lesson3task5;

import static java.lang.Math.pow;

public class Triangle {
    public static boolean isRectangular(int sideA, int sideB, int longestSide) {
        return pow(longestSide, 2) == pow(sideA, 2) + pow(sideB, 2);
    }
}
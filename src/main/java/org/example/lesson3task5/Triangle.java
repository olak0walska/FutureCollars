package org.example.lesson3task5;

import static java.lang.Math.pow;

public class Triangle {
    public static boolean isItRectangularTriangle(int a, int b, int c) {
        return pow(c, 2) == pow(a, 2) + pow(b, 2);
    }
}
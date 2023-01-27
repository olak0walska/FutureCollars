package org.example.lesson5task3;

public class Division implements MathematicalOperation {
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("nie można dzielić przez 0");
        } else
            return a / b;
    }
}
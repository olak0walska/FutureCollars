package org.example.lesson5task3;

public class Addition implements MathematicalOperation {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
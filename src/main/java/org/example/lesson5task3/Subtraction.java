package org.example.lesson5task3;

public class Subtraction implements MathematicalOperation {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }

    @Override
    public char getSign() {
        return '-';
    }
}
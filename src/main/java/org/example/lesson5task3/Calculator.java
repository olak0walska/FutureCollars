package org.example.lesson5task3;

public class Calculator {
    private MathematicalOperation mathematicalOperation;

    public Calculator(MathematicalOperation mathematicalOperation) {
        this.mathematicalOperation = mathematicalOperation;
    }

    public double calculate(double a, double b) {
        return mathematicalOperation.calculate(a, b);
    }
}

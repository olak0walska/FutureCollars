package org.example.lesson5task3;

public class Calculator {
    private MathematicalOperation[] mathematicalOperations;

    public Calculator(MathematicalOperation[] mathematicalOperations) {
        this.mathematicalOperations = mathematicalOperations;
    }

    public double calculate(double a, double b, char operationSign) {
        for (int i = 0; i < this.mathematicalOperations.length; i++) {
            if (this.mathematicalOperations[i].getSign() == operationSign) {
                return this.mathematicalOperations[i].calculate(a, b);
            }
        }
        throw new IllegalArgumentException("Nieznana operacja: " + operationSign);
    }
}

package org.example.lesson5task6;

public class BillCalculator {

    public static double calculate(double billValue, float serviceFee) {
        return billValue + serviceFee;
    }

    public static double calculate(double billValue, float serviceFee, double discount) {
        return (billValue - discount) + serviceFee;
    }

    public static double calculate(double billValue, float serviceFee, short takeawayPackage) {
        return billValue + serviceFee + takeawayPackage;
    }
}
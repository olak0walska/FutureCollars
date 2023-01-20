package org.example.lesson5task6;

public class BillCalculator {
    double billValue;
    private static final short TAKEAWAY_PACKAGE = 5;
    private static final double PERCENTAGE_OF_SERVICE_FEE = 0.15;
    private static final double PERCENTAGE_OF_DISCOUNT = 0.13;

    public static double calculate (double billValue, float serviceFee){
        serviceFee = (float) (billValue * PERCENTAGE_OF_SERVICE_FEE);
        return billValue + serviceFee;
    }

    public static double calculate (double billValue, float serviceFee, double discount){
        discount = PERCENTAGE_OF_DISCOUNT;
        return billValue - (billValue * discount) + serviceFee;
    }

    public static double calculate (double billValue, float serviceFee, double discount, short takeawayPackage){
        takeawayPackage = TAKEAWAY_PACKAGE;
        return billValue - (billValue * discount) + serviceFee + takeawayPackage;
    }
}
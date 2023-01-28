package org.example.lesson7task8;

public class SaturdayBonusCalculator {
    private final SaturdayBonusProvider saturdayBonusProvider;

    public SaturdayBonusCalculator(SaturdayBonusProvider saturdayBonusProvider) {
        this.saturdayBonusProvider = saturdayBonusProvider;
    }

    public double calculateSaturdayBonus(WorkingDay workingDay, double dailyRate) {
        double workingSaturdays = saturdayBonusProvider.getSaturdayBonus(workingDay);
        return workingSaturdays * dailyRate;
    }
}

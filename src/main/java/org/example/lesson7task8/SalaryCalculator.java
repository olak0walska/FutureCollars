package org.example.lesson7task8;

public class SalaryCalculator {
    private final BaseSalaryProvider baseSalaryProvider;

    public SalaryCalculator(BaseSalaryProvider baseSalaryProvider) {
        this.baseSalaryProvider = baseSalaryProvider;
    }

    public double calculateBaseSalary(WorkingDay workingDay, double dailyRate) {
        double workingDays = baseSalaryProvider.getBaseSalary(workingDay);
        return workingDays * dailyRate;
    }
}


package org.example.lesson3task3;

public class Manager extends BaseEmployee {
    private static final int BASE_SALARY = 5000;
    private static final int BONUS = 500;
    private int bonus;

    public Manager(String name, String surName, int employmentYears, int salary) {
        super(name, surName, employmentYears);
        this.bonus = BONUS;

    }

    public Manager(String name, String surName, int employmentYears) {
        super(name, surName, employmentYears);
        this.bonus = BONUS;
    }

    @Override
    public int calculateFullSalary() {
        return this.getSalary() + bonus;
    }

}

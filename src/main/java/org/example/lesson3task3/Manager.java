package org.example.lesson3task3;


public class Manager extends BaseEmployee {
    private static final int BASE_SALARY = 5000;
    private static final int BONUS = 500;
    private int bonus;

    public Manager(String name, String surname, int employmentYears, int salary) {
        super(name, surname, employmentYears);
        this.bonus = BONUS;
    }

    public Manager(String name, String surname, int employmentYears) {
        super(name, surname, employmentYears, BASE_SALARY);
        this.bonus = BONUS;
    }

    @Override
    public int calculateMonthlySalary() {
        return this.getSalary() + bonus;
    }
}



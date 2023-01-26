package org.example.lesson3task3;

public abstract class BaseEmployee {
    private final int BASE_SALARY = 3000;
    private final int salary;
    private final String name;
    private final String surname;
    private final int employmentYear;

    public BaseEmployee(String name, String surname, int employmentYear, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.employmentYear = employmentYear;
    }

    public BaseEmployee(String name, String surname, int employmentYear) {
        this.name = name;
        this.surname = surname;
        this.employmentYear = employmentYear;
        this.salary = BASE_SALARY;
    }

    public int getEmploymentYears() {
        return 2023 - employmentYear;
    }

    public int getSalary() {
        return this.salary;
    }

    public abstract int calculateMonthlySalary();

}


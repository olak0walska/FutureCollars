package org.example.lesson3task3;

public class TicketSeller extends BaseEmployee {
    public TicketSeller(String name, String surname, int employmentYear, int salary) {
        super(name, surname, employmentYear);
    }

    public TicketSeller(String name, String surname, int employmentYear) {
        super(name, surname, employmentYear);
    }

    @Override
    public int calculateMonthlySalary() {
        return getSalary();
    }
}
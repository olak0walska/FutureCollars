package org.example.lesson5task4;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;
    public static final String WHITE_SPACE = " ";

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        new Employee(name, surname);
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        new Employee(name, surname, age);
        this.baseSalary = baseSalary;
    }

    public Employee(String name, int age, BigDecimal baseSalary, BigDecimal bonus, String surname) {
        new Employee(name, surname, age, baseSalary);
        this.bonus = bonus;
    }

    public String getEmployee_Info() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
    }

    public BigDecimal getTotalSalary() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

}
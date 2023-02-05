package org.example.lesson4task8;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final int height;

    public Person(String name, String surname, int age, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                age == person.age &&
                height == person.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, height);
    }
}
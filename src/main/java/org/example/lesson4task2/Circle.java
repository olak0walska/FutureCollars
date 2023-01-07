package org.example.lesson4task2;

import static java.lang.Math.pow;

public class Circle extends Shape {
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        return Math.PI * pow(diameter, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * diameter;
    }
}
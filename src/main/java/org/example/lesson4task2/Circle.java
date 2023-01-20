package org.example.lesson4task2;

import static java.lang.Math.pow;

public class Circle extends Shape {
    private double radius;

    public Circle(double diameter) {
        this.radius = diameter;
    }

    @Override
    public double getArea() {
        return Math.PI * pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
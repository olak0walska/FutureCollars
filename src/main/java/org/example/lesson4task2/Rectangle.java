package org.example.lesson4task2;

public class Rectangle extends Shape {
    double lengthOfTheSideA;
    private double lengthOfTheSideB;

    public Rectangle(double lengthOfTheSideA, double lengthOfTheSideB) {
        this.lengthOfTheSideA = lengthOfTheSideA;
        this.lengthOfTheSideB = lengthOfTheSideB;
    }

    @Override
    public double getArea() {
        return lengthOfTheSideA * lengthOfTheSideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * lengthOfTheSideA + 2 * lengthOfTheSideB;
    }
}
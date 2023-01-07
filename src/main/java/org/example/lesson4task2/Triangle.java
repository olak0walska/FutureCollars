package org.example.lesson4task2;

public class Triangle extends Shape {
    private double lengthOfTheBase;
    private double height;
    private double lengthOfTheSidesB;
    private double lengthOfTheSidesC;

    public Triangle(double lengthOfTheBase, double height, double lengthOfTheSidesB, double lengthOfTheSidesC) {
        this.lengthOfTheBase = lengthOfTheBase;
        this.height = height;
        this.lengthOfTheSidesB = lengthOfTheSidesB;
        this.lengthOfTheSidesC = lengthOfTheSidesC;
    }

    @Override
    public double getArea() {
        return (lengthOfTheBase * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return lengthOfTheBase + lengthOfTheSidesB + lengthOfTheSidesC;
    }
}
package org.example.lesson4task2;

import static java.lang.Math.pow;

public class Square extends Rectangle {

    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    @Override
    public double getArea() {
        return pow(lengthOfTheSideA, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * lengthOfTheSideA;
    }
}


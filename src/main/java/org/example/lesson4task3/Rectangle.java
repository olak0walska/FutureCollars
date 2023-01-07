package org.example.lesson4task3;


public class Rectangle implements AreaAndPerimeter {
    private final int longerSide;
    private final int shorterSide;

    public Rectangle(int longerSide, int shorterSide) {
        this.longerSide = longerSide;
        this.shorterSide = shorterSide;
    }

    @Override
    public double getArea() {
        return longerSide * shorterSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * (longerSide + shorterSide);
    }
}
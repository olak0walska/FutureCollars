package org.example.lesson4task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCalculateTheAreaOfTheCircle() {
        Circle circle = new Circle(8);
        double getArea = circle.getArea();
        Assertions.assertEquals(201.06192982974676, getArea);
    }

    @Test
    void shouldCalculateThePerimeterOfTheCircle() {
        Circle circle = new Circle(8);
        double getPerimeter = circle.getPerimeter();
        Assertions.assertEquals(50.26548245743669, getPerimeter);
    }
}
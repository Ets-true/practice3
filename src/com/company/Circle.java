package com.company;

public class Circle {
    double radius = 0;

    public double getLength() {
        return Math.PI * radius * 2;
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
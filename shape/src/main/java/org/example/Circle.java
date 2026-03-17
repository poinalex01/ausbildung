package org.example;

public class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("rdius cant be les than 0!");

        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

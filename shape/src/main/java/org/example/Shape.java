package org.example;

import java.awt.*;

public abstract class Shape {
    private Color color;
    private boolean isFilled;

    public abstract double getArea();

    public abstract double getPerimeter();
}

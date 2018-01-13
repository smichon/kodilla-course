package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double radius;
    private String figureName;

    public Circle(String figureName, double radius) {
        this.radius = radius;
        this.figureName = figureName;
    }

    public String getFigureName() {
        return figureName;
    }

    public String getShapeName() {
        return figureName;
    }
    public double getField() {
        double field = Math.PI * radius * radius;
        return field;
    }
}

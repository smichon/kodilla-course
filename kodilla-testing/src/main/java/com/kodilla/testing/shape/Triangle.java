package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double triBase;
    private double triHeight;
    private String figureName;

    public Triangle(String figureName, double triBase, double triHeight) {
        this.figureName = figureName;
        this.triBase = triBase;
        this.triHeight = triHeight;
    }

    public String getShapeName() {
        return figureName;
    }
    public double getField() {
        double field = (triBase * triHeight) / 2;
        return field;
    }
}

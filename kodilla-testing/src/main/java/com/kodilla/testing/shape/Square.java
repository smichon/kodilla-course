package com.kodilla.testing.shape;

public class Square implements Shape {
    private double side;
    private String figureName;

    public Square(String figureName, double side) {
        this.side = side;
        this.figureName = figureName;
    }

    public String getShapeName() {
        return figureName;
    }
    public double getField() {
        return side * side;
    }
}

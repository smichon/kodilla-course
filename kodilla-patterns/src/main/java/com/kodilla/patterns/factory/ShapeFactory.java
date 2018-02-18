package com.kodilla.patterns.factory;

public final class ShapeFactory {
    public final static String CIRCLE = "CIRCLE";
    public final static String SQUARE = "SQUARE";
    public final static String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(final String shapeClass) {
        switch (shapeClass) {
            case CIRCLE:
                return new Circle("The rounded circle", 4.5);
            case SQUARE:
                return new Square("The angular square", 7.0);
            case RECTANGLE:
                return new Rectangle("The long rectangle", 15.0, 2.5);
            default:
                return null;
        }
    }
}

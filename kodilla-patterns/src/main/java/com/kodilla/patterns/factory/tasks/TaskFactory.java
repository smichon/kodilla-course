package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public final static String SHOPPING = "SHOPPING";
    public final static String PAINTING = "PAINTING";
    public final static String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Bread", 2.0);
            case PAINTING:
                return new PaintingTask("Painting", "orange", "bedroom");
            case DRIVING:
                return new DrivingTask("Driving", "to airport", "taxi");
            default:
                return null;
        }
    }
}

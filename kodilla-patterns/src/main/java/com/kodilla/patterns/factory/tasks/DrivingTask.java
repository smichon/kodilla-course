package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskExecuted = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Starting journey");
        taskExecuted = true;
        return taskExecuted;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (taskExecuted) {
            return true;
        }
        return false;
    }
}

package com.kodilla.spring.portfolio;

public final class Board {
     private final TaskList toDoList;
     private final TaskList inProgressList;
     private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList addTaskToDoList(String task) {
        toDoList.getTasks().add(task);
        return toDoList;
    }

    public TaskList addTaskToInProgressList(String task) {
        inProgressList.getTasks().add(task);
        return inProgressList;
    }

    public TaskList addTaskToDoneList(String task) {
        doneList.getTasks().add(task);
        return inProgressList;
    }

    @Override
    public String toString() {
        return "Board:\n{" +
                "toDoList=" + getToDoList() +
                ",\n inProgressList=" + getInProgressList() +
                ",\n doneList=" + getDoneList() +
                '}';
    }
}

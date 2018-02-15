package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class Board {
    @Autowired
    @Qualifier("toDoList")
     private final TaskList toDoList;
    @Autowired
    @Qualifier("inProgressList")
     private final TaskList inProgressList;
    @Autowired
    @Qualifier("doneList")
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

    @Override
    public String toString() {
        return "Board:\n{" +
                "toDoList=" + getToDoList() +
                ",\n inProgressList=" + getInProgressList() +
                ",\n doneList=" + getDoneList() + "}";
    }
}

package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {


    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        TaskList toDoList = new TaskList();
        toDoList.getTasks().add("Learn Git");
        toDoList.getTasks().add("Write RPS game");
        toDoList.getTasks().add("Read more about Spring");
        return toDoList;
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        TaskList inProgressList = new TaskList();
        inProgressList.getTasks().add("Learning Spring");
        inProgressList.getTasks().add("Design pattern learning");
        inProgressList.getTasks().add("TaskBoard code refactor");
        return inProgressList;
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        TaskList doneList = new TaskList();
        doneList.getTasks().add("Exam written");
        doneList.getTasks().add("Collections repeated");
        doneList.getTasks().add("task 10.4 finished");
        return doneList;
    }
}

package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String lastname;
    private final String firstname;
    private int tasksCount;

    public Mentor(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }
    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(firstname + " " + lastname + ": New tasks to review in " + taskQueue.getName() + "\n"
            + "( total: " + taskQueue.getTasks().size() + " tasks to review");
        tasksCount++;
    }
    public String getLastname() {
        return lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public int getTasksCount() {
        return tasksCount;
    }
}

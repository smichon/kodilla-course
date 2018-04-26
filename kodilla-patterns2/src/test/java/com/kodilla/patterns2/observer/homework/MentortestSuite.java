package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentortestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue rickZaweckTasks = new RickZaweckTasksQueue();
        TaskQueue johnSmithTasks = new JohnSmithTasksQueue();
        TaskQueue michelleLonghornTasks = new MichelleLonghornTaskQueue();
        Mentor johnatanConnelly = new Mentor("Connely", "Johnatan");
        Mentor williamCassidy = new Mentor("Cassidy", "William");
        rickZaweckTasks.assignObserver(johnatanConnelly);
        johnSmithTasks.assignObserver(williamCassidy);
        michelleLonghornTasks.assignObserver(williamCassidy);
        //When
        rickZaweckTasks.addTask("mod 18 Spring WEB, not everything works..");
        rickZaweckTasks.addTask("mod 19, everything should be ok");
        johnSmithTasks.addTask("mod. 10, can't go any further..");
        michelleLonghornTasks.addTask("mod 20 - patterns, without last exercise");
        michelleLonghornTasks.addTask("second additional task is finished");
        michelleLonghornTasks.addTask("last mod, no idea why throws this exception");
        //Then
        assertEquals(2, johnatanConnelly.getTasksCount());
        assertEquals(4, williamCassidy.getTasksCount());
    }
}

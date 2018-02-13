package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testBoardCreation() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        boolean exist1 = context.containsBean("toDoList");
        boolean exist2 = context.containsBean("inProgressList");
        boolean exist3 = context.containsBean("doneList");
        //Then
        System.out.println("TaskList: 'toDoList' found in container: " + exist1);
        System.out.println("TaskList: 'inProgressList' found in container: " + exist2);
        System.out.println("TaskList: 'doneList' found in container: " + exist3);
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addTaskToDoList("TaskToDo");
        board.addTaskToInProgressList("TaskInProgress");
        board.addTaskToDoneList("TaskDone");
        boolean expected1 = board.getToDoList().getTasks().contains("TaskToDo");
        boolean expected2 = board.getInProgressList().getTasks().contains("TaskInProgress");
        boolean expected3 = board.getDoneList().getTasks().contains("TaskDone");
        //Then
        System.out.println(board.toString());
        Assert.assertEquals(expected1, true);
        Assert.assertEquals(expected2, true);
        Assert.assertEquals(expected3, true);
    }
}

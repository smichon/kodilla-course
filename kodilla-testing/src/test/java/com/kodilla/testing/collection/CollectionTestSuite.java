package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyArray = new ArrayList<>();

        OddNumbersExterminator emptyList = new OddNumbersExterminator(emptyArray);
        //When
        System.out.println("Testing empty List");
        List<Integer> result = emptyList.exterminate();
        //Then
        Assert.assertEquals(emptyArray, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator normalList = new OddNumbersExterminator(new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6)));
        //When
        List<Integer> result = normalList.exterminate();
        List<Integer> expected = new ArrayList<>(Arrays.asList(0,2,4,6));
        System.out.println("Testing normal List");
        //Then
        Assert.assertEquals(expected, result);
    }
}

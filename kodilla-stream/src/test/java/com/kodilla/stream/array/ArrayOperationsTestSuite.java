package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {4, 6, 2, 8, 6, 4, 8, 2};
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(5.0, average, 0);
    }
}

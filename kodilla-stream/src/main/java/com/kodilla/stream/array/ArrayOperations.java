package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int [] numbers) {
        System.out.println("Array 'numbers' has " + numbers.length + " elements");
        IntStream.range(0, numbers.length).map(n-> numbers[n]).forEach(System.out::println);
        double average = IntStream.range(0, numbers.length).map(n-> numbers[n]).average().getAsDouble();
        System.out.println("Average value is: " + average);
        return average;
    }
}

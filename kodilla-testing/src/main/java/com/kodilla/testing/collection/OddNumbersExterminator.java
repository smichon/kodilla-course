package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    private List<Integer> numbers;
    private List<Integer> evenNumbers = new ArrayList<>();

    public OddNumbersExterminator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> exterminate() {
        if (numbers.isEmpty()) {
            System.out.println("Array 'numbers' is empty");
        } else {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                }
            }
        }
        return evenNumbers;
    }
}

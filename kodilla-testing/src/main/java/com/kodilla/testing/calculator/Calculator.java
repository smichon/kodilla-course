package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;
    private int sum;
    private int diff;

    public int getSum() {
        return sum;
    }

    public int getDiff() {
        return diff;
    }

    public int add(int a, int b) {
        sum = a + b;
        return sum;
    }

    public int subtract(int a, int b) {
        diff = a - b;
        return diff;
    }
}

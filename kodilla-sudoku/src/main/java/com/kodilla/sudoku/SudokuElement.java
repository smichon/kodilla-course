package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuElement {
    public final static int EMPTY = -1;
    private int value = EMPTY;
    private ArrayList<Integer> possibleValues = new ArrayList<>(9);

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ArrayList<Integer> getPossibleValues() {
        for (int i=1; i<=9; i++) {
            possibleValues.add(i);
        }
        return possibleValues;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

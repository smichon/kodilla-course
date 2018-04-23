package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private List<SudokuElement> row = new ArrayList<>(9);

    public List<SudokuElement> getRow() {
        return row;
    }


}

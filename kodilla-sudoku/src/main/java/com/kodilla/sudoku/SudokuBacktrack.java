package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.SudokuBoard.BOARD_SIZE;

public class SudokuBacktrack {
    private SudokuBoard board;
    private int x;
    private int y;
    private int guessedValue;
    private SudokuBacktrack lastBackup;
    private List<SudokuBacktrack> backupList = new ArrayList<>();

    public SudokuBacktrack(SudokuBoard board, int x, int y, int guessedValue) {
        this.board = board;
        this.x = x;
        this.y = y;
        this.guessedValue = guessedValue;
    }

    public int guessValueOfElement() throws CloneNotSupportedException {
        for (int n = 0; n < BOARD_SIZE; n++) {
            for (int k = 0; k < BOARD_SIZE; k++) {
                List<Integer> listOfValuesToSet = board.getElement(n, k).getPossibleValues();
                guessedValue = listOfValuesToSet.get(listOfValuesToSet.size()-1);
                if (board.getElement(n, k).getValue() == SudokuElement.EMPTY) {
                    backupList.add(new SudokuBacktrack(board.deepCopy(), n ,k, guessedValue));
                }
            }
        }
        return guessedValue;
    }

    public SudokuBoard wrongGuessHandler() {
        if (!backupList.isEmpty()) {
            for (int n = 0; n < BOARD_SIZE; n++) {
                for (int k = 0; k < BOARD_SIZE; k++) {
                    List<Integer> listOfValuesToSet = board.getElement(n, k).getPossibleValues();
                    if (board.getElement(n, k).getValue() == SudokuElement.EMPTY) {
                        lastBackup = backupList.get(backupList.size() - 1);
                        listOfValuesToSet.remove(lastBackup.guessedValue);
                    }
                }
            }
            return lastBackup.board;
        } else {
            System.out.println("Values keyed in the Sudoku are incorrect.");
        }
        return null;
    }
}

package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SudokuBoard extends Prototype {
    private List<SudokuRow> board = new ArrayList<>(9);
    private SudokuElement element;
    private SudokuRow row;
    private SudokuGame game;
    public final static int BOARD_SIZE = 9;

    public SudokuElement getElement(int ri, int ci) {
        return getRow(ri).getRow().get(ci);
    }

    public SudokuRow getRow(int ri) {
        return board.get(ri);
    }

    public List<Integer> getListOfRowValues(int ri) {
        return getRow(ri).getRow().stream().map(element -> element.getValue())
                .collect(Collectors.toList());
    }

    public List<SudokuElement> getColumn(int ci) {
        List<SudokuElement> column = new ArrayList<>();
        for (int i =0; i < BOARD_SIZE; i++) {
            column.add(getElement(i, ci));
        }
        return column;
    }

    public List<Integer> getListOfColumnValues(int ri) {
        return getColumn(ri).stream().map(element -> element.getValue())
                .collect(Collectors.toList());
    }

    public List<SudokuElement> getSquer(int r, int c) {
        List<SudokuElement> squer = new ArrayList<>();
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (getRow(i).getRow().indexOf(getElement(i, j/3)) == r && getColumn(j).indexOf(getColumn(j).get(i / 3)) == c) {
                    squer.add(getElement(i, j));
                }
            }
        }
        return squer;
    }

    public List<Integer> getListOfSquerValues(int r, int c) {
        return getSquer(r,c).stream().map(element -> element.getValue())
                .collect(Collectors.toList());
    }

    public void setElement(int ri, int ci, int value) {
         getElement(ri, ci).setValue(value);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n < BOARD_SIZE; n++) {
            sb.append("|");
            for (int k = 0; k < BOARD_SIZE; k++) {
                if (getElement(n, k) == null) {
                    sb.append(" ");
                } else {
                    sb.append(getElement(n,k).getValue());
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = (SudokuBoard)super.clone();
        clonedBoard.board = new ArrayList<>();
        for (SudokuRow theRow: board) {
            SudokuRow clonedRow = new SudokuRow();
            for (SudokuElement theElement : theRow.getRow()) {
                clonedRow.getRow().add(theElement);
            }
            clonedBoard.board.add(clonedRow);
        }
        return clonedBoard;
    }
}

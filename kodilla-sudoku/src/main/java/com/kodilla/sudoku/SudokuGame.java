package com.kodilla.sudoku;

import java.util.List;
import java.util.Scanner;

import static com.kodilla.sudoku.SudokuBoard.BOARD_SIZE;

public class SudokuGame {
    private Scanner scanner = new Scanner(System.in);
    private SudokuBoard board = new SudokuBoard();
    private SudokuRow row = new SudokuRow();
    private SudokuElement element = new SudokuElement(SudokuElement.EMPTY);
    private SudokuBacktrack backtrack;
    private boolean gameFinished = false;


    public void intro() {

        System.out.print("\nWelcome to SUDOKU\nPlease enter your name:");

        System.out.print("Fill board by entering 3 numbers: 1-row number, 2-column number," +
                " 3-value to put into board.\nNumbers from 1 to 9, no space or other separator! ie: 111" +
                "\nTo solve actual board type 'SUDOKU' and press 'Enter'");
    }

    public void fillBoardByPlayer() throws CloneNotSupportedException {
        System.out.print("Enter numbers to fill the board:");
        String s = scanner.next();
        if (s == "SUDOKU") {
            resolveSudoku();
        }
        board.setElement(Integer.parseInt("" +s.charAt(0))-1, Integer.parseInt(""+s.charAt(1))-1,
                Integer.parseInt(""+s.charAt(2))+0);
        board.toString();
    }

    public void resolveSudoku() throws CloneNotSupportedException {

        for (int n = 0; n < BOARD_SIZE; n++) {
            for (int k = 0; k < BOARD_SIZE; k++) {
                List<Integer> listOfValuesToSet = board.getElement(n,k).getPossibleValues();
                if (board.getElement(n, k).getValue() == SudokuElement.EMPTY) {

                    listOfValuesToSet.removeAll(board.getListOfRowValues(n));
                    listOfValuesToSet.removeAll(board.getListOfColumnValues(k));
                    listOfValuesToSet.removeAll(board.getListOfSquerValues(n / 3, k / 3));

                    for (int i = 0; i < BOARD_SIZE; i++) {
                        listOfValuesToSet.removeAll(board.getRow(n).getRow().get(i).getPossibleValues());
                        listOfValuesToSet.removeAll(board.getColumn(k).get(i).getPossibleValues());
                        listOfValuesToSet.removeAll(board.getSquer(n / 3, k / 3).get(i).getPossibleValues());
                    }

                    if (listOfValuesToSet.size() == 1) {
                        board.setElement(n, k, listOfValuesToSet.get(0));
                    } else if (listOfValuesToSet.size() > 1){
                        board.setElement(n, k, backtrack.guessValueOfElement());
                    } else {
                        board = backtrack.wrongGuessHandler();
                    }
                }
            }
        }
        board.toString();
        System.out.println("Thank You for the game.\n" +
                "If You want to end game - press key 'x' otherwise press 'n' for a new game");
        char decision = scanner.next().charAt(0);
        if (decision == 'x') {
            endGame();
        } else if (decision == 'n') {
            newGame();
        } else {
            System.out.println("Wrong key entered");
        }
    }

    public void endGame() {
        System.out.println("Are You sure to end the game? y - yes, n - no");
        char endGame = scanner.next().charAt(0);
        switch (endGame) {
            case 'y': {
                System.out.println("Closing Sudoku...");
                gameFinished = true;
                System.exit(1);
                break;
            }
            case 'n': {
                newGame();
                break;
            }
            default:
                break;
        }
    }

    public void newGame() {
        System.out.println("Are You sure You want to start new game? y - yes, n - no");
        char newGame = scanner.next().charAt(0);
        switch (newGame) {
            case 'y': {
                intro();
                try {
                    fillBoardByPlayer();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 'n':
                gameFinished = true;
                endGame();
                break;
            default:
                break;
        }
    }
}

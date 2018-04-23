package com.kodilla.sudoku;


public class SudokuRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            theGame.intro();
            theGame.fillBoardByPlayer();
        }
        /*String pipe = " | ";
        String dash = " +--------------------------+";
        for (int n = 0; n < 9; n++) {
            System.out.println(dash);
            System.out.print(pipe);
            for (int k = 0; k < 9; k++) {
                System.out.print(pipe);

                }
            System.out.print("\n");
        }
        System.out.println(dash);*/
    }

}

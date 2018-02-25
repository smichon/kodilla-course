package com.kodilla.rpsV2;

import java.util.Random;
import java.util.Scanner;

public final class Game2 {
    private static Game2 game2Instance = null;

    private  Scanner scanner = new Scanner(System.in);
    private  String username;
    private  int roundsNumber;
    private  char userNumber;
    private  char compNumber;
    private  int userScore = 0;
    private  int compScore = 0;
    private  boolean end = false;

    private Game2() {
    }

    public static Game2 getInstance() {
        if (game2Instance == null) {
            game2Instance = new Game2();
        }
        return game2Instance;
    }

    public String getFileName() {
        String fileName = "";
        return fileName;
    }

    public char getUserNumber() {
        return userNumber;
    }

    public char getCompNumber() {
        return compNumber;
    }

    public String getUsername() {
        return username;
    }

    public boolean isEnd() {
        return end;
    }

    public void intro() {
        userScore = 0;
        compScore = 0;
        System.out.print("\nThis is a game called Rock - Paper - Scissors\nPlease enter your name:");
        username = scanner.next();

        System.out.print(username + ", how many rounds would You like to play? (max 15): ");
        roundsNumber = scanner.nextInt();

        System.out.println("Game controls: Key 1 - 'ROCK', Key 2 - 'PAPER', Key 3 - 'SCISSORS', " +
                "Key x - end game, Key n - new game");
    }

    public void chooseNumbers() {
        System.out.print(username + ", Your move:");
        userNumber = scanner.next().charAt(0);
        int random = new Random().nextInt(3) + 1;
        compNumber = (char) (random + '0');
        if (userNumber == 'x' ) {
            endGame();
        } else if (userNumber == 'n') {
            newGame();
        }
    }

    public void singleRoundScore() throws NullPointerException {

        Figure2 userFigure = new FigureFactory().figureFactory(userNumber);
        Figure2 compFigure = new FigureFactory().figureFactory(compNumber);
        System.out.println(username + " chose " + userFigure.getFigureName() +
                " and Computer chose " + compFigure.getFigureName());

        if (userNumber == compNumber) {
            System.out.println("It's a draw");
        } else if (userNumber == '1') {
            if (compNumber == '2') {
                System.out.println("Computer wins this round");
                compScore++;
            } else if (compNumber == '3') {
                System.out.println(username + " wins this round");
                userScore++;
            }
        }
        else if (userNumber == '2') {
            if (compNumber == '3') {
                System.out.println("Computer wins this round");
                compScore++;
            } else if (compNumber == '1') {
                System.out.println(username + " wins this round");
                userScore++;
            }
        }
        else if (userNumber == '3') {
            if (compNumber == '1') {
                System.out.println("Computer wins this round");
                compScore++;
            } else if (compNumber == '2') {
                System.out.println(username + " wins this round");
                userScore++;
            }
        }
    }

    public void allRoundsScore() throws NullPointerException {
        for (int i=1; i <= roundsNumber && i < 16; i++) {
            System.out.println("\nRound No. " + i);
            chooseNumbers();
            singleRoundScore();
            System.out.println("Score after " + i + " rounds: " + username + " - " +
                    userScore + ", Computer - " + compScore);
        }

        System.out.println("\nFinal results after " + roundsNumber + " rounds:\n" +
                username + " - " + userScore + ", Computer - " + compScore);
        if (userScore > compScore) {
            System.out.println(username + ", You won! Congratulations!");
        } else if (userScore < compScore) {
            System.out.println("Sorry " + username + ", Computer won this game. Try again...");
        } else {
            System.out.println("Game finished with a draw");
        }

        System.out.println("Thank You for the game.\n" +
                "If You want to end game - press key 'x' otherwise press 'n' for a new game");
        char decision = scanner.next().charAt(0);
        if (decision == 'x') {
            endGame();
        } else if (decision == 'n') {
            newGame();
        } else {
            System.out.println("Wrong key");
        }
    }

    public void endGame() {

        System.out.println("Are You sure to end the game? y - yes, n - no");
        char endGame = scanner.next().charAt(0);
        switch (endGame) {
            case 'y': {
                System.out.println("Closing the game...");
                end = true;
                break;
            }
            case 'n': {
                intro();
                allRoundsScore();
                break;
            }
            default:
                break;
        }
    }

    public void newGame() {
        System.out.println("Are You sure You want to start new one? y - yes, n - no");
        char newGame = scanner.next().charAt(0);
        switch (newGame) {
            case 'y': {
                intro();
                allRoundsScore();
                break;
            }
            case 'n':
                end = true;
                break;
            default:
                break;
        }
    }
}

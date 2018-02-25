package com.kodilla.rpsV2;

public class FigureFactory {
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public final Figure2 figureFactory(char figureNumber) {
        switch (figureNumber) {
            case '1':
                return new Rock2(ROCK);
            case '2':
                return new Paper2(PAPER);
            case '3':
                return new Scissors2(SCISSORS);
            default:
                return null;
        }
    }
}

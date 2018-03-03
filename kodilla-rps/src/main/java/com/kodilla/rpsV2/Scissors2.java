package com.kodilla.rpsV2;

import java.util.ArrayList;
import java.util.List;

public final class Scissors2 implements Figure2 {
    private final String figureName;
    private List<String> winsWith = new ArrayList<>();


    public Scissors2(String figureName) {
        this.figureName = figureName;
    }

    @Override
    public String getFigureName() {
        return figureName;
    }

    @Override
    public List<String> winsWith() {
        winsWith.add(FigureFactory.PAPER);
        winsWith.add(FigureFactory.LIZARD);
        return winsWith;
    }
}

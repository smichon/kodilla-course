package com.kodilla.rpsV2;

import org.junit.Assert;
import org.junit.Test;

public class RpsV2TestSuite {
    @Test
    public void testCreateFigures() {
        Figure2 userFigure;
        Figure2 compFigure;
        //Given
        Game2.getInstance();

        //When
        userFigure = new FigureFactory().figureFactory('1');
        compFigure = new FigureFactory().figureFactory('4');

        //Then
        Assert.assertEquals(FigureFactory.ROCK, userFigure.getFigureName());
        Assert.assertEquals(FigureFactory.SPOCK, compFigure.getFigureName());
    }

    @Test
    public void testSingleRoundScore() {
        Figure2 userFigure;
        Figure2 compFigure;

        //Given
        Game2.getInstance();
        userFigure = new FigureFactory().figureFactory('1');
        compFigure = new FigureFactory().figureFactory('4');
        //When
        String result = Game2.getInstance().singleRoundScore(userFigure, compFigure);

        //Then
        Assert.assertEquals("Computer wins this round!", result);
    }
}

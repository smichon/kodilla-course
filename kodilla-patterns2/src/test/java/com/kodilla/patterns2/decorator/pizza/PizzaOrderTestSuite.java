package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a pizza", theOrder.getDescription());
    }
    @Test
    public void testThinDoughOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThinDoughOrderDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testThinDoughOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThinDoughOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a pizza on thin dough", theOrder.getDescription());
    }
    @Test
    public void testLargeThinPieWithBaconOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new LargePieOrderDecorator(theOrder);
        theOrder = new ThinDoughOrderDecorator(theOrder);
        theOrder = new WithBaconOrderDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }
    @Test
    public void testLargeThinPieWithBaconOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new LargePieOrderDecorator(theOrder);
        theOrder = new ThinDoughOrderDecorator(theOrder);
        theOrder = new WithBaconOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a pizza on large pie on thin dough with bacon", theOrder.getDescription());
    }
    @Test
    public void testLargePieWithMushroomsHamBaconExtraCheeseOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new LargePieOrderDecorator(theOrder);
        theOrder = new WithMushroomsOrderDecorator(theOrder);
        theOrder = new WithHamOrderDecorator(theOrder);
        theOrder = new WithBaconOrderDecorator(theOrder);
        theOrder = new XtraCheeseOrderDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), calculatedCost);
    }
    @Test
    public void testLargePieWithMushroomsHamBaconExtraCheeseOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new LargePieOrderDecorator(theOrder);
        theOrder = new WithMushroomsOrderDecorator(theOrder);
        theOrder = new WithHamOrderDecorator(theOrder);
        theOrder = new WithBaconOrderDecorator(theOrder);
        theOrder = new XtraCheeseOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Order a pizza on large pie with mushrooms with ham with bacon with extra cheese", theOrder.getDescription());
    }
}

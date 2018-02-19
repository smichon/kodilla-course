package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testNewBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll(BigMac.Roll.SESAME)
                .burgers(2)
                .sauce(BigMac.Sauce.BARBECUE)
                .ingredient(BigMac.Ingredients.CHEESE)
                .ingredient(BigMac.Ingredients.LETTUCE)
                .ingredient(BigMac.Ingredients.ONION)
                .ingredient(BigMac.Ingredients.PICKLE)
                .ingredient(BigMac.Ingredients.BACON)
                .build();
        System.out.println(bigMac);
        //When
        int numberOfIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(5, numberOfIngredients);
        Assert.assertEquals("SESAME", bigMac.getRoll().toString());
        Assert.assertEquals(2,bigMac.getBurgers());
        Assert.assertEquals("BARBECUE", bigMac.getSauce().toString());
        Assert.assertTrue(bigMac.getIngredients().contains(BigMac.Ingredients.ONION));
    }
}

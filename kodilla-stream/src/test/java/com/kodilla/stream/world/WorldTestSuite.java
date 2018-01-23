package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("Europe", Arrays.asList(new Country("Poland",
                new BigDecimal("38422346")),
        new Country("Germany", new BigDecimal("82349400")),
        new Country("Switzerland", new BigDecimal("8279700")),
        new Country("Ireland", new BigDecimal("4761865"))));
        Continent northAmerica = new Continent("North America", Arrays.asList(new Country("USA",
                new BigDecimal("326079000")),
        new Country("Canada", new BigDecimal("36708083"))));
        Continent africa = new Continent("Africa", Arrays.asList(new Country("Senegal",
                 new BigDecimal("14668522")),
        new Country("Mozambique", new BigDecimal("26573706")),
        new Country("Kenya", new BigDecimal("47615739"))));

        World countries = new World(Arrays.asList(europe, northAmerica, africa));

        //When
        BigDecimal worldPopulation = countries.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("585458361");

        //Then
        Assert.assertEquals(expectedPopulation, worldPopulation);
    }

}

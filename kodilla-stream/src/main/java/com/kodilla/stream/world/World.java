package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    private final List<Continent> continent;

    public World(final List<Continent> continent) {
        this.continent = continent;
    }

    public BigDecimal getPeopleQuantity(){
        return continent.stream()
                .flatMap(c -> c.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}

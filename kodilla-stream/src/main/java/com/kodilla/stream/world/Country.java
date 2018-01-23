package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String country;
    private final BigDecimal peopleQuantity;

    public Country(final String country,final BigDecimal peopleQuantity) {
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country1 = (Country) o;

        return country.equals(country1.country);
    }

    @Override
    public int hashCode() {
        return country.hashCode();
    }
}

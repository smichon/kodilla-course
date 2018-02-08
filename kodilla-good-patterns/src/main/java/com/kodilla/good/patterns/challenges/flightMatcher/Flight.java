package com.kodilla.good.patterns.challenges.flightMatcher;

public final class Flight {
    private final String from;
    private final String to;

    public Flight(final String from, final String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}

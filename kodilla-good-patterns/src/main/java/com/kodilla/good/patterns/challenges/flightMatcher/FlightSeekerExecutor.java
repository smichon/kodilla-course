package com.kodilla.good.patterns.challenges.flightMatcher;

public class FlightSeekerExecutor {
    public static void main(String[] args) {
        Flight flight = new Flight("KA", "WA");
        FlightSeeker flightSeeker = new FlightSeeker();
        flightSeeker.flightFromCity(flight);
        flightSeeker.flightToCity(flight);
        flightSeeker.flightWithStopover(flight);
    }
}

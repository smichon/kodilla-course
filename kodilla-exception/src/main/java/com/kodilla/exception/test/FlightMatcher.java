package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightMatcher {

    private static Map<String, Boolean> airport = new HashMap<>();


    public void findFlight(Flight flight) throws RouteNotFoundException{
        for (Map.Entry<String,Boolean> entry : airport.entrySet()) {
            if (flight.getDepartureAirport() != null
                    && flight.getArrivalAirport() == entry.getKey() && entry.getValue() == true) {
                System.out.println("Your flight from '" + flight.getDepartureAirport() + "' to '"
                        + flight.getArrivalAirport() + "' has been matched");
            } else {
                throw new RouteNotFoundException();
            }
        }
    }

    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Katowice");
        FlightMatcher flightMatcher = new FlightMatcher();
        airport.put("Katowice", false);

        try {
            flightMatcher.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("Flight from '" + flight.getDepartureAirport() + "' to '" +
                    flight.getArrivalAirport() + "' cannot be matched, because\n" + e.ExceptionDescription());
        } finally {
            System.out.println("Thank You for choosing our lines!");
        }
    }
}

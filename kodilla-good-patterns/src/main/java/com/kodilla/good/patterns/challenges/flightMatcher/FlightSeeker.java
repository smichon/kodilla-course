package com.kodilla.good.patterns.challenges.flightMatcher;

import java.util.List;
import java.util.stream.Collectors;

public final class FlightSeeker {

    private final FlightMap flightMap = new FlightMap();
    private List<String> flightFrom;
    private List<String> flightTo;
    private List<String> stopover;

    public void flightFromCity(Flight flight) {
        System.out.println("Flights from "+ flight.getFrom() + " can be realized to:");
        flightFrom = flightMap.getConnectionsMap().entrySet().stream()
                .filter(m -> m.getKey().equals(flight.getFrom()))
                .flatMap(m->m.getValue().stream())
                .collect(Collectors.toList());
        System.out.println(flightFrom);

    }
    public void flightToCity(Flight flight) {
        System.out.println("\nFlights to " + flight.getTo() + " can be realized from:");
        flightTo = flightMap.getConnectionsMap().entrySet().stream()
                .filter(m -> m.getKey().equals(flight.getTo()))
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.toList());
        System.out.println(flightTo);
    }

    public void flightWithStopover(Flight flight) {
        flightToCity(flight);
        flightFromCity(flight);
        stopover = flightFrom.stream()
                .filter(s->flightTo.contains(s))
                .collect(Collectors.toList());

        if (flightFrom.contains(flight.getTo()) || flightTo.contains(flight.getFrom())) {
            System.out.println("\nFlights from " + flight.getFrom() + " to " + flight.getTo() +
                    " can be realized with no stopover");
        } else if (stopover != null) {
            System.out.println("\nFlights from " + flight.getFrom() + " to " + flight.getTo()
                    + " can be realized with stopover in :\n" + stopover);
        } else {
            System.out.println("\nSorry, we couldn't find any stopover for flight from " + flight.getFrom()
                    + " to " + flight.getTo());
        }
    }
}

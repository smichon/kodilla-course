package com.kodilla.good.patterns.challenges.flightMatcher;

import java.util.List;
import java.util.stream.Collectors;

public final class FlightSeeker {

    private final FlightMap flightMap = new FlightMap();

    public List<String> flightFromCity(Flight flight) {
        List flightFrom = flightMap.getConnectionsMap().entrySet().stream()
                .filter(m -> m.getKey().equals(flight.getFrom()))
                .flatMap(m->m.getValue().stream())
                .collect(Collectors.toList());
        return flightFrom;

    }
    public List<String> flightToCity(Flight flight) {
        List flightTo = flightMap.getConnectionsMap().entrySet().stream()
                .filter(m -> m.getKey().equals(flight.getTo()))
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.toList());
        return flightTo;
    }

    public List<String> flightWithStopover(Flight flight) {
        List stopover = flightFromCity(flight).stream()
                .filter(s->flightToCity(flight).contains(s))
                .collect(Collectors.toList());

        System.out.println("Flights from "+ flight.getFrom() + " can be realized to:");
        System.out.println(flightFromCity(flight));
        System.out.println("\nFlights to " + flight.getTo() + " can be realized from:");
        System.out.println(flightToCity(flight));

        if (flightFromCity(flight).contains(flight.getTo()) || flightToCity(flight).contains(flight.getFrom())) {
            System.out.println("\nFlights from " + flight.getFrom() + " to " + flight.getTo() +
                    " can be realized with no stopover");
        } else if (stopover != null) {
            System.out.println("\nFlights from " + flight.getFrom() + " to " + flight.getTo()
                    + " can be realized with stopover in :\n" + stopover);
        } else {
            System.out.println("\nSorry, we couldn't find any stopover for flight from " + flight.getFrom()
                    + " to " + flight.getTo());
        }
        return stopover;
    }
}

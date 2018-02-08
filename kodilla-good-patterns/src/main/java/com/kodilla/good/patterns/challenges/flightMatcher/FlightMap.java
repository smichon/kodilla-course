package com.kodilla.good.patterns.challenges.flightMatcher;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class FlightMap {
    private final Map<String, List<String>> connectionsMap = new HashMap<>();

    public FlightMap() {
        connectionsMap.put("WA", Arrays.asList("GD", "PO", "KR"));
        connectionsMap.put("GD", Arrays.asList("WA", "PO", "KA"));
        connectionsMap.put("KR", Arrays.asList("WA", "WR"));
        connectionsMap.put("PO", Arrays.asList("GD", "WA", "LO"));
        connectionsMap.put("LO", Arrays.asList("PO", "KA", "WR"));
        connectionsMap.put("WR", Arrays.asList("KR", "LO", "KA"));
        connectionsMap.put("KA", Arrays.asList("GD", "LO", "WR"));
    }

    public final Map<String, List<String>> getConnectionsMap() {
        return new HashMap<>(connectionsMap);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightMap)) return false;

        FlightMap flightMap = (FlightMap) o;

        return connectionsMap.entrySet().equals(flightMap.connectionsMap.entrySet());
    }

    @Override
    public int hashCode() {
        return connectionsMap.entrySet().hashCode();
    }
}

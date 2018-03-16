package com.kodilla.good.patterns.airport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Airport {
    private String name;
    private static Map<Airport, List<String>> flights = new HashMap<>();

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Airport, List<String>> getFlights() {
        return flights;
    }

    public List<String> getListOfDestinations() {
        return flights.get(getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}

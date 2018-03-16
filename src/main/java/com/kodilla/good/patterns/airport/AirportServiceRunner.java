package com.kodilla.good.patterns.airport;

import java.util.Arrays;

public class AirportServiceRunner {
    public static void main(String[] args) {
        Airport warsaw = new Airport("Warszawa");
        warsaw.getFlights().put(warsaw, Arrays.asList("Berlin", "Paryż", "Madryd", "Oslo"));
        Airport oslo = new Airport("Oslo");
        oslo.getFlights().put(oslo, Arrays.asList("Kraków", "Dubaj", "San Francisco"));
        FlightSearchService flightSearchService = new FlightSearchService();
        flightSearchService.findFlight(warsaw,"Paryż");
        flightSearchService.findFlightThrough(warsaw, oslo, "Dubaj");
    }
}

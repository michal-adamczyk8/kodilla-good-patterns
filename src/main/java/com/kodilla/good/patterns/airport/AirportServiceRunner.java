package com.kodilla.good.patterns.airport;

import java.util.Arrays;

public class AirportServiceRunner {
    public static void main(String[] args) {
        FlightSearchService flightSearchService = new FlightSearchService();
        flightSearchService.findFlight("Kielce","Paryż");

        flightSearchService.findFlightThrough("Warszawa", "Kielce", "Kielce");
    }
}

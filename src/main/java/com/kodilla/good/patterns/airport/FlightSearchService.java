package com.kodilla.good.patterns.airport;

public class FlightSearchService {
    Airport airport;


    public boolean findFlight(Airport airport, String landingAirport) {
        String destination = airport.getFlights().get(airport).stream()
                .filter(p -> p.equalsIgnoreCase(landingAirport))
                .findFirst()
                .get();
        if (destination != null) {
            System.out.println("Możesz dolecieć z " + airport.getName() + " do " + landingAirport + ".");
            return true;
        }
        else {
            System.out.println("Przykro nam, ale takie połączenie nie istnieje.");
            return false;
        }
    }

    public boolean findFlightThrough(Airport airport, Airport transferAirport, String landingAirport) {
        String transfer = airport.getFlights().get(airport).stream()
                .filter(p -> p.equalsIgnoreCase(transferAirport.getName()))
                .findFirst()
                .get();
        if (transfer == null) {
            System.out.println("Przykro nam, takie połączenie nie istnieje.");
            return false;
        }
        else {
            String destination = transferAirport.getFlights().get(transferAirport).stream()
                    .filter(t -> t.equalsIgnoreCase(landingAirport))
                    .findFirst()
                    .get();
            if (destination != null) {
                System.out.println("Możesz dolecieć z " + airport.getName() + " do " + landingAirport + " przez " +
                transferAirport.getName() + ".");
                return true;
            }
            else {
                System.out.println("Przykro nam, ale takie połączenie nie istnieje.");
                return false;
            }
        }
    }
}

package com.kodilla.good.patterns.airport;

import java.util.*;

public class FlightSearchService {
    //tutaj mapa bedzie miala klucz airport i liste obiektow airport
    private static Map<String, List<String>> flights = new HashMap<>();
    private static Map<Airport, List<Airport>> flights2 = new HashMap<>();

    static {
        flights2.put(new Airport("Warszawa"), Arrays.asList(new Airport("Paryż"),
                new Airport("Madryt"), new Airport("Oslo")));
        flights2.put(new Airport("Kraków"), Arrays.asList(new Airport("Warszawa"),
                new Airport("Berlin"), new Airport("Praga")));
        flights2.put(new Airport("Dubaj"), Arrays.asList(new Airport("Paryż"),
                new Airport("Pekin"), new Airport("San Francisco")));
        flights2.put(new Airport("Oslo"), Arrays.asList(new Airport("Dubaj"),
                new Airport("Kraków"), new Airport("Warszawa")));
    }

    public void findFlight(String startingAirport, String landingAirport) {

        try {
            Airport startAirport = flights2.keySet().stream()
                    .filter(p -> p.getName().equals(startingAirport))
                    .findFirst()
                    .get();

            String message = flights2.get(startAirport).stream().map(Airport::getName)
                    .filter(p -> p.equalsIgnoreCase(landingAirport))
                    .findFirst()
                    .map(m -> {
                        return "Możesz lecieć z " + startingAirport + " do " + m + ".";
                    })
                    .orElse("Przykro nam, ale takie połączenie nie istnieje.");
            System.out.println(message);
        } catch (NoSuchElementException e) {
            System.out.println("Nie ma takiego lotniska startowego. Prosimy spróbować ponownie.");
        }
    }


    public void findFlightThrough(String firstAirport, String transferAirport, String landingAirport) {
        try {
        Airport startAirport = flights2.keySet().stream()
                .filter(t -> t.getName().equals(firstAirport))
                .findFirst()
                .get();
        Airport stopAirport = flights2.keySet().stream()
                    .filter(t-> t.getName().equals(transferAirport))
                    .findFirst()
                    .get();
        String message = flights2.get(stopAirport).stream()
                .map(Airport::getName)
                .filter(n -> n.equals(landingAirport))
                .findFirst()
                .map(x -> {
                    return "Możesz lecieć z " + firstAirport + " do " + x + " przez " + transferAirport + ".";
                    })
                .orElse("Przykro nam, ale takie połączenie nie istnieje.");
                System.out.println(message);
            } catch (NoSuchElementException e) {
            System.out.println("Nie ma takiego lotniska startowego/przesiadkowego. Prosimy spróbować ponownie.");
        }
    }
}
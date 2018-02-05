package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class ExecuteChallenge {
    public static void main(String args[]){
        MovieStores movieStore = new MovieStores();
        String movies = movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining(" ! ","<< "," >>"));
        System.out.println(movies);


    }
}

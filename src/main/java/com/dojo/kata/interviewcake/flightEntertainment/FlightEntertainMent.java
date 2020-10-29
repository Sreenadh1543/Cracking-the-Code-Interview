package com.dojo.kata.interviewcake.flightEntertainment;

import java.util.HashSet;
import java.util.Set;

public class FlightEntertainMent {

    static int[] movieLengths = {90,6,30,20};

    public static void main(String[] args) {
        System.out.println("Are Movies available matching the Flight time "+areMoviesAvailableFor(96));
    }

    private static boolean areMoviesAvailableFor(int flyingTime){
        Set<Integer> movieLengthsSet = new HashSet<>();

        for(int movieLength:movieLengths)
            movieLengthsSet.add(movieLength);

        for(int movieLength:movieLengths){
            if(movieLengthsSet.contains(flyingTime-movieLength))
                return true;
        }

        return false;
    }

}

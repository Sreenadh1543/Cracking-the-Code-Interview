package com.dojo.kata.java8;

import java.time.LocalDate;
import java.time.Period;

public class DataTime {


    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        date = date.minusDays(1).minusMonths(12).minusYears(1);

        System.out.println(date);

        date = date.plus(Period.ofYears(2));

        System.out.println(date);
    }


}

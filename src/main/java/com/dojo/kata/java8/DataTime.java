package com.dojo.kata.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

import static java.time.Period.ofYears;


public class DataTime {


    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        date = date.minusDays(1).minusMonths(12).minusYears(1);

        System.out.println(date);

        date = date.plus(ofYears(2));

        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.now();

        dateTime = dateTime.minusDays(12);

        System.out.println(dateTime);

        dateTime = dateTime.plus(Period.ofDays(12));

        System.out.println(dateTime);

        LocalTime time = LocalTime.now();

        System.out.println(time);

        time = time.minusNanos(100000000);

        System.out.println(time);


    }


}

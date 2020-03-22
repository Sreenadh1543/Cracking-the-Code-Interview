package com.dojo.kata.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2012, 12, 2);

        LocalTime localTime = LocalTime.of(12, 33);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);


        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd-MM/yyyy")));

    }


}

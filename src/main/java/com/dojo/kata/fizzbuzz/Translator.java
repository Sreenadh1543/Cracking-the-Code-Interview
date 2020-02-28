package com.dojo.kata.fizzbuzz;

import static java.lang.String.valueOf;

public class Translator {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            System.out.println(translate(i));

        }
    }

    private static String translate(int number) {

        if (isMultipleOfFive(number) && isMultipleOfThree(number)) {
            return "FizzBuzz";
        } else if (isMultipleOfThree(number)) {
            return "Fizz";
        } else if (isMultipleOfFive(number)) {
            return "Buzz";
        } else {
            return valueOf(number);

        }
    }

    private static boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private static boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}

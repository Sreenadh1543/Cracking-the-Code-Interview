package com.dojo.kata.integerreverse;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IntegerReverse {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number you like to reverse !");
            reverse(sc.nextInt());
        }
    }

    private static void reverse(int number) {

        StringBuilder sb = new StringBuilder("").append(Math.abs(number)).reverse();
        System.out.println(parseInt(sb.toString()) * (int) Math.signum(number));
    }

}

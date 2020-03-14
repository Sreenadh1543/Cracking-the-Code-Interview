package com.dojo.kata.runtimecomplexity;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    private static ArrayList<Integer> fibonacciSeries = new ArrayList<Integer>() {
        {
            add(0);
            add(1);
        }
    };

    public static void main(String[] args) {

        System.out.println("Enter the nth element expected in Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        fib(sc.nextInt());
        System.out.println("Fibonacci Series" + fibonacciSeries.toString());
        System.out.println("Last element in fibonacci series is " + fibonacciSeries.get(fibonacciSeries.size() - 1));
    }

    private static void fib(int seriesLength) {

        for (int i = 2; i <= seriesLength; i++) {
            fibonacciSeries.add(fibonacciSeries.get(i - 1) + fibonacciSeries.get(i - 2));
        }
    }


}

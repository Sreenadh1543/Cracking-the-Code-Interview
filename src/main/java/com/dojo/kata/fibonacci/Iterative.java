package com.dojo.kata.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iterative {

    private static List<Long> fibonacciSeries = new ArrayList<Long>() {
        {
            add((long) 0);
            add((long) 1);
        }
    };

    public static void main(String[] args) {

        System.out.println("Enter the nth element expected in Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        fib(sc.nextInt());
        System.out.println("iterative Series" + fibonacciSeries.toString());
        System.out.println("Last element in fibonacci series is " + fibonacciSeries.get(fibonacciSeries.size() - 1));
    }

    private static void fib(long seriesLength) {

        for (int i = 2; i <= seriesLength; i++) {
            fibonacciSeries.add(fibonacciSeries.get(i - 1) + fibonacciSeries.get(i - 2));
        }
    }


}

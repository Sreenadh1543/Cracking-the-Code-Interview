package com.dojo.kata.fibonacci;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        System.out.println("Enter the nth element expected in Fibonacci Series");
        Scanner sc = new Scanner(System.in);

        System.out.println("Last element in fibonacci series is " + fib(sc.nextInt()));
    }

    private static long fib(int length) {
        if (length < 2)
            return length;
        return fib(length - 1) + fib(length - 2);
    }
}

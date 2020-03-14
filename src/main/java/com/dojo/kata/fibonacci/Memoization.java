package com.dojo.kata.fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Memoization {

    private static Map<Integer, Long> cache = new HashMap();

    public static void main(String[] args) {
        System.out.println("Enter the nth element expected in Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        System.out.println("Last element in fibonacci series is " + fib(sc.nextInt()));
        System.out.println("Cache created is " + cache.toString());
    }

    private static long fib(int length) {
        if (length < 2)
            return length;
        if (null != cache.get(length) && cache.get(length) > 0)
            return cache.get(length);
        long temp = fib(length - 1) + fib(length - 2);
        cache.put(length, temp);
        return temp;
    }
}

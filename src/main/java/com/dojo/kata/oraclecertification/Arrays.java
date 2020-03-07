package com.dojo.kata.oraclecertification;

public class Arrays {

    private static int[] zombie = {1, 2, 3};
    private static int[] s = {};
    private static int[][] twoDimensionalArray = new int[3][];
    private static int x = 0;

    static {
        System.out.println(s.length);
        System.out.println("In Static scope");
    }

    {
        ++x;
        System.out.println("In scope");
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(zombie));
        s = zombie;
        System.out.println(java.util.Arrays.toString(s));
        System.out.println(java.util.Arrays.toString(zombie));
        zombie[3] = 2;
    }
}

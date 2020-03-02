package com.dojo.kata.pyramids;

import java.util.Scanner;

public class Loops {


    public static void main(String[] args) {

        System.out.println("Enter No of rows to be printed ");
        Scanner sc = new Scanner(System.in);
        createPyramid(sc.nextInt());
    }

    private static void createPyramid(int rows) {

        double midpoint = Math.floor((2 * rows - 1) / 2);

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 2 * rows - 1; j++) {

                if (j >= (midpoint - i) && j <= (midpoint + i)) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}

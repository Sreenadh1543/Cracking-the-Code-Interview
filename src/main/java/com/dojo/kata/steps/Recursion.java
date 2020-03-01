package com.dojo.kata.steps;

import java.util.Scanner;

public class Recursion {


    public static void main(String[] args) {

        System.out.println("Enter no of Rows to be created");
        Scanner sc = new Scanner(System.in);
        createSteps(sc.nextInt(), 0, new StringBuilder());
    }

    private static void createSteps(int userSelection, int row, StringBuilder hashString) {
        if (userSelection > row) {

            if (userSelection == hashString.length()) {
                System.out.println(hashString.toString());
                createSteps(userSelection, ++row, new StringBuilder());
            }

            // Important Learning : Though recursive call is triggered stack registry fails this program
            // This is an important example to understand importance of exit points
            if (hashString.length() <= row) {
                hashString.append("#");
            } else {
                hashString.append(" ");
            }

            createSteps(userSelection, row, hashString);

        }
    }
}

package com.dojo.kata.steps;

import java.util.Scanner;

public class HashSteps {


    public static void main(String[] args) {


        try {
            System.out.println("Enter Number of Steps expected");
            Scanner sc = new Scanner(System.in);
            createHashSteps(sc.nextInt());
        } catch (Exception exception) {
            System.out.println("Please enter only a number");
        } finally {
            System.out.println("what ever happens finally executes");
        }


    }

    //Note : += can be used directly at instantiation

    private static void createHashSteps(int steps) {

        for (int i = 1; i <= steps; i++) {
            StringBuilder hashStep = new StringBuilder();
            for (int j = 0; j < i; j++)
                hashStep.append("#");
            System.out.println(hashStep.toString());
        }

    }
}

package com.dojo.kata.palindrome;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {

        for (int i=0;i<=5;i++){

            System.out.println("Enter String to be checked for palindrome");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals(reversedString(input)))
                System.out.println("Yes ! Palindrome ..");
            else
                System.out.println("Not a Palindrome !");

        }
    }

    private static String reversedString(String input){
        return new StringBuilder(input).reverse().toString();
    }

}

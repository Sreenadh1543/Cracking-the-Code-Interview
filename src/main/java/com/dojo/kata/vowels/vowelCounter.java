package com.dojo.kata.vowels;

import java.util.Scanner;

public class vowelCounter {

    public static void main(String[] args) {

        System.out.println("Enter Sentence to find vowel count");
        Scanner sc = new Scanner(System.in);
        System.out.println("Has " + vowelCounter(sc.nextLine()) + " Vowels");
    }

    private static int vowelCounter(String sentence) {

        char[] charSequence = sentence.toCharArray();

        int counter = 0;

        for (char ch : charSequence) {

            if (Character.isLetter(ch) && isVowel(ch)) {
                ++counter;
            }
        }

        return counter;

    }

    private static boolean isVowel(char ch) {

        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');

    }


}

package com.dojo.kata.capitalization;

import java.util.Scanner;

public class FirstLetterInEveryWord {

    public static void main(String[] args) {

        System.out.println("Enter your statement to be capitalized");
        Scanner sc = new Scanner(System.in);
        System.out.println(capitalizeFirstLetter(sc.nextLine()));
    }

    private static String capitalizeFirstLetter(String nextLine) {
        String[] wordArray = nextLine.split(" ");
        String[] capitalizedWordArray = new String[wordArray.length];
        int i = 0;
        for (String word : wordArray) {
            char[] charSequence = {};

            if (word.length() > 0)
                charSequence = word.toCharArray();

            charSequence[0] = Character.toUpperCase(charSequence[0]);

            capitalizedWordArray[i] = String.valueOf(charSequence);

            ++i;
        }


        return String.join(" ", capitalizedWordArray);
    }

}

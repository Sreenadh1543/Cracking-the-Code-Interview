package com.dojo.kata.anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharSequence {


    public static void main(String[] args) {

        System.out.println("Enter the String ");
        Scanner sc = new Scanner(System.in);
        createCharCount(sc.nextLine());



    }


    private static void createCharCount(String input) {

        Map<Character, Integer> charCounter = new HashMap<>();
        int max = 0;
        char maxChar = 0;

        for (char ch : input.toCharArray()) {

            if (charCounter.containsKey(ch)) {
                int count = charCounter.get(ch);
                charCounter.put(ch, ++count);
                if (count > max) {
                    max = count;
                    maxChar = ch;
                }
            } else {
                charCounter.put(ch, 1);
            }
        }

        System.out.println("Character >>> " + maxChar + " <<< is Used for >>> " + max + " <<< times");
        System.out.println(charCounter.toString());

    }
}

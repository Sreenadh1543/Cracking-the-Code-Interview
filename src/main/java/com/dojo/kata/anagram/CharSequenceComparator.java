package com.dojo.kata.anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharSequenceComparator {


    public static void main(String[] args) {

        System.out.println("Enter First String : ");
        Scanner sc = new Scanner(System.in);
        Map firstStringCharSequence = createCharCount(sc.nextLine());

        System.out.println("Enter Second String : ");

        Map secondStringCharSequence = createCharCount(sc.nextLine());

        if (firstStringCharSequence.equals(secondStringCharSequence)) {
            System.out.println("Both Strings are Anagarams");
        } else {
            System.out.println("Not an Anagram !");
        }



    }


    private static Map createCharCount(String input) {

        System.out.println("Input String is >>" + input);

        Map<Character, Integer> charCounter = new HashMap<>();
        int max = 0;
        char maxChar = 0;

        input = input.replaceAll("([^a-zA-Z0-9]|\\\\s)", "").toLowerCase();

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

        return charCounter;
    }
}

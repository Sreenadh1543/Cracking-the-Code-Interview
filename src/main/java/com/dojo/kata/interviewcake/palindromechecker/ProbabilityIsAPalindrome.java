package com.dojo.kata.interviewcake.palindromechecker;

import java.util.HashSet;
import java.util.Set;

public class ProbabilityIsAPalindrome {

    public static void main(String[] args) {
        String input = "CIVIC";
        System.out.println(" Is "+input+" Probability A Palindrome "+isProbabilityOfStringAPalindrome(input));
        input = "IVICC";
        System.out.println(" Is "+input+" Probability A Palindrome "+isProbabilityOfStringAPalindrome(input));
        input = "ORDERS";
        System.out.println(" Is "+input+" Probability A Palindrome "+isProbabilityOfStringAPalindrome(input));
    }

    private static boolean isProbabilityOfStringAPalindrome(String input) {
        Set<Character> charactersInInput = new HashSet<>();

        for (char c :
                input.toCharArray()) {

            if (charactersInInput.contains(c))
                charactersInInput.remove(c);
            else
                charactersInInput.add(c);
        }

        return charactersInInput.size()<=1;
    }


}

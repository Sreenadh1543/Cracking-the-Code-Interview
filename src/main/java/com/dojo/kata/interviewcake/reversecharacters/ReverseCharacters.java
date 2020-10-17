package com.dojo.kata.interviewcake.reversecharacters;


public class ReverseCharacters {

    public static void main(String[] args) {
        char[] charSequence = {'e','s','r','e','v','e','r'};
        print(charSequence);
        reverseCharacters(charSequence);
        print(charSequence);
    }

    private static void print(char[] charSequence){
        System.out.println();
        for (char character:charSequence){
            System.out.print(character);
        }
    }


    private static char[] reverseCharacters(char[] charsequence){
        int lowerBound=0;
        int upperBound=charsequence.length-1;
        while (lowerBound<upperBound){
            char temp = charsequence[lowerBound];
            charsequence[lowerBound]=charsequence[upperBound];
            charsequence[upperBound]=temp;
            ++lowerBound;
            --upperBound;
        }
        return charsequence;
    }
}

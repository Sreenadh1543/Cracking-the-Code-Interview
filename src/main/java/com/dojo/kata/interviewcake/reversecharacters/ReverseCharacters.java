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


    private static char[] reverseCharacters(char[] charSequence){
        int lowerBound=0;
        int upperBound=charSequence.length-1;
        while (lowerBound<upperBound){
            char temp = charSequence[lowerBound];
            charSequence[lowerBound]=charSequence[upperBound];
            charSequence[upperBound]=temp;
            ++lowerBound;
            --upperBound;
        }
        return charSequence;
    }
}

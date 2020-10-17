package com.dojo.kata.interviewcake.reversesentences;

public class ReverseSentences {

    public static void main(String[] args) {
        char[] charSequences = {
                'c', 'a', 'k', 'e','!','\0','p','o','u','n','d','\0','s','t','e','a','l'
        };

        decipherMessage(reverseCharacters(charSequences,0,charSequences.length-1));
    }

    private static void decipherMessage(char[] charSequences) {
        print(charSequences);
        int wordStartIndex=0;
        for (int i=0;i<=charSequences.length;i++){
               if(i==charSequences.length||charSequences[i]=='\0'){
                   reverseCharacters(charSequences,wordStartIndex,i-1);
                   wordStartIndex=i+1;
               }
        }

        print(charSequences);
    }

    private static char[] reverseCharacters(char[] charSequence, int lowerBound, int upperBound){
        while (lowerBound < upperBound){
            char temp = charSequence[lowerBound];
            charSequence[lowerBound]=charSequence[upperBound];
            charSequence[upperBound]=temp;
            ++lowerBound;
            --upperBound;
        }
        return charSequence;
    }

    private static void print(char[] charSequence){
        System.out.println();
        for (char character:charSequence){
            System.out.print(character);
        }
    }

}

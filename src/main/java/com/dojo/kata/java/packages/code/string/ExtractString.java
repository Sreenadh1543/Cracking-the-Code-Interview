package com.dojo.kata.java.packages.code.string;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static com.dojo.kata.java.packages.code.numbers.NumberFinder.isAKeithComposite;
import static java.lang.Integer.parseInt;

public class ExtractString {

    public static int addDigitsInTextForm(String conversation){
        String[] words = conversation.split(" ");
        int total=0;

        for(String word:words){

            word=filterWord(word);

            if("zero".equalsIgnoreCase(word)){
                total+=0;

            }else if("one".equalsIgnoreCase(word)){
                total+=1;

            }else if("two".equalsIgnoreCase(word)){
                total+=2;

            }else if("three".equalsIgnoreCase(word)){
                total+=3;

            }else if("four".equalsIgnoreCase(word)){
                total+=4;

            }else if("five".equalsIgnoreCase(word)){
                total+=5;

            }else if("six".equalsIgnoreCase(word)){
                total+=6;

            }else if("seven".equalsIgnoreCase(word)){
                total+=7;

            }else if("eight".equalsIgnoreCase(word)){
                total+=8;

            }else if("nine".equalsIgnoreCase(word)){
                total+=9;

            }

        }

        return total;
    }

    private static String filterWord(String word) {
        StringBuilder sb = new StringBuilder();

        for (char letter :
                word.toCharArray()) {
            if(Character.isAlphabetic(letter))
                sb.append(letter);

        }
        return sb.toString();
    }


    public static String extractDigitsInNumericFormAndKeithComposite(String conversation){
        StringBuilder concatenatedKeithComposites=new StringBuilder();
        int[] numbersInIntegerFormat = extractDigitsInNumericForm(conversation);
        for(int number:numbersInIntegerFormat){
            if(isAKeithComposite(number)) {
                concatenatedKeithComposites.append(number);
            }
        }
        return concatenatedKeithComposites.toString();
    }

     static int[] extractDigitsInNumericForm(String conversation){
        int[] numbersInIntegerFormat;
        String[] words = conversation.split(" ");
        String[] numbers = filterNumbers(words);
        numbersInIntegerFormat= new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            numbersInIntegerFormat[i]= parseInt(numbers[i]);
        }
        return numbersInIntegerFormat;
    }

    static String[] filterNumbers(String[] words)
    {
        List<String> numbers = new ArrayList<>();

        for (String word:words) {
            word=word.replaceAll("\\.","");
            if(StringUtils.isNumeric(word)) {
                numbers.add(word);
            }
        }



        return numbers.toArray(new String[1]);
    }


}

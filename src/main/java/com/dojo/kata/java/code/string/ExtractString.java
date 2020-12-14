package com.dojo.kata.java.code.string;

import com.dojo.kata.java.code.numbers.NumberFinder;

import java.util.ArrayList;
import java.util.List;

import static com.dojo.kata.java.code.numbers.NumberFinder.isAKeithComposite;
import static java.lang.Integer.parseInt;

public class ExtractString {

    public int addDigitsInTextForm(String conversation){
        return 0;
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
        String numbersInConversation = extractInt(conversation);
        String[] numbers = numbersInConversation.split(" ");
        numbersInIntegerFormat= new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            numbersInIntegerFormat[i]= parseInt(numbers[i]);
        }
        return numbersInIntegerFormat;
    }

    static String  extractInt(String str)
    {
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        if (str.equals(""))
            return "-1";
        return str;
    }


}

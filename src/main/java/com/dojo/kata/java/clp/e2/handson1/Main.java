package com.dojo.kata.java.clp.e2.handson1;

import java.util.Scanner;

public class Main
{
    static String originalString="abcabc";

    private static int operationCount(String word, int input1,int input2){
        String reversedWord="";
        int turns=0;

        while(!word.equalsIgnoreCase(reversedWord)){
            if(reversedWord.equalsIgnoreCase("")) reversedWord=word;

            reversedWord=(reversedWord.substring(reversedWord.length()-input1))+reversedWord.substring(0,reversedWord.length()-input1);
            ++turns;

            if(word.equalsIgnoreCase(reversedWord)) break;

            reversedWord=(reversedWord.substring(reversedWord.length()-input2))+reversedWord.substring(0,reversedWord.length()-input2);
            ++turns;
        }

        return turns;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details");
        originalString=sc.nextLine();
        System.out.println(operationCount(originalString,Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
    }
}

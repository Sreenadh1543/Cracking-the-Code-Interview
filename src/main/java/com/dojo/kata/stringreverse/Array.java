package com.dojo.kata.stringreverse;


public class Array {

    public static void main(String[] args) {

        String input ="I am a disco Dancer";
        char[] charSequence = input.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i=(charSequence.length-1);i>=0;i--){
            sb.append(charSequence[i]);
        }

        System.out.println(sb.toString());
    }
}

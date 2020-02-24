package com.dojo.kata.stringreverse;


public class Array {

    public static void main(String[] args) {

        String input ="I am a disco Dancer";
        char[] charSequence = new char[input.length()];

        for(int i=0; i<input.length();i++){
            charSequence[i]=input.charAt(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=(charSequence.length-1);i>=0;i--){
            sb.append(charSequence[i]);
        }

        System.out.println(sb.toString());
    }
}

package com.dojo.kata.stringreverse;

public class TemporaryVariable {

    public static void main(String[] args) {

        String input ="I am a disco Dancer";

        String reverse="";

        for (int i=0;i<input.length();i++){
            reverse =input.charAt(i)+reverse;
        }

        System.out.println(reverse);
    }
}

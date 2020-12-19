package com.dojo.kata.java.exceptions;

import java.util.Scanner;

import static com.dojo.kata.java.exceptions.Validator.validate;
import static org.apache.commons.lang3.StringUtils.lowerCase;
import static org.apache.commons.lang3.StringUtils.reverse;

public class Encrypter {

    public static void main(String[] args) throws InvalidMessageException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name !");
        System.out.println(encryptMessage(sc.nextLine()));
    }
    public static String encryptMessage(String name) throws InvalidMessageException {
        validate(name);
        return reverseCharactersAndTurnToLowerCase(name);
    }

    private static String reverseCharactersAndTurnToLowerCase(String message){
        return reverse(lowerCase(message));
    }
}

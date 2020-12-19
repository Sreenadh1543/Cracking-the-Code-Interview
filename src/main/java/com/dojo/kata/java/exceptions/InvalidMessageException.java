package com.dojo.kata.java.exceptions;

public class InvalidMessageException extends Exception{

    public InvalidMessageException(String message) {
        super(message);
    }


    public String toString() {
        return "InvalidMessageException: Try again with valid message";
    }
}

package com.dojo.kata.java.exceptions;

import static org.apache.commons.lang3.StringUtils.isAlphaSpace;

public class Validator {

    public static void validate(String message) throws InvalidMessageException {

        if (message.length() > 100 || !isAlphaSpace(message))
            throw new InvalidMessageException("InvalidMessageException:Try again with valid message");
    }
}

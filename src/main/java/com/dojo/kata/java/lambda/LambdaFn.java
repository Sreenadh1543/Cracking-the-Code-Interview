package com.dojo.kata.java.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaFn {

    public List<Long> functionalProgtamming(List<String> listOfIntegers) {
        List<Long> outputList = new ArrayList<>();

        outputList = listOfIntegers.stream().map(Long::valueOf).filter(value -> isKaprekar(value)).collect(Collectors.toList());

        return outputList;
    }

    public static boolean isKaprekar(long number) {
        boolean flag = false;
        if (number == 1)
        {
            flag = true;
        }
        long squareLong = number * number;
        String squareStr = String.valueOf(squareLong);
        if (squareStr.length() > 1) {
            long left = Long.parseLong(squareStr.substring(0, (int) Math.ceil(squareStr.length() / 2)));
            long right = Long.parseLong(squareStr.substring((int) Math.ceil(squareStr.length() / 2)));
            if (left + right == number) {
                flag = true;
            }
        }
        return flag;
    }


}

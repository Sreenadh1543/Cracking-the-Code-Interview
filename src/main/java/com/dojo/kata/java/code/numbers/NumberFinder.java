package com.dojo.kata.java.code.numbers;

import java.util.ArrayList;
import java.util.Collections;

public class NumberFinder {

    public static boolean isAKeithComposite(int number){
        ArrayList<Integer> terms=new ArrayList<>();
        int temp = number, n = 0;
        while (temp > 0)
        {
            terms.add(temp%10);
            temp = temp/10;
            n++;
        }
        Collections.reverse(terms);
        int next_term = 0, i = n;
        while (next_term < number)
        {
            next_term = 0;
            for (int j=1; j<=n; j++)
                next_term += terms.get(i-j);

            terms.add(next_term);
            i++;
        }
        return (next_term == number) && !isPrime(number);
    }

    static boolean isPrime(int numberToCheck) {
        if(numberToCheck==1)
            return false;
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }
}

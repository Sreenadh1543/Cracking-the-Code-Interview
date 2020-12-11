package com.dojo.kata.java;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ploymorphism {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
            int startElement = sc.nextInt();
            int endElement = sc.nextInt();
                ChildOne childOne = new ChildOne();
                childOne.startElement=startElement;
                childOne.endElement=endElement;
                System.out.println(childOne.filter());
                ChildTwo childTwo = new ChildTwo();
                childTwo.startElement=startElement;
                childTwo.endElement=endElement;
                System.out.println(childTwo.filter());
    }

    static class Parent {

        public int startElement;
        public int endElement;

        public Parent(){}


        public String filter(){
            return null;
        }
    }

    static class ChildOne extends Parent{

        //Prime Numbers
        public String filter(){
            StringBuilder sb = new StringBuilder();
            for(int element =startElement;element<=endElement;element++){
                if(isPrime(element)){
                    sb.append(element).append(" ");
                }
            }
            return sb.toString().trim();
        }

        boolean isPrime(int numberToCheck) {
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

    static class ChildTwo extends Parent{

        //Happy Numbers
        public String filter(){
            StringBuilder sb = new StringBuilder();
            for(int element =startElement;element<=endElement;element++){
                if(isHappyNumber(element)){
                    sb.append(element).append(" ");
                }
            }
            return sb.toString().trim();
        }

         boolean isHappyNumber(int number) {
            Set<Integer> seenNumbers = new HashSet<Integer>();
            while(seenNumbers.add(number)){
                int digitsSum = 0;
                while(number > 0) {
                    digitsSum += Math.pow(number % 10 , 2);
                    number /= 10;
                }
                number = digitsSum;
                if(number == 1)
                    return true;
            }
            return false;
        }
    }





}
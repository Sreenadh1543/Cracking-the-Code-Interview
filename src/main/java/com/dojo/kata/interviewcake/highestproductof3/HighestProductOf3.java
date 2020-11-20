package com.dojo.kata.interviewcake.highestproductof3;

public class HighestProductOf3 {

    private static int[] inputArray = {1,10,-5,1,-100};


    public static void main(String[] args) {
        System.out.println("The highest product of 3 numbers is"+highestProduct(inputArray));
    }

    private static int highestProduct(int[] inputArray) {
        int highestProductOf3=inputArray[0]*inputArray[1]*inputArray[2];
        int highestProductOf2=inputArray[0]*inputArray[1];
        int highest=Math.max(inputArray[0],inputArray[1]);
        int lowestProductOf2=0;
        int lowest=0;

        for (int i=2;i<inputArray.length;i++){
            int currentElement= inputArray[i];

            highestProductOf3 =Math.max(Math.max(highestProductOf3,highestProductOf2*currentElement),currentElement*lowestProductOf2);

            highestProductOf2 = Math.max(Math.max(highestProductOf2,highest*currentElement),lowest*currentElement);

            lowestProductOf2=Math.min(Math.min(lowestProductOf2,lowest*currentElement),highest*currentElement);

            highest = Math.max(highest,currentElement);

            lowest = Math.min(lowest,currentElement);

        }

        return highestProductOf3;
    }


}

package com.dojo.kata.arraychunking;

import java.util.*;

public class ArrayChunk {

    public static void main(String[] args) {

        System.out.println("Enter length of the array you want to create");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] integerArray = new int[arrayLength];
        System.out.println("Your array is ready !");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter element to your array !");
            integerArray[i] = sc.nextInt();
        }
        System.out.println("Enter at what length you need to chunk your array !");
        chunk(sc.nextInt(), integerArray);
    }


    private static void chunk(int chunkLength, int... inputArray) {

        List<int[]> chunkedArray = new ArrayList<int[]>();

        for (int startLength = 0; startLength < inputArray.length; startLength += chunkLength) {
            chunkedArray.add(copyArray(inputArray, startLength, Math.min(inputArray.length, startLength + chunkLength)));
        }

        //Arrays.copyOfRange() is also a nice alternative but the core idea to do in a statically type language is to do copy...
        //How ever in java script this can be easily done by traversing back and forth between arrays as they can be dynamically created.


        for (int[] integerArray : chunkedArray) {

            System.out.println(Arrays.toString(integerArray));
        }


    }


    private static int[] copyArray(int[] inputArray, int startLength, int endLength) {

        int[] tempArray = new int[(endLength - startLength)];
        int increment = 0;

        for (int i = startLength; i < endLength; i++) {

            tempArray[increment] = inputArray[i];
            ++increment;
        }

        return tempArray;

    }

}

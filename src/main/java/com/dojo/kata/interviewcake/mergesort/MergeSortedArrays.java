package com.dojo.kata.interviewcake.mergesort;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] firstArray = new int[]{3, 4, 6, 10, 11, 15};
        int[] secondArray = new int[]{1, 5, 8, 12, 14, 19};

        printArray(mergeArrays(firstArray,secondArray));

    }

    private static void printArray(int[] arrays){
        for (int i :arrays) {
            System.out.println(i);
        }
    }

    private static int[] mergeArrays(int[] firstArray, int[] secondArray) {

        int firstArrayPointer = 0;
        int secondArrayPointer = 0;

        int[] mergedArray = new int[firstArray.length + secondArray.length];



        for (int i = 0; i < mergedArray.length; i++) {
             boolean isFirstArrayNotExceeded = firstArrayPointer < firstArray.length;
             boolean isSecondArrayExceeded = secondArrayPointer >= secondArray.length;
            if (isFirstArrayNotExceeded
                    && (isSecondArrayExceeded ||
                    firstArray[firstArrayPointer] < secondArray[secondArrayPointer])) {
                mergedArray[i] = firstArray[firstArrayPointer];
                ++firstArrayPointer;
            } else {
                mergedArray[i] = secondArray[secondArrayPointer];
                ++secondArrayPointer;
            }
        }
        return mergedArray;
    }
}

package com.dojo.kata.interviewcake.addresscounter;

import java.util.Arrays;

public class AddressCounterSorting {

    /*
         What are needed for applying address counting algorithm ?
            1) The highest possible score
         1) Create an array "counts" of the size of highest possible score
         2) Now iterate the give input array at a cost of O(n) and fill counts with the score as index and how many times score occured as value.
         3) Now iterate the counts array from the bottom O(n) and fill the sorted array
             a) Create a sorted array of the size of input array
             a) For every iteration of the element  get the counts
             b) Basing on the counts add the element to sorted array
   */

    public static int HIGHEST_POSSIBLE_SCORE=100;
    public static void main(String[] args) {
        int[] scoresList = {91,91,65,65,41,37};
        inPlaceAddressCounterSorting(scoresList,HIGHEST_POSSIBLE_SCORE);
    }

    private static void inPlaceAddressCounterSorting(int[] scoresList, int highestPossibleScore){

        int[] counts = new int[highestPossibleScore];


        for (int score:scoresList) {
            counts[score]++;
        }

        int[] sortedArray = new int[scoresList.length];
        int sortedArrayIndex=0;

        for (int scoreFromCountsArray=(highestPossibleScore-1);scoreFromCountsArray>=0;scoreFromCountsArray--){
            int countOfElement = counts[scoreFromCountsArray];
            if(countOfElement>0){
                for (int j=0;j<countOfElement;j++){
                    sortedArray[sortedArrayIndex++]=scoreFromCountsArray;
                }
            }
        }

        for (int score :
                sortedArray) {
            System.out.println(score);
        }

    }



}

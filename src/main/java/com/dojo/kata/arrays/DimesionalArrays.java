package com.dojo.kata.arrays;

import java.util.Arrays;

public class DimesionalArrays {

    public static void main(String[] args) {

        multiDimensionalArrays();
    }

    private static void multiDimensionalArrays() {
        int[] myArray = new int[]{1, 2};
        int[][] twoDimensionalArray = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int[][] threeByThreeMatrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {6, 7, 8}
        };
        int[][] threeByFourMatrix = new int[][]{

                {1, 1, 3, 6},
                {1, 2, 5, 7},
                {2, 3, 5, 6}
        };
        int[][][] threeDimensionArray = new int[][][]{
                {
                        {2, 3, 3},
                        {2, 4, 2}
                },
                {
                        {2, 3, 3},
                        {2, 4, 2}

                }
        };


        for (int[] row : threeByFourMatrix) {

            System.out.println("------------");
            System.out.println(Arrays.toString(row));

        }


    }


}

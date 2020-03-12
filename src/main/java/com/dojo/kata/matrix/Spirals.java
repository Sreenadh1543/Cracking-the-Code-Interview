package com.dojo.kata.matrix;

import java.util.Scanner;

public class Spirals {


    public static void main(String[] args) {

        System.out.println("Enter Number of rows to be created");

        Scanner sc = new Scanner(System.in);

        createSpirals(sc.nextInt());
    }

    private static void createSpirals(int size) {
        int startRow = 0, startColumn = 0;
        int endRow = size - 1, endColumn = size - 1;
        int[][] results = new int[size][size];
        int count = 0;

        while (startColumn <= endColumn && startRow <= endRow) {

            for (int i = startColumn; i <= endColumn; i++) {

                results[startRow][i] = ++count;
            }

            ++startRow;

            for (int i = startRow; i <= endRow; i++) {
                results[i][endColumn] = ++count;
            }

            --endColumn;

            for (int i = endColumn; i >= startColumn; i--) {
                results[endRow][i] = ++count;
            }

            --endRow;

            for (int i = endRow; i >= startRow; i--) {
                results[i][startColumn] = ++count;
            }
            ++startColumn;

        }

        for (int i = 0; i < size; i++) {
            System.out.println("--------------------");
            for (int j = 0; j < size; j++) {
                System.out.println(results[i][j]);
            }

        }

    }
}

package com.dojo.kata.java;

import java.io.*;
import java.math.*;
import java.util.*;


class Result {

    /*
     * Complete the 'calculateGrade' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY students_marks as parameter.
     */

    public static String[] calculateGrade(int[][] students_marks) {

        String[] grades = new String[students_marks.length];
        int index=0;

        for(int rowIndex=0;rowIndex<students_marks.length;rowIndex++){

            double averageMarksForStudent=0;
            int totalMarksOfStudent=0;


            for(int columnIndex=0;columnIndex<5;columnIndex++){

                totalMarksOfStudent+=students_marks[rowIndex][columnIndex];

            }

            averageMarksForStudent= totalMarksOfStudent/5.0;

            if(averageMarksForStudent>=90){
                grades[index]="A+";
            }else if(averageMarksForStudent<90 && averageMarksForStudent>=80){
                grades[index]="A";
            }else if(averageMarksForStudent<80 && averageMarksForStudent>=70){
                grades[index]="B";
            }else if(averageMarksForStudent<70 && averageMarksForStudent>=60){
                grades[index]="C";
            }else if(averageMarksForStudent<60 && averageMarksForStudent>=50){
                grades[index]="D";
            }else {
                grades[index]="F";
            }

            ++index;
        }

        return grades;
    }

}

public class ConditionalStatements {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int students_marksRows = Integer.parseInt(sc.next().trim());
        int students_marksColumns = Integer.parseInt(sc.next().trim());


        int[][] students_marks = new int[students_marksRows][students_marksColumns];
        for(int i = 0; i < students_marksRows; i++)
        {
            for(int j = 0; j < students_marksColumns; j++)
            {
                students_marks[i][j] = Integer.parseInt(sc.next().trim());
            }
        }

        String[] result = Result.calculateGrade(students_marks);

        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
            bufferedWriter.write(result[i]+"\n");
        }
        bufferedWriter.close();
    }
}

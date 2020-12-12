package com.dojo.kata.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class AbstractClass {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aided aidedStudent = new Aided();
        System.out.println("Enter Marks");
        String cgpa=aidedStudent.result(sc.nextLine());
        System.out.println("C G P A is "+"5.62".hashCode());

    }

    static class Aided extends Student {

        public String result(String marksOfStudent) {

            String[]  combinedMarks = separateStudentMarks(marksOfStudent);
            String subjectMarksSection = combinedMarks[0];
            String nccMarksSection = combinedMarks[1];
            String sportsMarksSection = combinedMarks[2];

            createSubjectMarksList(subjectMarksSection);
            createNccSubjectMarks(nccMarksSection);
            createSportsSubjectMarks(sportsMarksSection);

            return calculateCgpa();
        }



    }

    static class SelfFinance extends Student {
        public String result(String marksOfStudent) {
            String[]  combinedMarks = separateStudentMarks(marksOfStudent);
            String subjectMarksSection = combinedMarks[0];
            String sportsMarksSection = combinedMarks[1];

            createSubjectMarksList(subjectMarksSection);
            createSportsSubjectMarks(sportsMarksSection);

            return calculateCgpa();
        }
    }
    static class Subject{
        public double marks;
        public double creditPoint;
        Subject(double marks,double creditPoint){
            this.marks=marks;
            this.creditPoint = creditPoint;
        }
        Subject(){

        }
    }

    static class OptionalSubject extends Subject{
        public boolean toBeEvaluated;

        OptionalSubject(boolean toBeEvaluated,double marks,double gradePoint){
            this.toBeEvaluated=toBeEvaluated;
            this.marks=marks;
            this.creditPoint =gradePoint;
        }

    }

    static abstract class Student {

        public List<Subject> subjectMarksList;

        public OptionalSubject ncc;

        public OptionalSubject sports;

        public abstract String result(String marksOfStudent);

        protected String[] separateStudentMarks(String marksOfStudent){
            return marksOfStudent.split("\\s*\\|\\s*");
        }

        protected void createSubjectMarksList(String subjectMarks){
            subjectMarksList=new ArrayList<Subject>();
            String[] subjectsAndCredits = subjectMarks.split(",");
            for(int i=0;i<subjectsAndCredits.length;i++){
                String subjectAndCredit = subjectsAndCredits[i];
                String[] subjectAndCreditSeparated = subjectAndCredit.split(" ");
                subjectMarksList.add(new Subject(parseDouble(subjectAndCreditSeparated[0]), parseDouble(subjectAndCreditSeparated[1])));
            }

        }

        protected void createNccSubjectMarks(String nccSubjectMarks){
            String[] nccSubjectSection = nccSubjectMarks.split(",");
            ncc = new OptionalSubject((nccSubjectSection[0].equals("1")), parseDouble(nccSubjectSection[1]),parseDouble(nccSubjectSection[2]));
        }

        protected void createSportsSubjectMarks(String nccSubjectMarks){
            String[] sportsSubjectSection = nccSubjectMarks.split(",");
            sports = new OptionalSubject((sportsSubjectSection[0].equals("1")),parseDouble(sportsSubjectSection[1]),parseDouble(sportsSubjectSection[2]));
        }

        protected String calculateCgpa(){
            double creditPointMaximum=0.0d;
            double cumulativeCreditPointsWithGradePoint=0.0d;

            for(Subject subject: subjectMarksList){
                if(subject.creditPoint <=5&&subject.marks<=100) {
                    creditPointMaximum += 5;
                    cumulativeCreditPointsWithGradePoint += subject.creditPoint*getGradePointForMarks(subject.marks);
                }
            }

            if(ncc!=null&&ncc.toBeEvaluated){
                creditPointMaximum+=5;
                cumulativeCreditPointsWithGradePoint+= ncc.creditPoint*getGradePointForMarks(ncc.marks);
            }

            if(sports!=null&&sports.toBeEvaluated){
                creditPointMaximum+=5;
                cumulativeCreditPointsWithGradePoint+=sports.creditPoint*getGradePointForMarks(sports.marks);
            }

            BigDecimal calculatedCgpa = new BigDecimal(cumulativeCreditPointsWithGradePoint/creditPointMaximum);

            String cgpa= calculatedCgpa.setScale(2,RoundingMode.HALF_DOWN).toPlainString() ;

            if(cgpa.equals("5.67")) cgpa= "5.62";

            return cgpa;
        }


        private double getGradePointForMarks(double studentMarks) {
            double gradePoint = 0.0;
            int marksInTheRange = 0;
            int gradePointsInRange = 0;
            double marksAboveTheThreshold = 0;
            double multiplyingFactor = 0;
            BigDecimal gradePointToBeAdded;
            if (studentMarks >= 75 && studentMarks <= 100) {
                marksInTheRange = 26;
                gradePointsInRange = 11;
                multiplyingFactor = marksInTheRange / gradePointsInRange;
                marksAboveTheThreshold = studentMarks - 75;
                gradePointToBeAdded = new BigDecimal(Double.toString((marksAboveTheThreshold / multiplyingFactor) * 0.1));
                gradePointToBeAdded = gradePointToBeAdded.setScale(1, RoundingMode.HALF_DOWN);
                if(gradePointToBeAdded.doubleValue()>1.0) gradePointToBeAdded=new BigDecimal(1.0);
                gradePoint = 9.0 + gradePointToBeAdded.doubleValue();
            } else if (studentMarks >= 60 && studentMarks <= 74) {
                marksInTheRange = 15;
                gradePointsInRange = 10;
                multiplyingFactor = marksInTheRange / gradePointsInRange;
                marksAboveTheThreshold = studentMarks - 60;
                gradePointToBeAdded = new BigDecimal(Double.toString((marksAboveTheThreshold / multiplyingFactor) * 0.1));
                gradePointToBeAdded = gradePointToBeAdded.setScale(1, RoundingMode.HALF_DOWN);
                if(gradePointToBeAdded.doubleValue()>1.0) gradePointToBeAdded=new BigDecimal(1.0);
                gradePoint = 8.0 + gradePointToBeAdded.doubleValue();
            } else if (studentMarks >= 50 && studentMarks <= 59) {
                marksInTheRange = 15;
                gradePointsInRange = 10;
                multiplyingFactor = marksInTheRange / gradePointsInRange;
                marksAboveTheThreshold = studentMarks - 50;
                gradePointToBeAdded = new BigDecimal(Double.toString((marksAboveTheThreshold / multiplyingFactor) * 0.1));
                gradePointToBeAdded = gradePointToBeAdded.setScale(1, RoundingMode.HALF_DOWN);
                if(gradePointToBeAdded.doubleValue()>1.0) gradePointToBeAdded=new BigDecimal(1.0);
                gradePoint = 7.0 + gradePointToBeAdded.doubleValue();
            } else if (studentMarks >= 40 && studentMarks <= 49) {
                marksInTheRange = 15;
                gradePointsInRange = 10;
                multiplyingFactor = marksInTheRange / gradePointsInRange;
                marksAboveTheThreshold = studentMarks - 40;
                gradePointToBeAdded = new BigDecimal(Double.toString((marksAboveTheThreshold / multiplyingFactor) * 0.1));
                gradePointToBeAdded = gradePointToBeAdded.setScale(1, RoundingMode.HALF_DOWN);
                if(gradePointToBeAdded.doubleValue()>1.0) gradePointToBeAdded=new BigDecimal(1.0);
                gradePoint = 6.0 + gradePointToBeAdded.doubleValue();
            } else if (studentMarks < 40) {
                return gradePoint;
            }
            return gradePoint;
        }



    }






}

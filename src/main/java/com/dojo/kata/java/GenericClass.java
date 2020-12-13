package com.dojo.kata.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GenericClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Enter Student Data");
            String studentData = sc.nextLine();
            System.out.println("Enter Query Data");
            String queryData = sc.nextLine();
            //System.out.println(StudentClass.getQuery(studentData,queryData));
        }
    }

    class StudentClass{

      public  String getQuery(String studentData,String query){
          String[] students = studentData.split(" ");
          String[] queryData = query.split(",");
          StringBuilder output = new StringBuilder();
          switch (queryData[0]) {
              case "1": {
                  StudentList<String> studentList = new StudentList<>();
                  for(int i=0;i<students.length;i++){
                      studentList.addElement(students[i]);
                  }
                  String[] filteredStudents=studentList.beginsWith(queryData[1]);
                  for (String filteredStudentName:
                       filteredStudents) {
                      output.append(filteredStudentName).append("\n");
                  }
                  break;
              }
              case "2": {
                  StudentList<String> studentList = new StudentList<>();
                  for(int i=0;i<students.length;i++){
                      studentList.addElement(students[i]);
                  }
                  String[] filteredStudents=studentList.bloodGroupOf(queryData[1].split(" "),queryData[2]);
                  for (String filteredStudentName:
                          filteredStudents) {
                      output.append(filteredStudentName).append("\n");
                  }
                  break;
              }
              case "3": {
                  StudentList<Double> studentList = new StudentList<>();
                  for(int i=0;i<students.length;i++){
                      studentList.addElement(Double.parseDouble(students[i]));
                  }
                  output.append((studentList.thresholdScore(parseInt(queryData[1]))+" students scored "+queryData[1]+" above"));
                  break;
              }
              case "4":
              case "5":{
                  ScoreList<Double> scoreList = new ScoreList<>();
                  for(int i=0;i<students.length;i++){
                      scoreList.addElement(Double.parseDouble(students[i]));
                  }
                  output.append(String.format("%.2f",scoreList.averageValues()));
                  break;
              }
              default:
                  break;

          }

          return output.toString();
      }
    }

      class StudentList <T>{
        public ArrayList<T> studentsList = new ArrayList<T>();

        public void addElement(T type){
            studentsList.add(type);
        }

        public void removeElement(T type){
            studentsList.remove(type);
        }

        public T getElement(int input){
            return studentsList.get(input);
        }

        public String[] beginsWith(String query){
            List<String> filteredStudents = new ArrayList<>();
            String[] output={};
            for (T data :studentsList) {
                if(((String)data).startsWith(query.toUpperCase()))
                    filteredStudents.add((String)data);
            }
            for (T data :studentsList) {
                if(((String)data).startsWith(query.toLowerCase()))
                    filteredStudents.add((String)data);
            }
            return filteredStudents.toArray(output);
        }

        public String[] bloodGroupOf(String[] bloodGroups ,String queryString){
            List<String> filteredStudents = new ArrayList<>();
            List<Integer> bloodGroupIndices = new ArrayList<>();
            String[] output={};

           for(int i=0;i<bloodGroups.length;i++){
               if(bloodGroups[i].equals(queryString))
                   bloodGroupIndices.add(i);
           }

            for (Integer bloodGroupIndex :
                    bloodGroupIndices) {
                filteredStudents.add((String)studentsList.get(bloodGroupIndex));

            }

            return filteredStudents.toArray(output);
        }

        public int thresholdScore(int score){
            int thresholdScoreCount=0;
            for (T data :
                    studentsList) {
                if(((Double)data)>=score)
                    ++thresholdScoreCount;

            }
            return thresholdScoreCount;
        }

    }

      class ScoreList <T extends Number>{
        public ArrayList<T> scoreList = new ArrayList<T>();

        public void addElement(T type){
           scoreList.add(type);
        }

        public void removeElement(T type){
           scoreList.remove(type);
        }

        public T getElement(int input){
            return scoreList.get(input);
        }

        public double averageValues(){
            double totalsum=0;
            for (T data:
                 scoreList) {
                totalsum+=(Double)data;
            }
            return (totalsum/scoreList.size());
        }
    }


}

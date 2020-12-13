package com.dojo.kata.java;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {


    class StudentClass{
      public String getQuery(String studentData,String Query){
       return null;
      }
    }

    class StudentList <T>{
        public List<T> studentsList = new ArrayList<T>();

        public void addElement(T type){

        }

        public void removeElement(T type){

        }

        public T getElement(int input){
            return null;
        }

        public String beginsWith(String query){
            return null;
        }

        public String bloodGroupOf(String[] students ,String queryString){
            return null;
        }

        public int thresholdScore(int score){
            return 0;
        }

    }

    class ScoreList <T extends Number>{
        public List<T> scoreList = new ArrayList<T>();

        public void addElement(T type){

        }

        public void removeElement(T type){

        }

        public T getElement(int input){
            return null;
        }

        public double averageValues(){
            return 0.0d;
        }
    }


}

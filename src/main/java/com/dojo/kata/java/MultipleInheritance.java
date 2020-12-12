package com.dojo.kata.java;

import java.util.Scanner;

public class MultipleInheritance {

     interface HockeyTeam{

         int calculateHockeyScore();
         int findHighestGoalByIndividualInHockey();
    }

     interface FootballTeam{

         int calculateFootballScore();
         int findHighestGoalByIndividualInFootball();
    }

    class Sport implements FootballTeam,HockeyTeam{

        int[] hockeyPlayers;
        int[] footballPlayers;

        public Sport(int[] paramHockeyPlayers,int[] paramFootballPlayers){
            hockeyPlayers = mapArrays(paramHockeyPlayers);
            footballPlayers = mapArrays(paramFootballPlayers);
        }

        int[] mapArrays(int[] inputArray){
            int[] responseArray = new int[11];
               for(int i=0;i<11;i++){
                   responseArray[i]=inputArray[i];
               }
            return responseArray;
        }

        public int calculateHockeyScore(){
            return calculateScore(hockeyPlayers);
        }

        public int calculateFootballScore(){
            return calculateScore(footballPlayers);
        }

        int calculateScore(int[] playerScores){
            int score=0;
            for (int i=0;i<playerScores.length;i++){
                score+=playerScores[i];
            }
            return score;
        }

        public int findHighestGoalByIndividualInFootball(){
            return highestGoalScore(footballPlayers);
        }

        public int findHighestGoalByIndividualInHockey(){
            return highestGoalScore(hockeyPlayers);
        }

        int highestGoalScore(int[] playerScores){
            int highestScore=0;
             for(int i=0;i<playerScores.length;i++){
                 int currentScore = playerScores[i];
                 if(currentScore>highestScore)
                     highestScore=currentScore;
             }
            return highestScore;
        }

    }



}

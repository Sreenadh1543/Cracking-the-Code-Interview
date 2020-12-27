package com.dojo.kata.java.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset{




   private List<Team> teams = new ArrayList<>();

    static class Team{

        public int teamName;

        public Set<String> teamPlayers;

        Team(int teamName,Set<String> teamPlayers){
            this.teamName=teamName;
            this.teamPlayers=teamPlayers;
        }
    }

    public  String getOut(int numberOfMatches, String squads, int squad1, int squad2)
    {
        StringBuilder output = new StringBuilder();

        createTeamsFromSquads(squads);

        String commonPlayers = createCommonPlayers(numberOfMatches);

        output.append(commonPlayers);

        String exclusivePlayers = createExclusivePlayersBetween(squad1,squad2);

        output.append(", ").append(exclusivePlayers);

        return output.toString();
    }

    private  String createCommonPlayers(int numberOfMatches) {
        StringBuilder commonPlayers = new StringBuilder();
        Set<String> commonPlayersSet=null;
        if(numberOfMatches>=2){

            for (int i=0;i<teams.size();i++) {
                if(i==0){
                     commonPlayersSet = new HashSet<>(teams.get(i).teamPlayers);
                }else{
                    Set<String> players = teams.get(i).teamPlayers;
                    commonPlayersSet.removeIf(value -> (!players.contains(value)));
                }

            }

        }

        commonPlayersSet.forEach(value -> commonPlayers.append(value).append(" "));


        return commonPlayers.toString().trim();
    }

    private  String createExclusivePlayersBetween(int squad1, int squad2) {

        Team firstTeam = teams.get(squad1-1);
        Team secondTeam = teams.get(squad2-1);

        Set<String> firstTeamPlayers = firstTeam.teamPlayers;
        Set<String> secondTeamPlayers = secondTeam.teamPlayers;

        Set<String> exclusivePlayersInSecondTeam=new HashSet<>();

        StringBuilder exclusivePlayersInSecondTeamAsString = new StringBuilder();

        secondTeamPlayers.forEach(value->{
            if(!firstTeamPlayers.contains(value)){
                exclusivePlayersInSecondTeam.add(value);
            }
        });

        exclusivePlayersInSecondTeam.forEach(value->{
            exclusivePlayersInSecondTeamAsString.append(value).append(" ");
        });

        return exclusivePlayersInSecondTeamAsString.toString().trim();
    }

    private  void createTeamsFromSquads(String squads){

        String[] players = splitTeamsByHash(squads);
       for(int i=0;i<players.length;i++){
           String[] teamPlayersArray = players[i].split(" ");
           Set<String> teamPlayersSet= new HashSet<>();
           for (String player:teamPlayersArray) {
               teamPlayersSet.add(player);
           }
           teams.add(new Team(i,teamPlayersSet));

       }

    }


    private static String[] splitTeamsByHash(String squads){
            return squads.split("#");
    }
}

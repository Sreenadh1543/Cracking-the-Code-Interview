package com.dojo.kata.java.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.Integer.parseInt;

public class TreemapHandson {

    public TreeMap<Integer,String> createPlayerPositionMap(String cricketDataset)
    {
        TreeMap<Integer,String>  playerPosition = new TreeMap<>();
        String[] temp = splitCricketScoresList(cricketDataset);

        for (String score :temp) {
            String[] splitScore = score.split("\\,");
            playerPosition.put(parseInt(splitScore[0]),splitScore[1]);
        }

        return playerPosition;

    }
    public TreeMap<String,Integer> createPlayerScoreMap(String cricketDataset)
    {
        TreeMap<String,Integer>  playerScoreMap = new TreeMap<>();
        String[] temp = splitCricketScoresList(cricketDataset);

        for (String score :temp) {
            String[] splitScore = score.split("\\,");
            playerScoreMap.put(splitScore[1], parseInt(splitScore[2]));
        }

        return playerScoreMap;
    }


    public TreeMap<String,Double> createMatchesMap(String cricketDataset)
    {
        TreeMap<String,Double>  matchesMap = new TreeMap<>();
        String[] temp = splitCricketScoresList(cricketDataset);

        for (String score :temp) {
            String[] splitScore = score.split("\\,");
            if(matchesMap.containsKey(splitScore[1])){
                Double value=matchesMap.get((splitScore[1]));
                value=value+(Double.valueOf(splitScore[2])/Double.valueOf(splitScore[0]));
                matchesMap.put(splitScore[1],value);
            }else{
                matchesMap.put(splitScore[1],(Double.valueOf(splitScore[2])/Double.valueOf(splitScore[0])));
            }
        }

        return matchesMap;
    }


    public String getQuery(String cricketDataset,String query)
    {
        String queryCode[];

        if(query.length()>1){
            queryCode= query.split("\\s");
        }else{
            queryCode = new String[1];
            queryCode[0]=query;
        }

        StringBuilder result = new StringBuilder();



        if("1".equalsIgnoreCase(queryCode[0])){
            int startPosition= parseInt(queryCode[1]);
            int endPosition = parseInt(queryCode[2]);
            TreeMap<Integer, String> playerPositionMap = createPlayerPositionMap(cricketDataset);

            playerPositionMap.forEach((key,value)->{
                if(key>=startPosition && key<=endPosition){
                    result.append(key).append(" ").append(value).append("\n");
                }
            });

        }else if("2".equalsIgnoreCase(queryCode[0])){
            int thresholdScore = parseInt(queryCode[1]);
            TreeMap<String, Integer> playerScoreMap = createPlayerScoreMap(cricketDataset);
            TreeMap<String, Integer> filteredPlayers = new TreeMap<>();
            TreeMap<Integer, String> playerPositionMap = createPlayerPositionMap(cricketDataset);
            TreeMap<Integer, String> playerAboveThreshold = new TreeMap<>();

            playerScoreMap.forEach((key,value)->{
                if(value>thresholdScore){
                    filteredPlayers.put(key,value);
                }
            });

            filteredPlayers.forEach((key,value)->{
                playerPositionMap.forEach((inner_key,inner_value)->{
                    if(key.equals(inner_value)){
                        playerAboveThreshold.put(inner_key,inner_value);
                    }
                });
            });

            playerAboveThreshold.forEach((key,value)->{
                result.append(key).append(" ").append(value).append("\n");
            });


        }else if("3".equalsIgnoreCase(queryCode[0])){
            TreeMap<String, Double> matchesMap = createMatchesMap(cricketDataset);
            TreeMap<Double,String> sortedMatchAveragedMap = new TreeMap<>();

            matchesMap.forEach((key,value)->{
                sortedMatchAveragedMap.put(value,key);
            });

            Map.Entry<Double, String> doubleStringEntry = sortedMatchAveragedMap.lastEntry();
            result.append("The Efficient Opener is").append(" ").append(doubleStringEntry.getValue());
        }

        return result.toString();
    }

    private String[] splitCricketScoresList(String cricketDataset){
        String[] cricketScores;
        List<String> cricketScoresSplit = new ArrayList<>();
        String[] temp = new String[1];

        if(cricketDataset.contains("\n")){
            cricketScores=cricketDataset.split("\\n");
            for (String cricketScore:cricketScores) {
                String scores[]=cricketScore.split("\\|");
                for (String score:scores) {
                    cricketScoresSplit.add(score);
                }
            }
        }else{
            cricketScores=cricketDataset.split("\\|");
            for (String cricketScore:cricketScores) {
                cricketScoresSplit.add(cricketScore);
            }
        }

        return cricketScoresSplit.toArray(temp);
    }







}
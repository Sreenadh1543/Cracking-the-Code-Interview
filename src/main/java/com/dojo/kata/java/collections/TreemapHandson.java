package com.dojo.kata.java.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TreemapHandson {

    public TreeMap<Integer,String> createPlayerPositionMap(String cricketDataset)
    {

        return null;

    }
    public TreeMap<String,Integer> createPlayerScoreMap(String cricketDataset)
    {

        return null;

    }
    public TreeMap<String,Double> createMatchesMap(String cricketDataset)
    {

        return null;
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

        String[] cricketScores;
        List<String> cricketScoresSplit = new ArrayList<>();

        if(cricketDataset.contains("\\n")){
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

        if("1".equalsIgnoreCase(queryCode[0])){
            String startPosition=queryCode[1];
            String endPosition = queryCode[2];


        }else if("2".equalsIgnoreCase(queryCode[0])){
            String thresholdScore = queryCode[1];

        }else if("3".equalsIgnoreCase(queryCode[0])){

        }

        return result.toString();
    }





}

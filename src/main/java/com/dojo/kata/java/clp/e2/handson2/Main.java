package com.dojo.kata.java.clp.e2.handson2;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static int levelCount(String word){
        Map<String,String> jsonTree = new HashMap<>();

        word= word.replaceAll("\\{","");

        word= word.replaceAll("}","");

        word = word.replaceAll("\"","");


        String[] jsonElements = word.split(",");

        for (String jsonElement:
                      jsonElements){

            String [] keyValueSplit = jsonElement.split(":");

            jsonTree.put(keyValueSplit[0],keyValueSplit[1]);

        }
        return jsonTree.size();
    }


    public static void main(String[] args)
    {
        System.out.println(levelCount(args[0]));
    }
}

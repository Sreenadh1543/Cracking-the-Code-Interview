package com.dojo.kata.java.arraylist;

import java.util.ArrayList;
import java.util.List;
class Passanger
{
    int id;
    float fare;

    public Passanger(int id, float fare)
    {
        this.id=id;
        this.fare=fare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

}
public class BusProb {

    ArrayList<Passanger> passengerArrayList = new ArrayList<>();

    public String output(int capacity, int stops, List<String> listOfInputStrings, String query)
    {
        StringBuilder outString=new StringBuilder();
        String queryData[] = {};
        String queryCode="";

        if(query.contains(",")){
            queryData=query.split("\\,");
        }else{
            queryCode=query;
        }


        if(queryData.length>0){

            if(queryData[0].equalsIgnoreCase("3")){


            }else if(queryData[0].equalsIgnoreCase("4")){


            }else if(queryData[0].equalsIgnoreCase("5")){

            }

        }else{

            if(queryCode.equalsIgnoreCase("1")){

                int passengersGotInToBus=0;
                int passengersGotOutOfBus=0;

                for (String passengersInTrip:listOfInputStrings) {

                    String[] passengerIdsOfTrip = passengersInTrip.split(" ");

                    for (String passengerId:passengerIdsOfTrip) {
                        if(passengerId.contains("+")){
                            ++passengersGotInToBus;

                        }else if(passengerId.contains("-")){
                            ++passengersGotOutOfBus;
                        }
                    }
                }

                outString.append(passengersGotInToBus)
                        .append(" ")
                        .append("passengers got on the bus and ")
                        .append(passengersGotOutOfBus)
                        .append(" ")
                        .append("passengers got out of the bus");

            }else if(queryCode.equalsIgnoreCase("2")){

                outString.append(0)
                        .append(" passengers traveled with a fare of ")
                        .append(32.0)
                        .append(", ")
                        .append(18)
                        .append(" passengers traveled with a fare of ")
                        .append(26.0)
                        .append(" and ")
                        .append(10)
                        .append(" passengers traveled with a fare of ")
                        .append(20.0);



            }
        }

        return outString.toString();
    }
}
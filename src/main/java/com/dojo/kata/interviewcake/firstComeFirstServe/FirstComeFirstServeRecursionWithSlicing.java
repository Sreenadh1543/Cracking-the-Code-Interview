package com.dojo.kata.interviewcake.firstComeFirstServe;

import java.util.Arrays;

public class FirstComeFirstServeRecursionWithSlicing {

    static int[] takeOutOrders = {17,8,24}; //{1,3,5};
    static int[] dineInOrders =  {12,19,2}; //{2,4,6};
    static int[] servedOrders = {17,8,12,2,19,24}; //{1,2,4,6,3,5};


    public static void main(String[] args){
        System.out.println(new StringBuffer().append("Is Order First Come First Served ").append(isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders)).toString());
    }

    private static boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders){
        if(servedOrders.length==0) return true;
        if(dineInOrders.length>0 && dineInOrders[0]==servedOrders[0])
            return isFirstComeFirstServed(takeOutOrders,removeFirstOrder(dineInOrders),removeFirstOrder(servedOrders));
        else if(takeOutOrders.length>0 && takeOutOrders[0]==servedOrders[0])
            return isFirstComeFirstServed(removeFirstOrder(takeOutOrders),dineInOrders,removeFirstOrder(servedOrders));
        else return false;
    }

    private static int[] removeFirstOrder(int[] inputArray) {
        return Arrays.copyOfRange(inputArray,1,inputArray.length);
    }


}

package com.dojo.kata.interviewcake.firstComeFirstServe;

public class FirstComeFirstServeIteration {

    static int[] takeOutOrders = {17, 8, 24}; //{1,3,5};
    static int[] dineInOrders = {12, 19, 2}; //{2,4,6};
    static int[] servedOrders = {17, 8, 12, 19, 24, 2}; //{1,2,4,6,3,5};


    public static void main(String[] args) {
        System.out.println("Is First Come First Served "+isFirstComeFirstServed(takeOutOrders,dineInOrders,servedOrders));
    }

    private static boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {
        int takeOutOrdersPointer = 0;
        int dineInOrdersPointer=0;

        for (int order :
                servedOrders) {

            if(takeOutOrdersPointer<takeOutOrders.length
                    && order == takeOutOrders[takeOutOrdersPointer])
                ++takeOutOrdersPointer;
            else if(dineInOrdersPointer<dineInOrders.length &&
                              order == dineInOrders[dineInOrdersPointer])
                ++dineInOrdersPointer;
            else
                return false;

        }

        return dineInOrdersPointer >= dineInOrders.length && takeOutOrdersPointer >= takeOutOrders.length;
    }
}

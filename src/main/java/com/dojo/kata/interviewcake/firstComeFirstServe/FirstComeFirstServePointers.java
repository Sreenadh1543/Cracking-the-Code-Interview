package com.dojo.kata.interviewcake.firstComeFirstServe;

public class FirstComeFirstServePointers {

    static int[] takeOutOrders = {17, 8, 24}; //{1,3,5};
    static int[] dineInOrders = {12, 19, 2}; //{2,4,6};
    static int[] servedOrders = {17, 8, 12, 2, 24, 19}; //{1,2,4,6,3,5};

    public static void main(String[] args) {
        System.out.println(" Are Served Orders First Come First Served " +
                isFirstComeFirstServed(takeOutOrders,
                                       dineInOrders,
                                       servedOrders,
                                        0,
                                        0,
                                        0));
    }

    private static boolean isFirstComeFirstServed(int[] takeOutOrders,
                                                  int[] dineInOrders,
                                                  int[] servedOrders,
                                                  int takeOutOrdersPointer,
                                                  int dineInOrdersPointer,
                                                  int servedOrdersPointer) {
        if (servedOrdersPointer == servedOrders.length) return true;

        if (takeOutOrdersPointer < takeOutOrders.length
                && servedOrders[servedOrdersPointer] == takeOutOrders[takeOutOrdersPointer])
            return isFirstComeFirstServed(takeOutOrders,
                    dineInOrders,
                    servedOrders,
                    ++takeOutOrdersPointer,
                    dineInOrdersPointer,
                    ++servedOrdersPointer);
        else if (dineInOrdersPointer < dineInOrders.length
                && servedOrders[servedOrdersPointer] == dineInOrders[dineInOrdersPointer])
            return isFirstComeFirstServed(takeOutOrders,
                    dineInOrders,
                    servedOrders,
                    takeOutOrdersPointer,
                    ++dineInOrdersPointer,
                    ++servedOrdersPointer);
        else return false;
    }
}

package com.dojo.kata.interviewcake.applestocks;

public class MaxProfitCalculatorIteration {

    private static int[] stockPrices = {10,7,5,8,11,9};

    public static void main(String[] args) {
        System.out.println("Best deal we can get is " + maxProfit(stockPrices));
    }

    /*
        Can we make it O(n)

        initialize minimum stock price with Zero
        initialize maximum stock price with Zero

        Start iteration of the stock prices

           initialize maximum and minimum stock prices with first element

           From Second element

              if Element is less than minimum stock price replace minimum stock price sequentially
              if Element is more than maximum stock price replace maximum stock price sequentially

              return max element - min element

*/
    private static int maxProfit(int[] stockPrices) {
        if(stockPrices.length<2)
            throw new RuntimeException("Stock Prices should not be less than length of two");

        int minStockPrice = stockPrices[0];
        int maxStockPrice = stockPrices[0];

        for (int stockPrice:
                     stockPrices) {
            if (stockPrice < minStockPrice)
                minStockPrice = stockPrice;

            if (stockPrice > maxStockPrice)
                maxStockPrice = stockPrice;

        }
        return Math.abs(maxStockPrice - minStockPrice);
    }

    /*
    Declare a maximum profit field as integer and initialize with zero

    Start outer Iteration from index 0 to array length-1

          Start an inner iteration from index 0 to array length -1

          Find the Minimum price and Maximum price among two share prices sequentially every time

          update value in maximum profit field if value is greater than existing maximum profit

    private static int maxProfit(int[] stockPrices) {
        int maxProfit = 0;

        for (int stockPrice : stockPrices) {

            for (int stockPricesForComparison : stockPrices) {

                int priceDifference = Math.max(stockPrice, stockPricesForComparison) - Math.min(stockPrice, stockPricesForComparison);

                if (priceDifference > maxProfit)
                    maxProfit = priceDifference;
            }
        }
        return maxProfit;
    }*/


    /*

   What is the problem ? O(n^2) can it be less ?

   We can reduce one unnecessary comparison with the same element every time

   Initialize the maximum profit integer with zero

   Start looping the stock prices from index zero to maximum length - 1

          Start looping the stock prices from the next element of the avove element


          Calculate profit every time and replace maxProfit value if its a best deal


     What improved ?

     5*5 = 25

     4+3+2+1 = 10 so sigma n-1  still an O(n^2)

      private static int maxProfit(int[] stockPrices) {
            int maxProfit = 0;
            for (int outerIndex = 0; outerIndex < stockPrices.length; outerIndex++) {
                for (int innerIndex = outerIndex + 1; innerIndex < stockPrices.length; innerIndex++) {
                    int possibleProfit = Math.abs(stockPrices[outerIndex] - stockPrices[innerIndex]);
                    if (possibleProfit > maxProfit)
                        maxProfit = possibleProfit;
                }
            }
            return maxProfit;
        }
     */

}

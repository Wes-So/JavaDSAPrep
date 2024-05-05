package com.dsa.topinterview150.arrays;

public class BuyStock {
    public static void main(String[] args) {
        int[] prices = {2,1,2,1,0,1,2};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int today = 0;
        int tomorrow = 1;
        int profit = 0;

        while(tomorrow < prices.length) {
            if(prices[tomorrow] < prices[today]){
                //no sale as there's no profit
                today = tomorrow;
                tomorrow++;
            } else {
                //compute profit
                profit = Math.max(profit, prices[tomorrow] - prices[today]);
                tomorrow++;
            }
        }

        return profit;
    }
}

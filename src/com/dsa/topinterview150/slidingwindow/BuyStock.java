package com.dsa.topinterview150.slidingwindow;

public class BuyStock {
    public static void main(String[] args) {
        int[] prices = {1,2,4,2,5,7,2,4,9,0,9};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max_profit = 0;

        while(r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = Math.abs(prices[l] - prices[r]);
                max_profit = Math.max(max_profit, profit);
                r++;
            } else {
                l = r;
                r++;
            }
        }

        return max_profit;
    }
}

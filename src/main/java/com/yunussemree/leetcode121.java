package com.yunussemree;

public class leetcode121 {

    public static void main(String[] args) {

    }

    public static int maxProfit(int[] prices){ // ! Score: Runtime: 2 ms (72.82%), Memory 61.40 MB (89.92%)
        int profit = 0;
        int buyPrice = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(buyPrice > prices[i]) buyPrice = prices[i];
            profit = Math.max(profit, prices[i]-buyPrice);
        }

        return profit;
    }

}

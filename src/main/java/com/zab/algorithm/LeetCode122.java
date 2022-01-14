package com.zab.algorithm;

public class LeetCode122 {

    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(prices[i] - prices[i - 1], 0) + dp[i - 1];
        }
        return dp[prices.length - 1];
    }

}

package com.zab.algorithm;

public class LeetCode121 {

    public int maxProfit(int[] prices) {
        int re = 0, minIn = prices[0] - 0;
        for (int j = 1; j < prices.length; j++) {
            re = Math.max(re, prices[j] - minIn);
            minIn = Math.min(prices[j], minIn);
        }
        return re;
    }

}

package com.zab.algorithm;

public class LeetCode45 {

    public int jump(int[] nums) {
        if (null == nums || 0 == nums.length || 1 == nums.length) {
            return 0;
        }
        int[] dp = new int[nums.length];//dp[i]表示到达第i阶需要的最小次数
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < nums.length ; i++) {
            int min = Integer.MAX_VALUE;// 记录最小次数
            // 找出j-i的最小次数
            for (int j = 0; j < i; j++) {
                // j到i有多少步阶梯
                int cj = i - j;
                // 判断j能否到i;
                if (nums[j] >= cj) {
                    // 能从j到i
                    min = Math.min(dp[j] + 1, min);
                    break;
                }
            }
            dp[i] = min;
        }
        return dp[nums.length - 1];
    }

}

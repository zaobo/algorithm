package com.zab.algorithm;

public class LeetCode213 {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0];
        }
        if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[len];
        dp[0] = 0;
        dp[1] = nums[0];
        // 最后一个屋不盗窃
        for (int i = 2; i <= len - 1; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }
        int[] dp2 = new int[len];
        dp2[0] = 0;
        dp2[1] = nums[1];
        // 第一个屋不盗窃
        for (int i = 2; i < len; i++) {
            dp2[i] = Math.max(dp2[i - 2] + nums[i], dp2[i - 1]);
        }
        return Math.max(dp[len-1], dp2[len-1]);
    }

}

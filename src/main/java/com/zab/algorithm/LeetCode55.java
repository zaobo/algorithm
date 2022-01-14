package com.zab.algorithm;

public class LeetCode55 {

    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return true;
        }

        //int[] dp = new int[len];
        //dp[0] = nums[0];
        int a = nums[0];
        for (int i = 1; i < len; i++) {
            //if (dp[i - 1] == 0) {
            //  return false;
            //}
            if (a == 0) return false;
            a = Math.max(a - 1, nums[i]);
            //dp[i] = Math.max(dp[i - 1] - 1, nums[i]);
        }
        return true;
    }

}

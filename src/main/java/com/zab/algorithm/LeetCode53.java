package com.zab.algorithm;

public class LeetCode53 {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int n : nums) {
            sum = Math.max(n, sum + n);
            max = Math.max(max, sum);
        }
        return max;
    }

}

package com.zab.algorithm;

public class LeetCode152 {

    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int[] maxDp = new int[nums.length];
        int[] minDp = new int[nums.length];
        maxDp[0] = nums[0];
        minDp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxDp[i] = Math.max(maxDp[i - 1] * nums[i], Math.max(nums[i], minDp[i - 1] * nums[i]));
            minDp[i] = Math.min(minDp[i - 1] * nums[i], Math.min(nums[i], maxDp[i - 1] * nums[i]));
        }
        int max = nums[0];
        for(int i = 1; i < maxDp.length; i++) {
            max = Math.max(max, maxDp[i]);
        }
        return max;
    }

}

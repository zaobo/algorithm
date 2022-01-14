package com.zab.algorithm;

public class LeetCode283 {

    public void moveZeroes(int[] nums) {
        int l = 0, r = 0;
        while (r < nums.length){
            if(nums[r] != 0){
                int tmp = nums[r];
                nums[r] = nums[l];
                nums[l] = tmp;
                l++;
            }
            r++;
        }
    }

}

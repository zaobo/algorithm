package com.zab.algorithm;

import java.util.Arrays;

public class LeetCode189 {

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] cp = Arrays.copyOf(nums, length);
        for (int i = 0; i <length; i++){
            nums[(k+i)%length] = cp[i];
        }
    }

}

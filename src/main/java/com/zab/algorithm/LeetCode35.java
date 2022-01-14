package com.zab.algorithm;

public class LeetCode35 {

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r){
            int mid = (r+l) / 2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid] > target){
                r = mid - 1;
            }
            if (nums[mid] < target){
                l = mid + 1;
            }
        }
        return l;
    }

}

package com.zab.algorithm;

public class LeetCode167 {

    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        int[] result = new int[2];
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                result[0] = l+1;
                result[1] = r+1;
                break;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return result;
    }

}

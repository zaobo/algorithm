package com.zab.algorithm;

import java.util.Random;

public class LeetCode215 {

    public int findKthLargest(int[] nums, int k) {
        selectK(nums, nums.length - k, new Random());
        return nums[nums.length - k];
    }

    private int selectK(int[] arr, int k, Random random) {
        int l = 0, r = arr.length;
        while (l <= r) {
            int p = partition(arr, l, r, random);
            if (p == k) {
                return arr[p];
            }
            if (p > k) {
                r = p;
            } else {
                l = p + 1;
            }
        }
        throw new RuntimeException("No Solution");
    }

    private int partition(int[] arr, int l, int r, Random random) {
        int p = random.nextInt(r - l) + l;
        swap(arr, l, p);
        int i = l + 1, j = r - 1;
        while (true) {
            while (j >= i && arr[j] > arr[l]) {
                j--;
            }
            while (i <= j && arr[i] <= arr[l]) {
                i++;
            }

            if (i > j) {
                break;
            }

            swap(arr, i, j);
            i++;
            j--;
        }
        swap(arr, l, j);
        return j;
    }

    private void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

}

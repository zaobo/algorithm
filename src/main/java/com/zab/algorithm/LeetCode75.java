package com.zab.algorithm;

public class LeetCode75 {

    public void sortColors(int[] nums) {
        int[] temp = new int[nums.length];
        sort(nums, 0, nums.length - 1, temp);
    }

    private void sort(int[] arr, int l, int r, int[] temp) {
        if (l >= r) {
            return;
        }

        int mid = l + (r - l) / 2;
        sort(arr, l, mid, temp);
        sort(arr, mid + 1, r, temp);

        if (arr[mid] > arr[mid + 1]) {
            merge(arr, l, mid, r, temp);
        }
    }

    private void merge(int[] arr, int l, int mid, int r, int[] temp) {
        System.arraycopy(arr, l, temp, l, r - l + 1);
        int k = l, i = l, j = mid + 1;
        while (k <= r) {
            if (i > mid) {
                arr[k] = temp[j++];
            } else if (j > r) {
                arr[k] = temp[i++];
            } else if (temp[i] < temp[j]) {
                arr[k] = temp[i++];
            } else {
                arr[k] = temp[j++];
            }
            k++;
        }
    }

}

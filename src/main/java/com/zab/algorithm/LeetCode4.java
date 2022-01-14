package com.zab.algorithm;

public class LeetCode4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = mergeTwoArrays(nums1, nums2);
        if (0 == arr.length % 2) {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }

    public int[] mergeTwoArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] data = new int[length];
        int index = 0;
        int i1 = 0, i2 = 0;
        while (index < length) {
            if (i1 == nums1.length) {
                data[index++] = nums2[i2++];
            } else if (i2 == nums2.length) {
                data[index++] = nums1[i1++];
            } else if (nums1[i1] <= nums2[i2]) {
                data[index++] = nums1[i1++];
            } else {
                data[index++] = nums2[i2++];
            }
        }
        return data;
    }

}

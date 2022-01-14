package com.zab.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums1) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for (Integer i : nums2) {
            if(set.contains(i)) {
                list.add(i);
                set.remove(i);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}

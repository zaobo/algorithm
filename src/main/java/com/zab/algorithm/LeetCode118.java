package com.zab.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {

    public List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < numRows; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        List<List<Integer>> re = new ArrayList<>();
        for (int[] arr : dp) {
            List<Integer> list = new ArrayList<>();
            for (int x : arr) {
                if(x != 0) {
                    list.add(x);
                }
            }
            re.add(list);
        }

        return re;
    }

}

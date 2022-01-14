package com.zab.algorithm;

public class LeetCode5 {

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[len][len];
        // 初始化长度为1的所有子串都为true
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        // 枚举子串长度
        for (int l = 2; l <= len; l++) {
            // 枚举左边界
            for (int i = 0; i < len; i++) {
                // 确定右边界
                int j = i + l -1;
                // 右边界越界，直接返回
                if (j >= len) {
                    break;
                }

                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                // 如果dp[i][j]为true，表示子串s[i,j]是回文，记录回文最大长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }

}

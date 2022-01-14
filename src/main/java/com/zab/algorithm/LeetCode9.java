package com.zab.algorithm;

public class LeetCode9 {

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}

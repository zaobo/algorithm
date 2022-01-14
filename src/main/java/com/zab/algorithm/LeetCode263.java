package com.zab.algorithm;

public class LeetCode263 {

    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 == 0) {
            if (n / 2 == 2 || n / 2 == 3 || n / 2 == 5) {
                return true;
            } else {
                return isUgly(n / 2);
            }
        }
        if (n % 3 == 0) {
            if (n / 3 == 2 || n / 3 == 3 || n / 3 == 5) {
                return true;
            } else {
                return isUgly(n / 3);
            }
        }
        if (n % 5 == 0) {
            if (n / 5 == 2 || n / 5 == 3 || n / 5 == 5) {
                return true;
            } else {
                return isUgly(n / 5);
            }
        }
        return false;
    }

}

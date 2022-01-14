package com.zab.algorithm;

public class LeetCode458 {

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int base = minutesToTest / minutesToDie + 1;
        return (int) Math.ceil(Math.log(buckets)/Math.log(base));
    }

}

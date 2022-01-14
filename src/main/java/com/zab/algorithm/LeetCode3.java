package com.zab.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode3 {

    public int lengthOfLongestSubstring(String s) {
        int re = 0;
        int i = 0;
        Queue<Character> list = new LinkedList<>();
        while (i < s.length()) {
            if(list.isEmpty()) {

            } else if (list.contains(s.charAt(i))) {
                re = Math.max(list.size(), re);
                while (list.poll() != s.charAt(i)){}
            }
            list.add(s.charAt(i++));
        }
        return Math.max(list.size(), re);
    }

}

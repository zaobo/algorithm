package com.zab.algorithm;

import java.util.ArrayList;
import java.util.List;

public class LeetCode784 {

    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            int n = list.size();
            if (Character.isLetter(c)) {
                if (n == 0) {
                    list.add(String.valueOf(Character.toLowerCase(c)));
                    list.add(String.valueOf(Character.toUpperCase(c)));
                } else {
                    List<String> temp = new ArrayList<>(list);
                    list.clear();
                    for (int i = 0; i < n; i++) {
                        String str = temp.get(i);
                        list.add(str + Character.toLowerCase(c));
                        list.add(str + Character.toUpperCase(c));
                    }
                }
            } else {
                if (n == 0) {
                    list.add(String.valueOf(c));
                } else {
                    List<String> temp = new ArrayList<>(list);
                    list.clear();
                    for (int i = 0; i < n; i++) {
                        list.add(temp.get(i) + c);
                    }
                }
            }
        }
        return list;
    }

}

package com.zab.algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode71 {

    public String simplifyPath(String path) {
        String[] names = path.split("/");
        Deque<String> stack = new LinkedList<>();
        for (String name : names) {
            if ("..".equals(name)) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            } else if (name.length() > 0 && !".".equals(name)) {
                stack.offerLast(name);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (stack.isEmpty()) {
            sb.append("/");
        } else {
            while (!stack.isEmpty()) {
                sb.append("/").append(stack.poll());
            }
        }
        return sb.toString();
    }

}

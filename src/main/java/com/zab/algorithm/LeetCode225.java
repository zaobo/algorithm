package com.zab.algorithm;

import java.util.LinkedList;
import java.util.List;

public class LeetCode225 {

    class MyStack {

        private List<Integer> list;

        /** Initialize your data structure here. */
        public MyStack() {
            list = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            list.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int size = list.size();
            int e = list.get(size-1);
            list.remove(size-1);
            return e;
        }

        /** Get the top element. */
        public int top() {
            int size = list.size();
            int e = list.get(size-1);
            return e;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return list.isEmpty();
        }
    }

}

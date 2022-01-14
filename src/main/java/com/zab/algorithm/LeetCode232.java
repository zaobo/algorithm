package com.zab.algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode232 {

    class MyQueue {

        private Deque<Integer> q;

        /** Initialize your data structure here. */
        public MyQueue() {
            q = new LinkedList<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            q.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return q.pollLast();
        }

        /** Get the front element. */
        public int peek() {
            return q.peekLast();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return q.isEmpty();
        }
    }

}

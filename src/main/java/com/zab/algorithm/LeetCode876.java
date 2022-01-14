package com.zab.algorithm;

public class LeetCode876 {

    public ListNode middleNode(ListNode head) {
        ListNode cur = head.next;
        int size = 1;
        while (cur != null) {
            size++;
            cur = cur.next;
        }

        int index = size/2;
        cur = head;
        for (int i = 1; i <= index; i++) {
            cur = cur.next;
        }
        return cur;
    }

}

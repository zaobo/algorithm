package com.zab.algorithm;

public class LeetCode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode cur = res;
        int n = 0;
        while (l1 != null || l2 != null) {
            int m = (null == l1 ? 0 : l1.val) + (null == l2 ? 0 : l2.val);
            cur.val = (m + n) % 10;
            n = (m + n) / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            if (l1 == null && l2 == null) {
                break;
            }

            cur.next = new ListNode();
            cur = cur.next;
        }
        if (n != 0) {
            cur.next = new ListNode(n);
        }
        return res;
    }

}

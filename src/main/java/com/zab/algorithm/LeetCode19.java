package com.zab.algorithm;

public class LeetCode19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(0);
        ListNode re = prev;
        prev.next = head;
        while (prev != null) {
            ListNode nNode = prev.next;
            for (int i = 0; i < n; i++) {
                nNode = nNode.next;
            }

            // 说明prev是倒数第n个节点
            if(nNode == null) {
                break;
            }
            prev = prev.next;
        }
        ListNode delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        head = re.next;
        return head;
    }

}

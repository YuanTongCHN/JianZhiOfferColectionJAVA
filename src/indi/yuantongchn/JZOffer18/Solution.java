package indi.yuantongchn.JZOffer18;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        ListNode pre = new ListNode(0);
        ListNode first = pre;
        pre.next = cur;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) {
            pre.next = cur.next;
        }
        return first.next;
    }
}

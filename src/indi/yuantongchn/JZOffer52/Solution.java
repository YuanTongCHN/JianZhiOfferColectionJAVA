package indi.yuantongchn.JZOffer52;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = 0;
        int lenB = 0;
        ListNode cur = headA;
        while (cur != null) {
            lenA++;
            cur = cur.next;
        }
        cur = headB;
        while (cur != null) {
            lenB++;
            cur = cur.next;
        }
        ListNode curA = headA;
        ListNode curB = headB;
        int gap = lenA - lenB;
        if (gap > 0) {
            for (int i = 0; i < gap; i++) {
                curA = curA.next;
            }
        } else if (gap < 0) {
            gap = -gap;
            for (int i = 0; i < gap; i++) {
                curB = curB.next;
            }
        }
        while (curA != curB) {
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }
}
















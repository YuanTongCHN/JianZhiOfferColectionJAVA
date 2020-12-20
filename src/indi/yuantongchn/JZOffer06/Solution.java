package indi.yuantongchn.JZOffer06;


import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class Solution {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> resList = new LinkedList<>();
        ListNode curNode = head;
        while(curNode != null) {
            resList.addFirst(curNode.val);
            curNode = curNode.next;
        }
        int[] res = new int[resList.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = resList.removeFirst();
        }
        return res;
    }
}

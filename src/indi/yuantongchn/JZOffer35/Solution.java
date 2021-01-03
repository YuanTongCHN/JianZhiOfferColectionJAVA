package indi.yuantongchn.JZOffer35;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Solution {
    public Node copyRandomList(Node head) {
        Node cur = head;
        Node pre = new Node(0);
        Node first = pre;
        HashMap<Node, Node> map = new HashMap<>();
        while (cur != null) {
            Node node = new Node(cur.val);
            pre.next = node;
            map.put(cur, node);
            pre = node;
            cur = cur.next;
        }
        cur = head;
        pre = first.next;
        while (cur != null) {
            pre.random = map.get(cur.random);
            cur = cur.next;
            pre = pre.next;
        }
        return first.next;
    }
}

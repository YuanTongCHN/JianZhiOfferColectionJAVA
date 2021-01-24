package indi.yuantongchn.JZOffer59b;

import java.util.LinkedList;

public class MaxQueue {

    private LinkedList<Integer> maxStack;
    private LinkedList<Integer> nums;

    public MaxQueue() {
        maxStack = new LinkedList<>();
        nums = new LinkedList<>();
    }

    public int max_value() {
        if (maxStack.size() != 0) {
            return maxStack.peekFirst();
        } else {
            return -1;
        }
    }

    public void push_back(int value) {
        nums.addLast(value);
        while (maxStack.size() != 0 && value > maxStack.peekLast()) {
            maxStack.removeLast();
        }
        maxStack.addLast(value);
    }

    public int pop_front() {
        if (nums.size() == 0) {
            return -1;
        }
        int temp = nums.removeFirst();
        if (temp == maxStack.peekFirst()) {
            maxStack.removeFirst();
        }
        return temp;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
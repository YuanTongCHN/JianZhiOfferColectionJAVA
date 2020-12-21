package indi.yuantongchn.JZOffer09;

import java.util.LinkedList;

public class CQueue {
    LinkedList<Integer> addStack;
    LinkedList<Integer> removeStack;

    public CQueue() {
        addStack = new LinkedList<>();
        removeStack = new LinkedList<>();
    }

    public void appendTail(int value) {
        addStack.addLast(value);
    }

    public int deleteHead() {
        if (removeStack.isEmpty() && addStack.isEmpty()) {
            return -1;
        }
        if (!removeStack.isEmpty()) {
            return removeStack.removeLast();
        } else {
            while (!addStack.isEmpty()) {
                removeStack.addLast(addStack.removeLast());
            }
            return removeStack.removeLast();
        }
    }
}

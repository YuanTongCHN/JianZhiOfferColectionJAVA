package indi.yuantongchn.JZOffer41;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
    Queue<Integer> largeQueue;
    Queue<Integer> smallQueue;
    /** initialize your data structure here. */
    public MedianFinder() {
        largeQueue = new PriorityQueue<>();//保存较大的一半，正序
        smallQueue = new PriorityQueue<>((x, y) -> (y - x));//保存较小的一半，逆序
    }

    public void addNum(int num) {
        if (largeQueue.size() == smallQueue.size()) {
            smallQueue.add(num);
            largeQueue.add(smallQueue.poll());
        } else {
            largeQueue.add(num);
            smallQueue.add(largeQueue.poll());
        }
    }

    public double findMedian() {
        if (largeQueue.size() == smallQueue.size()) {
            return ((double)largeQueue.peek() + (double)smallQueue.peek()) / 2;
        } else {
            return (double)largeQueue.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

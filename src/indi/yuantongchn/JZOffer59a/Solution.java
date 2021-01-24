package indi.yuantongchn.JZOffer59a;

import java.util.LinkedList;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        if (length < k || length <= 0 || k <= 0) {
            return new int[0];
        }
        int[] ans = new int[length - k + 1];
        int i = 0;
        LinkedList<Integer> maxStack = new LinkedList<>();
        int indexRight = -1;
        int indexLeft = indexRight - k + 1;
        while (indexRight < k - 1) {
            indexRight++;
            indexLeft++;
            while (maxStack.size() != 0 && nums[indexRight] > maxStack.peekLast()) {
                maxStack.removeLast();
            }
            maxStack.addLast(nums[indexRight]);

        }
        while (indexRight < length - 1) {
            ans[i] = maxStack.peekFirst();
            i++;
            if (nums[indexLeft] == maxStack.peekFirst()) {
                maxStack.removeFirst();
            }
            indexLeft++;
            indexRight++;
            while (maxStack.size() != 0 && nums[indexRight] > maxStack.peekLast()) {
                maxStack.removeLast();
            }
            maxStack.addLast(nums[indexRight]);
        }
        ans[i] = maxStack.peekFirst();
        return ans;
    }
}
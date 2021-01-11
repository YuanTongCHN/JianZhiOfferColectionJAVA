package indi.yuantongchn.JZOffer53;

public class Solution {
    public int search(int[] nums, int target) {
        return findIndex(nums, target) - findIndex(nums, target - 1);
    }
    private int findIndex(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = (l + r) >> 1;
            if (nums[m] <= target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l - 1;
    }
}
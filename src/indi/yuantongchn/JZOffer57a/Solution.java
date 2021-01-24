package indi.yuantongchn.JZOffer57a;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[0];
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[0];
    }
}

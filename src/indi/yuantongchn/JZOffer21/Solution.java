package indi.yuantongchn.JZOffer21;

public class Solution {
    public int[] exchange(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && (nums[left] & 1) == 1) {
                left++;
            }
            while (left < right && (nums[right] & 1) == 0) {
                right--;
            }
            if (left < right) {
                Swap(nums, left, right);
            }
        }
        return nums;
    }
    private void Swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

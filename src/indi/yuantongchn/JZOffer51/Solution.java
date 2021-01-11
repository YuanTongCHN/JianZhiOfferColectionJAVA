package indi.yuantongchn.JZOffer51;

public class Solution {
    private int res = 0;
    public int reversePairs(int[] nums) {
        if (nums.length < 2) {
            return res;
        }
        int left = 0;
        int right = nums.length - 1;
        int[] tempNums = new int[right - left + 1];
        int mid = (left + right) >> 1;
        separate(nums, left, mid, tempNums);
        separate(nums, mid + 1, right, tempNums);
        merge(nums, left, right, tempNums);
        return res;
    }
    private void separate(int[] nums, int left, int right, int[] tempNums) {
        if (left == right) {
            return;
        }
        int mid = (left + right) >> 1;
        separate(nums, left, mid, tempNums);
        separate(nums, mid + 1, right, tempNums);
        merge(nums, left, right, tempNums);
    }
    private void merge(int[] nums, int left, int right, int[] tempNums) {
        int mid = (left + right) >> 1;
        for (int i = left; i <= right; i++) {
            tempNums[i] = nums[i];
        }
        int i = left;
        int j = mid + 1;
        int index = left;
        while (i <= mid && j <= right) {
            if (tempNums[i] > tempNums[j]) {
                nums[index] = tempNums[j];
                res += mid - i + 1;
                j++;
            } else {
                nums[index] = tempNums[i];
                i++;
            }
            index++;
        }
        while (i <= mid) {
            nums[index] = tempNums[i];
            i++;
            index++;
        }
        while (j <= right) {
            nums[index] = tempNums[j];
            j++;
            index++;
        }
    }
}



































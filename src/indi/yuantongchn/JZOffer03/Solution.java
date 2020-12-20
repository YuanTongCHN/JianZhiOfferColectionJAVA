package indi.yuantongchn.JZOffer03;

import java.util.HashSet;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        //原地置换，索引与数字一一对应
        for (int i = 0; i < nums.length; i++) {
            while(nums[nums[i]] != nums[i]){
                swap(nums, i, nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return nums[i];
            }
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


/*import java.util.HashSet;

class Solution {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        return -1;
    }
}*/

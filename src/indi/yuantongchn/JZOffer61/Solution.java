package indi.yuantongchn.JZOffer61;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeatSet = new HashSet<>();
        int max = 0;
        int min = 14; //初始值很关键
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            if (repeatSet.contains(nums[i])) {
                return false;
            } else {
                repeatSet.add(nums[i]);
            }
        }
        return max - min < 5;
    }
}
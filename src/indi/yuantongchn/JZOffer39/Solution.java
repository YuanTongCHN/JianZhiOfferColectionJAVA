package indi.yuantongchn.JZOffer39;

public class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int sign = 1;
        for (int i = 1; i < nums.length; i++) {
            if (sign == 0) {
                res = nums[i];
                sign = 1;
                continue;
            }
            if (res == nums[i]) {
                sign++;
            } else {
                sign--;
            }
        }
        return res;
    }
}

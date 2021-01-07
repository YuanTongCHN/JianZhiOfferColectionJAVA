package indi.yuantongchn.JZOffer42;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int ans = nums[0];
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            if (cur > ans) {
                ans = cur;
            }
            if (cur < 0) {
                cur = 0;
            }
        }
        return ans;
    }
}

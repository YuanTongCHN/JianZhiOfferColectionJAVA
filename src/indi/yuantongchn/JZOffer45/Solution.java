package indi.yuantongchn.JZOffer45;

import java.util.Arrays;

public class Solution {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> {
            return (x + y).compareTo(y + x);
        });
        StringBuffer ans = new StringBuffer();
        for (String str : strs) {
            ans.append(str);
        }
        return ans.toString();
    }
}

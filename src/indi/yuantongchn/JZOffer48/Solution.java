package indi.yuantongchn.JZOffer48;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> keys = new HashSet<>();
        int left = 0;
        int right = 0;
        int ans = 0;
        for (; right < s.length(); right++) {
            char key = s.charAt(right);
            while (keys.contains(key)) {
                keys.remove(s.charAt(left));
                left++;
            }
            keys.add(key);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}

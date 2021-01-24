package indi.yuantongchn.JZOffer57b;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> ans = new ArrayList<>();
        int fast = 2;
        int slow = 1;
        int sum = 3;
        while (slow <= (target >> 1)) {
            if (sum == target) {
                int[] temp = new int[fast - slow + 1];
                for (int j = 0; j < temp.length; j++) {
                    temp[j] = slow + j;
                }
                ans.add(temp);
                fast++;
                sum += fast;
            } else if (sum > target) {
                sum -= slow;
                slow++;
            } else {
                fast++;
                sum += fast;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}



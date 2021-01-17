package indi.yuantongchn.JZOffer56b;

public class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int[] bitSums = new int[32];
        int bitNum = 1;
        for (int i = 31; i >= 0; i--) {
            for (int num : nums) {
                if ((bitNum & num) != 0) {
                    bitSums[i]++;
                }
            }
            bitNum = bitNum << 1;
        }

        int res = 0;
        for (int bitSum : bitSums) {
            System.out.println(bitSum);
            res = res << 1;
            res += bitSum % 3;
        }
        return res;
    }
}



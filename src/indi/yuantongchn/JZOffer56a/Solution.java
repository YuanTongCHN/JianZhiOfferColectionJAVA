package indi.yuantongchn.JZOffer56a;

public class Solution {
    public int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret = ret ^ num;
        }
        int digit = 1;
        while ((ret & digit) == 0) {
            digit = digit << 1;
        }
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & digit) == 0) {
                a = a ^ num;
            } else {
                b = b ^ num;
            }
        }
        return new int[]{a, b};
    }
}

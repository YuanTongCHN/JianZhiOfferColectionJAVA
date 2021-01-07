package indi.yuantongchn.JZOffer44;

public class Solution {
    public int findNthDigit(int n) {
        if (n == 0) {
            return 0;
        }
        long startNumber = 1;
        long count = 9;
        int digit = 1;
        while (n > count) {
            n -= count;
            startNumber *= 10;
            digit++;
            count = startNumber * digit * 9;
        }
        long targetNumber = startNumber + (n - 1) / digit;
        String str = Long.toString(targetNumber);
        int ans = str.charAt((n - 1) % digit) - '0';
        return ans;
    }
}

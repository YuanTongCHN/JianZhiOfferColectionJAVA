package indi.yuantongchn.JZOffer43;

public class Solution {
    public int countDigitOne(int n) {
        int digit = 1;
        int high = n / 10;
        int cur = n % 10;
        int low = 0;
        int ans = 0;
        while (high != 0 || cur != 0) {
            if (cur == 0) {
                ans += high * digit;
            } else if (cur == 1) {
                ans += high * digit + low + 1;
            } else {
                ans += (high + 1) * digit;
            }
            low += cur * digit;
            digit *= 10;
            cur = high % 10;
            high /= 10;
        }
        return ans;
    }
}

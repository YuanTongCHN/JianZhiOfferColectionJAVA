package indi.yuantongchn.JZOffer14a;

public class Solution {
    public int cuttingRope(int n) {
        //m、n都是整数，n > 1并且m > 1
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3;
        int b = n % 3;
        if (b == 0) {
            return (int)Math.pow(3, a);
        } else if (b == 1) {
            return (int)Math.pow(3, a - 1) * 4;
        } else {
            return (int)Math.pow(3, a) * 2;
        }
    }
}

//14b的解法为一截一截的截取

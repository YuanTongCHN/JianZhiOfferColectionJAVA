package indi.yuantongchn.JZOffer14a;

/*public class Solution {
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
}*/

public class Solution {
    public int cuttingRope(int n) {
        //m、n都是整数，n > 1并且m > 1
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int[] k = new int[n + 1];
        k[0] = 0;
        k[1] = 1;
        k[2] = 2;
        k[3] = 3;
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                k[i] = Math.max(k[i], k[j] * k[i - j]);
            }
        }
        return k[n];
    }
}

//14b的解法为一截一截的截取

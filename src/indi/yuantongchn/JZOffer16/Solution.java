package indi.yuantongchn.JZOffer16;

public class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        long b = n;
        double res = 1.0;//注意取值
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) ==1) {//将奇数项乘入结果
                res *= x;//注意取值
            }
            b = b >> 1;
            x *= x;//注意取值
        }
        return res;
    }
}

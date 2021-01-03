package indi.yuantongchn.JZOffer15;

/*public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                res++;
            }
            n = n >> 1;
        }
        return res;
    }
}*/

public class Solution {
    // you need to treat n as an unsigned value
    /*
     每一次n & (n - 1) 都会使得n最右边的一个1变成0
    */
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
package indi.yuantongchn.JZOffer10a;

/*
public class Solution {
    public int fib(int n) {
        if(n < 2){
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n - 1];
    }
}
*/


public class Solution {
    //优化空间的动态规划
    public int fib(int n) {
        if(n < 2){
            return n;
        }
        int a = 0;//第0个数
        int b = 1;//第1个数
        int sum = 0;
        for (int i = 2; i <= n; i++) { //索引为n的值表示第n个数
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}
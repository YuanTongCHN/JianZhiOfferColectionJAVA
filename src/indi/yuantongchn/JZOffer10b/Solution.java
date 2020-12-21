package indi.yuantongchn.JZOffer10b;

public class Solution {
    public int numWays(int n) {
        //f(n) = f(n - 1) + f(n - 2)
        //跳上第n个台阶的跳法，等于第n-1个台阶的跳法加上第n-2个台阶的跳法
        if(n == 0){
            return 1;
        }
        //第一个台阶有一种跳法
        if (n == 1){
            return 1;
        }
        //第二个台阶有两种跳法
        if (n == 2){
            return 2;
        }
        int a = 1;//第1个台阶
        int b = 2;//第2个台阶
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}

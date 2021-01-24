package indi.yuantongchn.JZOffer60;

public class Solution {
    public double[] dicesProbability(int n) {
        if (n < 1) {
            return new double[0];
        }
        int[][] dp = new int[n + 1][n * 6 + 1];
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= i * 6; j++) { //i*6很关键
                for (int num = 1; num <= 6; num++) {
                    if (j - num <= 0) {
                        break;
                    }
                    dp[i][j] += dp[i - 1][j - num];
                }
            }
        }
        double count = Math.pow(6, n);
        double[] ans = new double[5 * n + 1];
        for (int i = n; i <= 6 * n; i++) {
            ans[i - n] = ((double)dp[n][i]) / count;
        }
        return ans;
    }
}

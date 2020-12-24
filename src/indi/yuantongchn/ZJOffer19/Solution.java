package indi.yuantongchn.ZJOffer19;

public class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length() + 1;
        int n = p.length() + 1;
        boolean[][] dp = new boolean[m][n];
        //dp[i][j] 对应的添加字符是 s[i - 1] 和 p[j - 1]
        dp[0][0] = true;
        for (int j = 2; j < n; j++) {
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';//注意索引值的细节
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] || dp[i][j - 1] || (dp[i - 1][j] && s.charAt(i - 1) == p.charAt(j - 2)) || (dp[i - 1][j] && p.charAt(j - 2) == '.');
                }else {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.');
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}

package indi.yuantongchn.JZOffer13;

public class Solution {
    public int movingCount(int m, int n, int k) {
        if (m == 0 || n == 0) {
            return 0;
        }
        boolean[][] visited = new boolean[m][n];
        return dfs(m, n, k, 0, 0, visited);
    }

    private int dfs(int m, int n, int k, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j]) {
            return 0;
        }
        if (sum(i, j) > k) {
            return 0;
        }
        visited[i][j] = true;
        int result = 1 + dfs(m, n, k, i + 1, j, visited) + dfs(m, n, k, i - 1, j, visited) + dfs(m, n, k, i, j + 1, visited) + dfs(m, n, k, i, j - 1, visited);
        return result;
    }

    private int sum(int i, int j) {
        int res = 0;
        while (i != 0) {
            res += i % 10;
            i = i / 10;
        }
        while (j != 0) {
            res += j % 10;
            j = j / 10;
        }
        return res;
    }
}

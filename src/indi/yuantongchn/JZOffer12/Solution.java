package indi.yuantongchn.JZOffer12;

public class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        if (rows == 0) {
            return false;
        }
        int cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolean result = dfs(0, i, j, board, word, rows, cols);
                if (result) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int index, int i, int j, char[][] board, String word, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return false;
        }
        char target = word.charAt(index);
        if (board[i][j] != target) {
            return false;
        }
        if(index == word.length() - 1) {
            return true;
        }
        board[i][j] = '\0';//表示空字符
        boolean result = dfs(index + 1, i + 1, j, board, word, rows, cols) || dfs(index + 1, i - 1, j, board, word, rows, cols) || dfs(index + 1, i, j + 1, board, word, rows, cols) || dfs(index + 1, i, j - 1, board, word, rows, cols);
        board[i][j] = target;
        return result;
    }
}

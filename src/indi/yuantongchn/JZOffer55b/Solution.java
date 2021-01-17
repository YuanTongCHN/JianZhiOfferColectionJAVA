package indi.yuantongchn.JZOffer55b;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int res = dfs(root);
        if (res == -1) {
            return false;
        } else {
            return true;
        }
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        if (left == -1) {
            return -1;
        }
        int right = dfs(root.right);
        if (right == -1) {
            return -1;
        }
        if (left - right == 1) {
            return left + 1;
        } else if (right - left == 1) {
            return right + 1;
        } else if (right == left) {
            return left + 1;
        } else {
            return -1;
        }
    }
}


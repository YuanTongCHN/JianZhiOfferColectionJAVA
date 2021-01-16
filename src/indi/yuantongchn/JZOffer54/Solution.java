package indi.yuantongchn.JZOffer54;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    private int ans = 0;
    private int step = 1;
    public int kthLargest(TreeNode root, int k) {
        dfs(root, k);
        return ans;
    }
    private void dfs(TreeNode node, int k) {
        if (node == null) {
            return ;
        }
        dfs(node.right, k);
        if (step > k) {
            return;
        }
        if (step == k) {
            ans = node.val;
        }
        step++;
        dfs(node.left, k);
    }
}
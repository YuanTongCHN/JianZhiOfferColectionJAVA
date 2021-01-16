package indi.yuantongchn.JZOffer54;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    private int ans = 0;
    private int k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return ans;
    }
    private void dfs(TreeNode node) {
        if (node == null) {
            return ;
        }
        dfs(node.right);
        if (k == 0) {
            return;
        }
        if (--k == 0) {
            ans = node.val;
        }
        dfs(node.left);
    }

}
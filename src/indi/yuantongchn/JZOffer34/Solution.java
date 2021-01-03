package indi.yuantongchn.JZOffer34;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        dfs(root, sum, 0, curList, res);
        return res;
    }
    private void dfs(TreeNode root, int sum, int count, List<Integer> curList, List<List<Integer>> res) {
        if (root == null){
            return;
        }
        count += root.val;
        curList.add(root.val);
        if (root.left == null && root.right == null && count == sum) {
            List<Integer> temp = new ArrayList<Integer>(curList);
            res.add(temp);
        }
        dfs(root.left, sum, count, curList, res);
        dfs(root.right, sum, count, curList, res);
        curList.remove(curList.size() - 1);
        count -= root.val;
    }
}

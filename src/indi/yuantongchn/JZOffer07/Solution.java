package indi.yuantongchn.JZOffer07;

import java.util.Arrays;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    //可以用hashmap储存下标来优化，以下答案没有优化
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        if(len == 0){
            return null;
        }
        int value = preorder[0];
        TreeNode root = new TreeNode(value);
        int index = 0;
        for (; index < len; index++) {
            if (inorder[index] == value) {
                break;
            }
        }
        int[] leftPre = Arrays.copyOfRange(preorder, 1, 1 + index);
        int[] leftIn = Arrays.copyOfRange(inorder, 0, index);
        int[] righrPre = Arrays.copyOfRange(preorder, 1 + index, len);
        int[] rightIn = Arrays.copyOfRange(inorder, 1 + index, len);
        root.left = buildTree(leftPre, leftIn);
        root.right = buildTree(righrPre, rightIn);
        return root;
    }
}

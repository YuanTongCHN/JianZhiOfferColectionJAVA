package indi.yuantongchn.JZOffer37;

import java.util.Arrays;
import java.util.LinkedList;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer ans = new StringBuffer("[");
        dfsOfSerialize(root, ans);
        ans.deleteCharAt(ans.length() - 1).append("]");
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        data = data.substring(1, data.length() - 1);
        String[] values = data.split(",");
        LinkedList<String> vals = new LinkedList<>(Arrays.asList(values));
        TreeNode root = dfsOfDeseriralize(vals);
        return root;
    }

    // dfsOfSerialize()
    private void dfsOfSerialize(TreeNode node, StringBuffer ans) {
        if (node == null) {
            ans.append("null,");
            return;
        }
        ans.append(node.val).append(",");
        dfsOfSerialize(node.left, ans);
        dfsOfSerialize(node.right, ans);
    }

    //dfsOfDeseriralize()
    private TreeNode dfsOfDeseriralize(LinkedList<String> vals) {
        String val = vals.removeFirst();
        if (val.equals("null")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = dfsOfDeseriralize(vals);
        node.right = dfsOfDeseriralize(vals);
        return node;
    }

}

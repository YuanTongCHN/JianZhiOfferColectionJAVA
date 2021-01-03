package indi.yuantongchn.JZOffer33;

import java.util.Arrays;

public class Solution {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length < 2) {
            return true;
        }
        int rootVal = postorder[postorder.length - 1];
        int m = 0;
        while (m < postorder.length) {
            if (postorder[m] > rootVal) {
                break;
            }
            m++;
        }
        for (int i = m; i < postorder.length - 1; i++) {
            if (postorder[i] < rootVal) {
                return false;
            }
        }
        int[] left = Arrays.copyOfRange(postorder, 0, m);
        int[] right = Arrays.copyOfRange(postorder, m, postorder.length - 1);
        return verifyPostorder(left) && verifyPostorder(right);
    }
}

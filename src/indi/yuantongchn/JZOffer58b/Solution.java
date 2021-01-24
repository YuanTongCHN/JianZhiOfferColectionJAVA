package indi.yuantongchn.JZOffer58b;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        int length = s.length();
        if (length == 0 || length < n) {
            return s;
        }
        char[] charList = s.toCharArray();
        StringBuffer ans = new StringBuffer();
        for (int i = n; i < charList.length; i++) {
            ans.append(charList[i]);
        }
        for (int i = 0; i < n; i++) {
            ans.append(charList[i]);
        }
        return ans.toString();
    }
}

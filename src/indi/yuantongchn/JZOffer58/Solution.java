package indi.yuantongchn.JZOffer58;

public class Solution {
    public String reverseWords(String s) {
        if (s.length() == 0) {
            return s;
        }
        StringBuffer ans = new StringBuffer();
        char[] charList = s.toCharArray();
        int left = charList.length - 1;
        while (left >= 0 && charList[left] == ' ') {
            left--;
        }
        int right = left;
        while (right >= 0) {
            while (left >= 0 && charList[left] != ' ') {
                left--;
            }
            for (int i = left + 1; i <= right; i++) {
                ans.append(charList[i]);
            }
            ans.append(' ');
            while (left >= 0 && charList[left] == ' ') {
                left--;
            }
            right = left;
        }
        if (ans.length() != 0) {
            ans.deleteCharAt(ans.length() - 1);
        }
        return ans.toString();
    }
}
package indi.yuantongchn.JZOffer46;

public class Solution {
    public int translateNum(int num) {
        if (num < 10) {
            return 1;
        }
        String str = String.valueOf(num);
        int[] counts = new int[str.length() + 1];
        counts[0] = 1;
        counts[1] = 1;
        for (int i = 1; i < str.length(); i++) {
            String tempStr = str.substring(i - 1, i + 1);
            if (tempStr.compareTo("26") < 0 && tempStr.compareTo("10") >= 0) {
                counts[i + 1] = counts[i] + counts[i - 1];
            } else {
                counts[i + 1] = counts[i];
            }
        }
        return counts[counts.length - 1];
    }
}

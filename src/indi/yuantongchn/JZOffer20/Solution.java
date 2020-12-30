package indi.yuantongchn.JZOffer20;

public class Solution {
    private int index = 0;
    public boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        boolean res = signScanInteger(s);
        if (index < s.length() && s.charAt(index) == '.') {
            index++;
            boolean haveDcimel = usignScanInteger(s);
            res = res || haveDcimel;
        }
        if (index < s.length() && (s.charAt(index) == 'e' || s.charAt(index) == 'E')) {
            index++;
            res = res && signScanInteger(s);
        }
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        return res && index == s.length();
    }
    private boolean signScanInteger(String s) {
        if (index == s.length()) {
            return false;
        }
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            index++;
        }
        return usignScanInteger(s);
    }
    private boolean usignScanInteger(String s) {
        int temp = index;
        while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            index++;
        }
        return index > temp;
    }
}

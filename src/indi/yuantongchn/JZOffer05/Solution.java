package indi.yuantongchn.JZOffer05;

public class Solution {
    public String replaceSpace(String s) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                res.append("%20");
            }else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}

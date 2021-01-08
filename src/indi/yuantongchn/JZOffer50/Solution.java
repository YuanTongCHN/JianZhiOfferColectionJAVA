package indi.yuantongchn.JZOffer50;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> dic = new HashMap<>();
        char[] charArrays = s.toCharArray();
        for(char c : charArrays) {
            dic.put(c, !dic.containsKey(c));
        }
        for(char c : charArrays) {
            if (dic.get(c)) {
                return c;
            }
        }
        return ' ';
    }
}

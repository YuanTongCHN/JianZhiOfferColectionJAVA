package indi.yuantongchn.JZOffer38;

import java.util.HashSet;
import java.util.Set;


class Solution {
    public String[] permutation(String s) {
        Set<String> ans = new HashSet<>();
        StringBuffer str = new StringBuffer();
        boolean[] visited = new boolean[s.length()];
        dfs(s, ans, str, visited);
        String[] res = ans.toArray(new String[ans.size()]);
        return res;
    }
    private void dfs(String s, Set<String> ans, StringBuffer str, boolean[] visited) {
        if (s.length() == str.length()) {
            ans.add(str.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (visited[i] == true) {
                continue;
            }
            visited[i] = true;
            str.append(s.charAt(i));
            dfs(s, ans, str, visited);
            str.deleteCharAt(str.length() - 1);
            visited[i] = false;
        }
    }
}


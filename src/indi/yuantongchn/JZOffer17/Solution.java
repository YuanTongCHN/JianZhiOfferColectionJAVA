package indi.yuantongchn.JZOffer17;

public class Solution {
    //不可在LC上提交
    public String printNumbers(int n) {
        if(n == 0){
            return new String();
        }
        StringBuffer resAns = new StringBuffer();
        for (int i = 0; i <= 9; i++) {
            dfs(resAns, n , i, new StringBuffer(), 0);
        }
        resAns.deleteCharAt(resAns.length() - 1);
        return resAns.toString();
    }

    private void dfs(StringBuffer resAns, int n, int curNum, StringBuffer curStr, int index) {
        curStr.append(curNum);
        if (index == n - 1) {
            int end = 0;
            while (end < n && curStr.charAt(end) == '0') {
                end++;
            }
            if(end < n) {
                StringBuffer outStr = new StringBuffer(curStr);
                outStr.delete(0, end);
                resAns.append(outStr.toString()).append(",");
                //System.out.println(curStr);
            }
            return;
        }

        for (int i = 0; i <= 9; i++) {
            dfs(resAns, n , i, curStr, index + 1);
            curStr.deleteCharAt(curStr.length() - 1);
        }

    }
}





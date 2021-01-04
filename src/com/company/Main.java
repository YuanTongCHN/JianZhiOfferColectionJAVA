package com.company;

import indi.yuantongchn.JZOffer17_hard.Solution;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        StringBuffer aaa = new StringBuffer();
//        aaa.append("abcdefg");
//        char c = aaa.charAt(2);
//        System.out.println(c);
//        int[] nums = new int[10];
//        int len = nums.length;
//
//        Solution solution = new Solution();
//        String ans = solution.printNumbers(3);
//        System.out.println(ans);
        String a;

//        String[] vals = a.split("a");
//        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList(vals));
//        Set<String> set = new HashSet<>(ll1);
//        List<String> ss = new ArrayList<>(set);
        //String[] strl = (String[]) ss.toArray();
        //System.out.println(strl);
        StringBuffer stringBuffer = new StringBuffer("[");
        stringBuffer.deleteCharAt(0);
        a = stringBuffer.toString();
        System.out.println(a);
        String aa = new String(stringBuffer);
        System.out.println(aa);
        stringBuffer.append("]");
        System.out.println(a);
        System.out.println(aa);
//        System.out.println(stringBuffer.append("]"));
//        System.out.println(stringBuffer.append("j"));

//        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
//        System.out.println(a.equals("sss"));
//        System.out.println(Integer.parseInt("123"));
//
//
        List<Integer> intll = new ArrayList<>();
        intll.add(1);
        intll.add(2);
        intll.add(3);
        Integer[] ints = intll.toArray(new Integer[intll.size()]);
        System.out.println(ints[0]);
    }
}

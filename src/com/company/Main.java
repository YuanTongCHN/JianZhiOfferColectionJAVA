package com.company;

import indi.yuantongchn.JZOffer17_hard.Solution;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int a = 123456;

        Integer j = 2;
        AtomicInteger b = new AtomicInteger(3);
        b.set(4);
        int c = b.get();

        String s = Integer.toString(a);
        StringBuffer sb = new StringBuffer(s);

        System.out.println(s);
        String s1 = String.valueOf(s.charAt(1) + s.charAt(2));
        StringBuffer stb = new StringBuffer();

        System.out.println(s1);
//        int b = Integer.valueOf(s);
//        System.out.println(b);
//        int c = Integer.parseInt(s);
//        System.out.println(c);

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.addLast(11);
//        linkedList.addLast(12);
//        linkedList.addLast(13);
//        System.out.println(linkedList.get(2));
        HashSet<Character> keys = new HashSet<>();
        keys.contains(a);
        Map<Character, Integer> dic = new HashMap<>();
        dic.put('a',1);
        dic.put('b',2);
        dic.put('c',3);
        dic.put('d',4);
        System.out.println(dic.getOrDefault('d',0));
        System.out.println(dic.containsKey('d'));
        Set<Character> characters = dic.keySet();
        List<Integer[]> ans = new ArrayList<>();
        


    }
}

package com.company;

import indi.yuantongchn.JZOffer17_hard.Solution;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
        Queue<Integer> q = new PriorityQueue<>();
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        */

        int[] a = {1, 2, 3};
        List<Integer> l = new ArrayList<>();
        for (int i : a) {
            l.add((i));
        }
        System.out.println(l);
        int[] b = new int[l.size()];
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] = l.get(i));
        }


































    }
}

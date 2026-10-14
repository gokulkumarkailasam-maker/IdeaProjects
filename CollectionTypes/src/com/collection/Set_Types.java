package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Types {
    public static void main(String[]args) {
        Set_Methods();
    }
    public static void Set_Methods() {
        Set<Integer> hs = new HashSet<Integer>();
        hs.add(9); //hashset not allows duplicate values/prints in random order/allows only one null value
        hs.add(8);
        hs.add(7);
        hs.add(4);
        hs.add(3);
        hs.add(1);
        hs.add(0);
        hs.add(null);
        hs.add(1);
        hs.add(5);
        hs.add(null);
        hs.add(7);
        System.out.println("HashSet Random order:"+hs);
        //size
        Integer hssize = hs.size();
        System.out.println("hashset size:"+hssize);
        //contains
        boolean hscontains = hs.contains(null);
        System.out.println("hscontains:"+hscontains);
        //remove
        boolean hsremove = hs.remove(5);
        System.out.println("lhs remove"+hsremove);
        //-------------------------------------------------------------------------------------------------------------

        Set <Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(10); //it prints in insertion order/not allow duplicate values/only allows single null value
        lhs.add(20);
        lhs.add(15);
        lhs.add(5);
        lhs.add(30);
        lhs.add(40);
        lhs.add(20);
        lhs.add(0);
        lhs.add(null);
        lhs.add(0);
        lhs.add(5);
        lhs.add(null);
        System.out.println("LinkedHashSet Insertion order:"+lhs);
        //size
        Integer lhssize = lhs.size();
        System.out.println("linkedhashset size:"+lhssize);
        //contains
        boolean lhscontains = lhs.contains(0);
        System.out.println("lhs contains:"+lhscontains);
        //remove
        boolean lhsremove = lhs.remove(5);
        System.out.println("lhs remove"+lhsremove);
        //-------------------------------------------------------------------------------------------------------------

        Set <Integer> ts = new TreeSet<Integer>();
        ts.add(2); //it prints in ascending order/not allow duplicate values/not allow null value
        ts.add(4);
        ts.add(10);
        ts.add(9);
        ts.add(13);
        ts.add(15);
        ts.add(17);
        ts.add(0);
        ts.add(0);
        ts.add(1);
        ts.add(4);
        System.out.println("TreeSet ascending order:"+ts);
        //size
        Integer tssize = ts.size();
        System.out.println("treeset size:"+tssize);
        //contains
        boolean tscontains = ts.contains(0);
        System.out.println("ts contains:"+tscontains);
        //remove
        boolean tsremove = ts.remove(5);
        System.out.println("ts remove"+tsremove);
        //--------------------------------------------------------------------------------------------------------------
        //addAll
        boolean addAll = hs.addAll(lhs);
        System.out.println("hs+lhs:"+hs);
        boolean addAll1 = hs.addAll(ts);
        System.out.println("hs+ts:"+hs);
        //clear
        ts.clear();
        System.out.println("ts clear:"+ts);

    }

}

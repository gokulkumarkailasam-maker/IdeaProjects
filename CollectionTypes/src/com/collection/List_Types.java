package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Types {
    public static void arrayList() {
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(10);
        al.add(10);
        al.add(5);
        al.add(4);
        al.add(0);
        System.out.println(al);

        //size
        Integer size = al.size();
        System.out.println("Size:"+size);

        //get
        Integer get = al.get(6);
        System.out.println("Get:"+get);

        //set
        Integer set = al.set(1,7);
        System.out.println("Set:"+al);

        //indexof
        Integer indexOf = al.indexOf(10);
        System.out.println("Indexof:"+indexOf);

        //lastIndexOf
        Integer lastIndexOf = al.lastIndexOf(10);
        System.out.println("lastIndexOf:"+lastIndexOf);

        //contains
        boolean contains = al.contains(15);
        System.out.println(contains);

        List<Integer> al1= new ArrayList<Integer>();
        al1.add(5);
        al1.add(10);
        al1.add(11);
        al1.add(3);
        al1.add(5);
        al1.add(9);
        al1.add(0);

        System.out.println("al1 list:"+al1);

        //addAll
        boolean addAll = al.addAll(al1);
        System.out.println("addAll:"+al);

        //retainAll
        boolean retainAll = al.retainAll(al1);
        System.out.println("retainAll:"+al);

        //remove
        Integer remove = al.remove(1);
        System.out.println("remove al:"+al);

        //removeAll
        boolean removeAll = al.removeAll(al1);
        System.out.println(al);

        //clear
        al.clear();
        System.out.println(al);

    }
    public static void main(String[]args) {
        arrayList();
    }
}

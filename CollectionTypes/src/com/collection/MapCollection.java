package com.collection;

import java.util.*;

public class MapCollection {
    public static void main(String[]args) {
        Map_Methods();
    }
    public static void Map_Methods() {
        Map<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Senthil");
        hm.put(2,"Deivanai");
        hm.put(3,"Gokul");
        hm.put(4,"Sindhu");
        hm.put(5,"Yaadhu");
        hm.put(6,"T_Gode");
        hm.put(null,"Muthu");
        hm.put(7,"Revathi");
        hm.put(0,"akil");
        System.out.println("HashMap:"+hm);
        //size
        Integer hmsize = hm.size();
        System.out.println("hm size:"+hmsize);
        //get-key based
        String hmget = hm.get(2);
        System.out.println("hm get:"+hmget);
        //keyset
        Set<Integer> hmkeySet = hm.keySet();
        System.out.println("hm keySet:"+hmkeySet);
        //values
        Collection<String> hmvalues = hm.values();
        System.out.println("hm values:"+hmvalues);
        //entrySet
        Set<Map.Entry<Integer,String>> hmentryset = hm.entrySet();
        System.out.println("hm entrySet:"+hmentryset);
        //containsKey
        boolean hmcontainsKey = hm.containsKey(7);
        System.out.println("hm containsKey:"+hmcontainsKey);
        //containsValue
        boolean hmcontainsValue = hm.containsValue("Gokul");
        System.out.println("Hm containsValue:"+hmcontainsValue);
        //----------------------------------------------------------------------------------------------------------------------------
        Map<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("Yaadhu",2);
        lhm.put("Gokul",30);
        lhm.put("Senthil",52);
        lhm.put("Deivanai",48);
        lhm.put("Sindhu",25);
        lhm.put("Akil",18);
        lhm.put("Revathi",40);
        lhm.put("Muthu",null);
        System.out.println("linked hashmap:"+lhm);
        //size
        Integer lhmsize = lhm.size();
        System.out.println("lhm size:"+lhmsize);
        //get
        Integer lhmget = lhm.get("Deivanai");
        System.out.println("lhm get:"+lhmget);
        //keySet
        Set <String> lhmkeySet = lhm.keySet();
        System.out.println("lhmkeySet:"+lhmkeySet);
        //values
        Collection <Integer> lhmvalues = lhm.values();
        System.out.println("lhmvalues:"+lhmvalues);
        //entrySet
        Set<Map.Entry<String,Integer>> lhmentrySet = lhm.entrySet();
        System.out.println("lhm entrySet:"+lhmentrySet);
        //containsKey
        boolean lhmcontainsKey = lhm.containsKey("Gokul");
        System.out.println("lhmcontainsKey:"+lhmcontainsKey);
        //containsValue
        boolean lhmcontainsValue = lhm.containsValue("Senthil");
        System.out.println("lhm containsValue:"+lhmcontainsValue);
        //--------------------------------------------------------------------------------------------------------------
        Map <String,String> tm = new TreeMap<String,String> ();
        tm.put("Gokul","Sindhu");
        tm.put("Senthil","Deivanai");
        tm.put("Yaadhu","null");
        tm.put("Kumbesh","Gowthami");
        System.out.println("tm:"+tm);
        //size
        Integer tmsize = tm.size();
        System.out.println("tm size:"+tmsize);
        //get
        String tmget = tm.get("Yaadhu");
        System.out.println("tm get:"+tmget);
        //keySet
        Set <String> tmkeySet = tm.keySet();
        System.out.println("tm keySet:"+tmkeySet);
        //values
        Collection <String> tmvalues = tm.values();
        System.out.println("tm values:"+tmvalues);
        //entrySet
        Set<Map.Entry<String,String>> tmentrySet = tm.entrySet();
        System.out.println("tm entrySet:"+tmentrySet);
        //containsKey
        boolean tmcontainsKey = tm.containsKey("Yaadhu");
        System.out.println("tm containsKey:"+tmcontainsKey);
        //containsValue
        boolean tmcontainsValue = tm.containsValue("null");
        System.out.println("tm containsValue:"+tmcontainsValue);
        //-------------------------------------------------------------------------------------------------------------
        Map<String,Float> ht = new Hashtable<String,Float>();
        ht.put("Gokul",63.5f);
        ht.put("Yaadhu",2.0f);
        ht.put("Sindhu",66.8f);
        ht.put("Senthil",75.5f);
        ht.put("Deivanai",50.4f);
        System.out.println("Hashtable Print Order:"+ht);
        //size
        Integer htsize = ht.size();
    }
}

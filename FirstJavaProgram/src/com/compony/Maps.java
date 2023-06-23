package com.compony;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Maps{
    public static void main(String[] args){
        Map<Integer, String> numbers = new HashMap<>();
        Map<Integer, String> treeNumbers = new TreeMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        // map overrides
        numbers.put(3, "four");

        System.out.println(numbers);
        // iterate in maps
        for(Map.Entry<Integer, String> e: numbers.entrySet()){
            System.out.println(e);

            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }
    }
}

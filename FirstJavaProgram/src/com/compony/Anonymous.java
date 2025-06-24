package com.compony;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Anonymous{
    public static void main(String[] args){
        int[] no_group = {132 ,15 , 35, 567, 51, 516, 150, 6, 101, 5};

        for(int k:no_group) System.out.print(k + " ");
        System.out.println("");

        ArrayList<Integer> myList = new ArrayList<>();
        for(int k:no_group) myList.add(k);

        // sorting based on last no
        Comparator<Integer> myLogic = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return Integer.compare(o1 % 10, o2 % 10);
            }
        };
        Collections.sort(myList, myLogic);
        System.out.println(myList);
    }
}

package com.compony;

import java.util.ArrayList;

class MyGenerics<T1>{
    T1 t1;

    public MyGenerics(T1 t1) {
        this.t1 = t1;
    }
    public T1 getT1() {
        return t1;
    }
}
public class GenericsInJava{
    public static void main(String[] args){
        ArrayList arr = new ArrayList();
        arr.add("akshat");
        arr.add(24);
        arr.add(25);
        System.out.println((int)arr.get(1)+ (int)arr.get(2) + " " + (String)arr.get(0));

        // In general generics...
        MyGenerics<Integer> str = new MyGenerics<>(1);
        System.out.println(str.getT1());
    }
}

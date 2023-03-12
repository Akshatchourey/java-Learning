package com.compony;

class Class1{
    public int a = 5;
    protected int b = 25;
    int c = 45;
    private int d = 125;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class AccessModifiers{
    public static void main(String[] args){
        Class1 one = new Class1();
        System.out.println("Within Class");
        one.meth1();
        System.out.println("Outside class, d cannot be accessed.");
        System.out.println(one.a);
        System.out.println(one.b);
        System.out.println(one.c);
        // System.out.println(one.d); Produce error, I tried to access private property by a package/outside d class.
    }
}

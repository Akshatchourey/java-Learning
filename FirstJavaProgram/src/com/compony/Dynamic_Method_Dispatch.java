package com.compony;

class Phone{
    public void meth1(){
        System.out.println("method 1 is running.");
    }
    public void on(){
        System.out.println("on the Phone");
    }
}
class SmartPhone extends Phone{
    public void on(){
        System.out.println("on the SmartPhone...");
    }
    public void meth3(){
        System.out.println("method 3 is running");
    }
}

public class Dynamic_Method_Dispatch{
    public static void main(String[] args){
        Phone obj1 = new Phone();
        SmartPhone obj2 = new SmartPhone();
        Phone obj3 = new SmartPhone();
        // SmartPhone obj4 = new Phone(); NOT Allowed.

        obj3.meth1();
        obj3.on();
//        obj3.meth2();
    }
}

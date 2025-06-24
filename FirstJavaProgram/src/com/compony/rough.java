package com.compony;

class Base2{
    public void say(){
        System.out.println("base");
    }
}
class Derived2 extends Base2{
    public void tell(){
        System.out.println("derived");
    }
}

public class Rough{
    public static void main(String[] args){
        Base2 obj = new Derived2();
        obj.say();
    }
}


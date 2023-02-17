package com.compony;

// We can not define objects for abstract classes...
abstract class parent2{
    public void sayHallow(){
        System.out.println("hallow akshat");
    }
    abstract void great();
}
class child2 extends parent2{
    @Override
    public void great(){
        System.out.println("YOoo..");
    }
}
abstract class child3 extends parent2{
    public void other(){
        System.out.println("extended but still not implemented great hence have to declare abstract class.");
    }
}
class child4 extends child3{
    public void great(){
        System.out.println("Namesta");
    }
}

public class AbstractOops{
    public static void main(String[] args){
        child2 one = new child2();
        one.sayHallow();
        one.great();

        child4 two = new child4();
        two.sayHallow();
        two.great();
        two.other();
    }
}

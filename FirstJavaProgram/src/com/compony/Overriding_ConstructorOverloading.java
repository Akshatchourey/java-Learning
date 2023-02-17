package com.compony;

class Parent{
    int x;
    public Parent(){
        this.x = 1;
    }
    public Parent(int no){
        this.x = no;
    }

    public void values(){
        System.out.println("the value of x is " + x);
    }
}
class Child extends Parent{
    int y;
    public Child(){
        this.y = 2;
    }
    public Child(int c, int d){
        super(c);  // Constructor during constructor overloading
        System.out.println("this method calls the constructor from the parent class with parameter "+x);
        this.y = d;
    }

    @ Override  // method Overriding
    public void values(){
        System.out.println("the value of y is " + y);
    }
}
public class Overriding_ConstructorOverloading{
    public static void main(String[] args) {
        Parent one = new Parent();
        one.values();
        Child two = new Child(5, 6);
        two.values();
    }
}

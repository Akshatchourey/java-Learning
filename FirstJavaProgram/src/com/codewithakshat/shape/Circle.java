package com.codewithakshat.shape;

public class Circle{
    public int r;
    public Circle(){
        this.r = 5;
    }
    public Circle(int a){
        this.r = a;
    }
    public void area(){System.out.println("Area of circle is " + 3.1415*r*r);}
    public void circumference(){
        System.out.println("circumference of selected circle is " + 2*3.1415*r);
    }
}

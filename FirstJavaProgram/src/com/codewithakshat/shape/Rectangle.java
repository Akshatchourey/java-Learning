package com.codewithakshat.shape;

public class Rectangle{
    public int l; public int b;
    public Rectangle(){
        this.l = 12;
        this.b = 4;
    }
    public Rectangle(int no, int noo){
        this.l = no;
        this.b = noo;
    }
    public void area(){System.out.println("Area of selected shape is " + l*b);}
    public void perimeter(){
        System.out.println("perimeter of selected shape is " + 2*(l+b));
    }
}

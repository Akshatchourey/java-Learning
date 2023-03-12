package com.codewithakshat.shape;

public class Cylinder{
    public int r; public int h;
    public Cylinder(){
        this.r = 7;
        this.h = 11;
    }
    public Cylinder(int no, int noo){
        this.r = no;
        this.h = noo;
    }
    public void volume(){
        System.out.println("Volume of cylinder is " + 3.1415*r*r*h);
    }
    public void totalSurfaceAre(){
        System.out.println("Total surface area of cylinder is" + 2*3.1415*r*(r+h));
    }
}

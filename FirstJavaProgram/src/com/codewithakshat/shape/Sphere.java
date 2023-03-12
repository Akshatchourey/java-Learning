package com.codewithakshat.shape;

public class Sphere{
    public int r;
    public Sphere(){
        this.r = 7;
    }
    public Sphere(int no){
        this.r = no;
    }
    public void volume(){
        System.out.println("Volume of sphere is " + ((4/3)*3.1415*r*r));
    }
    public void totalSurfaceArea(){
        System.out.println("Total surface area of sphere is" + 4*3.1415*r*r);
    }
}

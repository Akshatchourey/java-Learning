package com.compony;
//import java.util.Scanner;

class MyEmployee{
    private int id;
    private String name;

    public void setId(int no){id = no;}
    public int getId(){return id;}
    public void setName(String  n){this.name = n;}
    public String getName(){return name;}
}
class Circle{
    private int r;
    public void setR(int no){
        this.r=no;
    }
    public void check(double a, double p, int r){
        if(a == 3.1415*r*r && p == 2*3.1415*r){
            System.out.println("Data given is right.");
        }else{
            System.out.println("Data given is not correct.");
        }
    }
}
public class Getter_Setter_Oops{
    public static void main(String[] args) {
        MyEmployee akshat = new MyEmployee();
        akshat.setId(5);akshat.setName("akshat chourey");
        System.out.println(akshat.getId());
        System.out.println(akshat.getName());

        //circle r,a and p checking otherwise show error
        Circle firstCircle = new Circle();
        firstCircle.setR(2);
        firstCircle.check(12.5660,12.5660,2);
    }
}

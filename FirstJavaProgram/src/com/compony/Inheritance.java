package com.compony;

class Animal{
    public void sit(){
        System.out.println("sited");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("bark --> khooBhoo-bhooBhoo");
    }
}

class Base{
    int x;
    public Base(){
        this.x = 4;
    }
    public Base(int no){
        this.x = no;
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
}

class Derived extends Base{
    int y;
    public Derived(){
        this.y = 5;
    }
    public Derived(int no){
        this.y = no;
    }
    public Derived(int no, int noo){
        this.x = no; this.y = noo;
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

class GrandChild extends Derived{
    int z;
    public GrandChild(){
        this.z=6;
    }
    public GrandChild(int no){
        this.z = no;
    }
    public GrandChild(int no, int noo, int nooo){
        this.x = no;
        this.y = noo;
        this.z = nooo;
    }
    public void setZ(int z){
        this.z = z;
    }
    public int getZ(){
        return z;
    }
}

public class Inheritance{
//    public static void main(String[] args) {
//        // creating object of Base class
//        Base b = new Base();
//        b.setX(4); // setY(5) through error...
//        System.out.println("value of x by base class " + b.getX());
//
//        // creating object of Derived class
//        Derived d = new Derived();
//        d.setX(45);
//        System.out.println("value of x by derived class " + d.getX());
//        d.setY(5);
//        System.out.println("value of y by derived class " + d.getY());
//
//        // creating object of animal class
//        Animal cat = new Animal();
//        cat.sit();
//
//        // creating object of dog class
//        Dog dog = new Dog();
//        dog.sit();
//        dog.bark();
//    }
    public static void main(String[] args){
        Base b = new Base();
        System.out.println(b.getX());

        Derived d = new Derived();
        System.out.println(d.getX() + d.getY());

        GrandChild c = new GrandChild();
        System.out.println(c.getX() + c.getY() + c.getZ());

        // Over loading fun...
        Base one = new Base(20);
        Derived two = new Derived(21,31);
        GrandChild three = new GrandChild(22,32,42);

        System.out.println(one.getX());
        System.out.printf("%d %d",two.getX(),two.getY());
        System.out.printf("\n%d %d %d",three.getX(),three.getY(),three.getZ());
    }
}

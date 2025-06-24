package com.compony;

class Base1{
    public void show(){
        System.out.println("we are in base show");
    }
    public void display(){
        System.out.println("we are in base display");
    }
}

class Derived1 extends Base1 {
    public void show(){
        super.show();
        System.out.println("we are in derived show");
    }
    public void display(){
        super.display();
        System.out.println("we are in derived display");
    }
}

class Moverride{
    public static void main(String [] args){
        Derived1 d = new Derived1();
        d.show();
        d.display();

    }
}

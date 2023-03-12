package com.compony;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
        System.out.println("constructors of Thread1 is running.");
    }
    @Override
    public void run(){
        for(int i=1; i<20; i++){
            System.out.println("firstly run fast and then be consistent.");
        }
    }
}
class MyThr2 implements Runnable{
    public void run(){
        for(int i=1; i<20; i++){
            System.out.println("Thread2 constructors.");
        }
    }
}

public class ConstructorsInThread{
    public static void main(String[] args) {
        MyThr1 one = new MyThr1("akshat");
        MyThr2 two = new MyThr2();
        Thread twoTh = new Thread(two, "papa");
        twoTh.start();
        one.start();
        System.out.println("Id of this thread1 is " + one.getId());
        System.out.println("Name of this thread1 is " + one.getName());

        System.out.println("Id of this thread2 is " + twoTh.getId());
        System.out.println("Name of this thread2 is " + twoTh.getName());

    }

}

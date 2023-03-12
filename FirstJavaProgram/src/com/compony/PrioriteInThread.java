package com.compony;

class PriThread extends Thread{
    public PriThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 1; i<30; i++){

        }
        System.out.println("Executing thread " + this.getName());
    }
}

public class PrioriteInThread{
    public static void main(String[] args) {
        PriThread one = new PriThread("akshat");
        PriThread two = new PriThread("kri");
        PriThread three = new PriThread("papa");
        PriThread four = new PriThread("mom");
        PriThread five = new PriThread("bhi");

        one.setPriority(Thread.MAX_PRIORITY);
        two.setPriority(Thread.MIN_PRIORITY);
        three.setPriority(3);
        four.setPriority(2);
        five.setPriority(4);

        one.start(); two.start(); three.start(); four.start(); five.start();
    }

}

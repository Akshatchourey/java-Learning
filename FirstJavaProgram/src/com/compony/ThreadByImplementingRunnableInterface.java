package com.compony;

class RunnableThread1 implements Runnable{
    public void run(){
        for(int i=1; i<500; i++){
            System.out.println("running thread1 through implementing runnable interface.");
        }
    }
}
class RunnableThread2 implements Runnable{
    public void run(){
        for(int i=1; i<500; i++){
            System.out.println("running thread2 through implementing runnable interface.");
        }
    }
}
public class ThreadByImplementingRunnableInterface{
    public static void main(String[] args){
        // Bullet Gun analogy. Ready the bullet and then load. Then shoot with start method.
        RunnableThread1 bullet1 = new RunnableThread1();
        Thread gun1 = new Thread(bullet1);

        RunnableThread2 bullet2 = new RunnableThread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start(); gun2.start();
    }
}

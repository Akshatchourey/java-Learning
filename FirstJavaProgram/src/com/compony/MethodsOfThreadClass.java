package com.compony;

import java.util.concurrent.ThreadPoolExecutor;

class MyThread1 extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<50; i++){
            System.out.println("Running thread1 from different methods");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<50; i++){
            System.out.println("Running thread2 from different methods");
        }
    }
}
public class MethodsOfThreadClass{
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        try{
//            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}

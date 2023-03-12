 package com.compony;

class Thread1 extends Thread{
//    @Override
//    public void run(){
//        while(true){
//            System.out.println("Good thread1 is running");
//        }
//    }
    @Override
    public void run(){
        int ans = 0;
        for(int i =0;i<5000;i++){
            ans += i;
        }
        System.out.println("sum all 5000 integer from thread1 is " + ans);
    }
}
class Thread2 extends Thread{
//    @Override
//    public void run(){
//        while(true){
//            System.out.println("Better thread2 is running");
//        }
//    }
      @Override
      public void run(){
          int ans = 0;
          for(int i =0;i<5000;i++){
              ans += i;
          }
          System.out.println("sum all 5000 integer from thread2 is " + ans);
      }
}
class Thread3 extends Thread{
     @Override
     public void run(){
         int ans = 0;
         for(int i =0;i<5000;i++){
             ans += i;
         }
         System.out.println("sum all 5000 integer from thread3 is " + ans);
     }
 }

public class ThreadBasics{
    public static void main(String[] args){
        Thread1 one = new Thread1();
        Thread2 two = new Thread2();
        Thread3 three = new Thread3();
        System.out.println(one.getId()); System.out.println(two.getId()); System.out.println(three.getId());
        one.start(); two.start(); three.start();
    }
}

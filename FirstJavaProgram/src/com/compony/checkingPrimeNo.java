package com.compony;
// cannot check because numbers are too large
class check1 extends Thread{
    @Override
    public void run(){
        long no = 261980999226229L;
        for(int i=2;i<8092914;i++){
            if(no%i == 0){
                System.out.println("not a prime" + i);
                return;
            }
        }
    }
}
class check2 extends Thread{
    @Override
    public void run(){
        long no = 261980999226229L;
        for(int i=8092914;i<16185827;i++){
            if(no%i == 0){
                System.out.println("not a prime" + i);
                return;
            }
        }
    }
}
public class checkingPrimeNo{
    public static void main(String[] args) {
        long no = 261980999226229L;
        check1 obj1 = new check1();
        check2 obj2 = new check2();
        obj1.start(); obj2.start();
    }
}

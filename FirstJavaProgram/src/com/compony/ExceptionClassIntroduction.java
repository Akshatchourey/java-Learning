package com.compony;
import java.util.Scanner;

class CostumeException1 extends Exception{
    public CostumeException1(){}
    public  CostumeException1(String s){
        super(s);
    }
    @Override
    public String getMessage(){
        return "I am getting message. " + super.getMessage();
    }
    @Override
    public String toString(){
        return "I am toString.";
    }
    //custom one
    public String noNegative(){
        return "Sorry you cannot input negative value.";
    }
}

public class ExceptionClassIntroduction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 5;
        System.out.print("Enter the no b:- ");
        int b = sc.nextByte();
        if(b<0){
            try{
                throw new CostumeException1("Negative number inserted...");
            }catch(CostumeException1 e){    // Important here.
                System.out.println(e.getMessage());
                System.out.println(e.noNegative());
            }
        }

        try{
            try{
                throw new ArithmeticException();
            }catch(Exception e){
                System.out.print(e.toString());
                System.out.println(" Thank you.");
            }
            throw new CostumeException1("This is message attached to main exception...");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("i am fine.");
    }
}

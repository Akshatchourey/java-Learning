package com.compony;
import java.util.Scanner;

public class TryCatchBlock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 5;
        try{
            System.out.print("Enter the value of a:- "); int a = sc.nextInt();
            System.out.print("Enter the value of b:- "); int b = sc.nextInt();
            c = a/b;
        }
        catch(Exception e){
            System.out.println("Sorry you cant divide by 0 and a,b cannot be except integer, error occurred:- " + e);
        }finally{
            sc.close();
        }

        System.out.println("Continuing the program... value of a divide b is:- " + c);
    }
}

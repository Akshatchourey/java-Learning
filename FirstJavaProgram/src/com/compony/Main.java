package com.compony;
import java.util.Scanner;
public class Main {
//result app
    public static void main(String[] args) {
        System.out.println("Akshat Can Study...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of subject 1:"); int a1 = sc.nextInt();
        System.out.print("Enter the marks from :"); int b1 = sc.nextInt();
        System.out.print("Enter the marks of subject 2:"); int a2 = sc.nextInt();
        System.out.print("Enter the marks from :"); int b2 = sc.nextInt();
        System.out.print("Enter the marks of subject 3:"); int a3 = sc.nextInt();
        System.out.print("Enter the marks from :"); int b3 = sc.nextInt();
        System.out.print("Enter the marks of subject 4:"); int a4 = sc.nextInt();
        System.out.print("Enter the marks from :"); int b4 = sc.nextInt();
        System.out.print("Enter the marks of subject 5:"); int a5 = sc.nextInt();
        System.out.print("Enter the marks from :"); int b5 = sc.nextInt();
        int sum1 = a1+a2+a3+a4+a5;
        int sum2 = b1+b2+b3+b4+b5;
        int top = sum1*100;
        int percentage = top/sum2;
        System.out.println(percentage + "%");
        // nice work
    }
}
    //for loop = for(int i=1;i<=10;i++){ System.out.println(i); }

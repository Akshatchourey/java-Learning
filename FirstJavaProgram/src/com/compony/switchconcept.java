package com.compony;
import java.util.Scanner;

public class switchconcept {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        int a = 2;
        while(a==2) {
            System.out.println("enter your age");
            age = sc.nextInt();
            switch (age) {
                case 12:
                    System.out.println("you are boy");
                    break;
                case 18:
                    System.out.println("you are Adult");
                    break;
                case 22:
                    System.out.println("ready for job");
                    break;
                case 30:
                    System.out.println("you are becoming older");
                    break;
                case 60:
                    System.out.println("now please dye");
                    break;
                default:
                    System.out.println("running default");

            }
        }
    }
}

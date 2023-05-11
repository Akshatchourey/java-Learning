package com.compony;

import java.util.Scanner;

public class arrays_intro {
    /*
    public static void main(String[] args) {
        int [] no = {1,6,5,8,10};   //arrays Declaration and initialization.
        for (int k : no) {
            if (k == 5) {
                continue;
            }
            else if (k == 6){
                System.out.println("yoooooooo");
            }
            System.out.println(k);
        }
        String [] name = new String[5];
        name[0]="akshat";
//        name[1]="akshat";
//        name[2]="akshat";
//        name[3]="akshat";
//        name[4]="akshat";
        for(int j=0;j<name.length;j++){    //Smart---> (int j : name){sout(j);
            System.out.println(name[j]);
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size int of Array:");
        int size = sc.nextInt();
        int[] number = new int[size];
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        for (int j : number) {
            System.out.println(j);
        }
    }
}

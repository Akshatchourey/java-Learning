package com.compony;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int [] no = {1,6,5,8,10};   //arrays Declaration and initialization.
        for (int k : no) {
            if (k == 5) {
                continue;
            }
            else if (k == 6){
                System.out.println("yoooooooo");
            }
            System.out.println(k);
        }
        String [] name = new String[3];
        name[0]="akshat";
//        name[1]="akshat";
//        name[2]="akshat";
        for(int j=0;j<name.length;j++){
            System.out.println(name[j]);
        }*/

        /*System.out.print("Input the size int of Array:");
        int size = sc.nextInt();
        int[] number = new int[size];
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        for (int j : number) {
            System.out.println(j);
        }*/

        // sorting
        int[] arr = {5,6,7,2,6,79,3,85,68};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); // or
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 79));

    }
}

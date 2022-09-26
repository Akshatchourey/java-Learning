package com.compony;

public class ifelse {
    public static void main(String[] args) {
        int a = 10;
        while(a>0){
            if(a%2==0){
                System.out.println(a);
            }
            else{
                System.out.println("rubbish");
            }
            --a;
        }
    }
}

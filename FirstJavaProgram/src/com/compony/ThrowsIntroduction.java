package com.compony;
import java.util.Scanner;

class NegativeRadiusException extends Exception{
    @Override
    public String getMessage(){
        return "Pl don't enter negative number because there is no negative area exist up till now.";
    }
}
public class ThrowsIntroduction{
    public static double c_area(float r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        return Math.PI*r*r;
    }
    public static int divide(int a, int b) throws Exception{
        // Made by Akshat
        return a/b;
    }
    public static void main(String[] args){
        // Kriti - use divide function created by Akshat
        try {
            System.out.println(divide(6, 2));
        }catch(Exception e){
            System.out.println("Exception founded --->" + e);
            System.out.println("Exception says this --->" + e.getMessage());
        }

        // Costume negative no exception in area method
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(c_area(sc.nextInt()));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

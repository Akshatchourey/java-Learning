package com.compony;
import java.util.Scanner;
import java.util.SortedSet;

// custom exception
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

    // can throw some exception
    public static int divide(int a, int b) throws Exception{
        // Made by Akshat
        return a/b;
    }

    // 100% throws the exception, super-class can throw subclass exception
    public static int multiply(int a, int b) throws Exception{
        // Made by Akshat
        throw new ArithmeticException("message to show HaHaHa!!!");
    }

    public static void main(String[] args){
        try { // ex of throws
            System.out.println(divide(6, 0));
        }catch(Exception e){
            System.out.println("Exception says this --->" + e.getMessage());
        }

        try { // ex fo throw
            System.out.println(multiply(6, 0));
        }catch(ArithmeticException e){
            System.out.println("Exception says this ---> Explicit throw: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (Error e){
            System.out.println("By hierarchy.");
        }

        // Costume negative no exception in area method
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(c_area(sc.nextInt()));
        }catch(NegativeRadiusException e){
            System.out.println(e.getMessage());
        }
    }
}

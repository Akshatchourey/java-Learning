package com.compony;

public class NestedTryExample{
    public static void main(String[] args){
        try{
            int[] numbers = {1, 2, 3, 4, 0};
            try {
                System.out.println("Inside inner try block.");
                int data = 10/0;
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index is out of bounds.");
            }
        }catch (ArithmeticException e){
            System.out.println("Outer Catch: Cannot divide by zero.");
        }
        System.out.println("Program continues...");
    }
}
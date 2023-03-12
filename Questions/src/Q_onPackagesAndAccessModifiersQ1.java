package Calc;
class Calculator{
    public void sum(int a, int b){
        System.out.println("Your sum " + (a+b));
    }
}
class ScCalculator{
    public void sum(int a, int b){
        System.out.println("Your sin(sum) is " + Math.sin(a+b));
    }
}
class HyCalculator{
    public void calculate(int a, int b){
        System.out.println("Your sum " + (a+b));
        System.out.println("Your sin(sum) is " + Math.sin(a+b));
    }
}

public class Q_onPackagesAndAccessModifiersQ1{
    public static void main(String[] args){
        System.out.println("Hi...");
    }
}

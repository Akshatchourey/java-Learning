class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverloading{
    public static void main(String[] args){
        System.out.println("Addition of two integers: " + Calculator.add(5, 10));
        System.out.println("Addition of three integers: " + Calculator.add(1, 2, 3));
        System.out.println("Addition of two doubles: " + Calculator.add(2.5, 3.5));
    }
}

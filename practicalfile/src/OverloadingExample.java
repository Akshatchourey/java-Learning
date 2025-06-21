class Operation {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    String add(String a, String b) {
        return a + b;
    }
}
public class OverloadingExample {
    public static void main(String[] args) {
        Operation operation = new Operation();
        System.out.println("Addition of integers: " + operation.add(5, 10));
        System.out.println("Addition of doubles: " + operation.add(2.5, 3.5));
        System.out.println("Concatenation of strings: " + operation.add("Hello", " World"));
    }
}

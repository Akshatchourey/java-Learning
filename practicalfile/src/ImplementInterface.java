interface Machine {
    void start();
}

class Printer implements Machine {
    public void start() {
        System.out.println("The printer starts printing.");
    }
}
class Scanner implements Machine {
    public void start() {
        System.out.println("The scanner starts scanning.");
    }
}
public class ImplementInterface{
    public static void main(String[] args){
        Machine printer = new Printer();
        printer.start();

        Machine scanner = new Scanner();
        scanner.start();
    }
}

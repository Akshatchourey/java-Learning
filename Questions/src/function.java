import java.util.Scanner;

public class function {
    public static void printMyName(String name){
        System.out.println(name );
        System.out.print("is very bad and good too.");
    }
    public static void main(String[] args) {
        System.out.print("What is your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        printMyName(name);
    }
}

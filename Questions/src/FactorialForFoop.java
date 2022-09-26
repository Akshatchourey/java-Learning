import java.util.Scanner;
public class FactorialForFoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter the no whose factorial you want to find:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            factorial *= i;
        }
        System.out.print("The factorial of no given is:");
        System.out.println(factorial);
    }
}

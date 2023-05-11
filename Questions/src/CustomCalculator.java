import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String getMessage(){
        return "You have inputted either wrong operator or your equation is in incorrect.";
    }
}
class MaxInputException extends Exception{
    @Override
    public String getMessage(){
        return "no inputted should be grater then 100000.";
    }
}
class DivideByZeroException extends Exception{
    @Override
    public String getMessage(){
        return "Sorry you cannot divide by zero.";
    }
}
class MaxMultiplierReachedException extends Exception{
    @Override
    public String getMessage(){
        return "Your multiplication is exceeding max valur of 7000.";
    }
}
public class CustomCalculator{
    public static String calculate() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of no a:- ");int a = sc.nextInt();
        System.out.print("Enter the value of no b:- ");int b = sc.nextInt();
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        System.out.print("Enter one of the operator(+. -, *, /, %):- "); char o = sc.next().charAt(0);
        switch(o){
            case '+':
                return "a + b = " + (a+b);
            case '-':
                return "a - b = " + (a-b);
            case '*':
                if(a*b > 7000){
                    throw new MaxMultiplierReachedException();
                }
                return "a * b = " + (a*b);
            case '/':
                if(b == 0){
                    throw new DivideByZeroException();
                }
                return "a / b = " + (a/b);
            case '%':
                return "a % b = " + (a%b);
            default:
                throw new InvalidInputException();
        }
    }
    public static void main(String[] args){
        int i = 0;
        while(i<6){
            try {
                System.out.println(calculate());
            } catch (Exception e) {
                System.out.println("Error Message:- " + e.getMessage());
                i++;
            }
        }
        System.out.println("Thx for using our services.");
    }
}

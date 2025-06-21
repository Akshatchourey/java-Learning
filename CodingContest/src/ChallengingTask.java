import java.util.Scanner;
import java.util.InputMismatchException;

class UserDefined extends Exception{
    @Override
    public String getMessage(){
        return "Numerator  is zero 0.";
    }
}

public class ChallengingTask{
    public static void divide() throws UserDefined, ArithmeticException, InputMismatchException{
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0) {
                throw new UserDefined();
            }
            if (b == 0) {
                throw new ArithmeticException("Denominator cannot be zero.");
            }
            int c = a / b;
            System.out.println("ans is: " + c);
        }
        catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid input.");
        }
    }

    public static void main(String[] args){
        try {
            divide();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (UserDefined e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

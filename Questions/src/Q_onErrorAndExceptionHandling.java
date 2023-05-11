import java.util.Scanner;

class CostumeException extends Exception{
    @Override
    public String getMessage(){
        return "throwing the costume exception for reaching max retries.";
    }
}
public class Q_onErrorAndExceptionHandling{
    public static void retriesCheck(int i) throws CostumeException{
        if(i == 5){
            throw new CostumeException();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Q1 part1-->syntax error
        //a=5;
        //  part2-->logical error
        //System.out.println("Sum of two no a=5 and b=6 is " + 5*6);
        //  part3-->run time error
        //System.out.println("Division of two no a=5 and b=0 is " + 5/0);

        //Q2
        try{
             // int a = 666/0;
            // throw new IllegalArgumentException();
        }catch(ArithmeticException e){
            System.out.println("haha");
        }catch(IllegalArgumentException e) {
            System.out.println("hehe");
        }
        //Q3
        int[] arr = {5,6,8};
        int index;
        boolean check = true;int i = 0;
        while(check && i<5){
            try{
                System.out.print("Enter the index you want to check:- "); index = sc.nextInt();
                System.out.println("Value at give index is " + arr[index]);
                break;
            }catch(Exception e){
                System.out.println("Index entered is out of range.");
                i++;
            }
        }
        if(i==5){
            // System.out.println("Error");
            try{
                throw new CostumeException();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        //Q4 done
        //Q5
        try {
            retriesCheck(i);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Practice questions is done.\nbye.");
        }
    }
}

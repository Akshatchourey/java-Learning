import java.util.Scanner;

public class ex1Collage {
    public static int question1(int a, int b, int c){
        int ave = (a+b+c)/3;
        System.out.print("the average of no is");
        return ave;
    }
    public static int question2(int a){
        int sumOdd = 0;
        for(int i=1;i<=a;i++){
            if(i%2 !=0) {
                sumOdd += i;
            }
        }
        return sumOdd;
    }
    public static void question3(int a, int b){
        System.out.println(Math.max(a, b));
    }
    public static int question4(int a){
        return 2*a*4; //4 === 3.14150
    }
    public static void question5(int a){
        if(a>18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("you are not eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three nos:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // System.out.println(question1(a,b,c));
        // System.out.println(question2(a));
        // question3(a,b);
        // System.out.println(question4(a));
        // question5(a);
    }
}

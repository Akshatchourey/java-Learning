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
    public static void question6(int a){
        do{
            System.out.println(a);
            a++;
            if(a==10){
                System.out.println("The End..");
                break;
            }
        }while(a>-2);
    }
    public static void question7(){
        int po=0, ne=0, ze=0 ;
        Scanner sc = new Scanner(System.in);
        int y = 1;
        while(y==1){
            System.out.print("enter your no:-");
            int no = sc.nextInt();
            if(no>0){
                po++;
            } else if(no<0){
                ne++;
            }
            else{
                ze++;
            }
            System.out.print("enter 1 to continue, 0 to see result");
            y = sc.nextInt();
        }
        System.out.println("Positives : " + po);
        System.out.println("Negatives : " + ne);
        System.out.println("Zeros : " + ze);
    }
    public static void question8(int a, int b){
        System.out.println(Math.pow(a,b)); // a**b
    }
    public static void question9(int a, int b){
        int no1 = Math.min(a,b);
        int no2 = Math.max(a,b);
        for(int i=no1;i>0;i--){
            if(no1%i == 0){
                if(no2%i == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static void question10(int a){
        int no=a-2;
        int x=1, b=1 ;
        System.out.print("1 1 ");
        while(no>0){
            System.out.print(x+b+" ");
            int u=b; b = x+b; x=u;
            no--;
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
        // question6(a);
        // question7();
        // question8(a,b);
        // question9(a,b);
        // question10(a);
    }
}

import java.util.Scanner;
public class HollowRectange {

    // My Method--->
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bredth of rectangle:");int b = sc.nextInt();
        System.out.print("Enter length of rectangle:");int l = sc.nextInt();
        for(int i=1;i<=l;i++){
            if(i==1 || i==l){
                for(int j=1;j<=b;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                System.out.print("*");
                for(int a=1;a<=b-2;a++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }  */

    // Mam Method---->
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bredth of rectangle:");int b = sc.nextInt();
        System.out.print("Enter length of rectangle:");int l = sc.nextInt();
        // Outter loop
        for(int i=1;i<=l;i++){
            // Inner loop
            for(int j=1;j<=b;j++){
                // Cell--->(i,j)
                if(i==1 || i==l || j==1 || j==b){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

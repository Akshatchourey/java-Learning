import java.util.Scanner;

public class nPrimrNE{
    public static int ABC(int i,int n){
        for(int j=2;j<i;j++){
            if(i%j==0){
                return 0;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no:-");int n=sc.nextInt();
        System.out.print(0+" ");
        for(int i=1;i<=n;i++){
            int check=ABC(i,n);
            if(check==0){
                n++;
            }
            else{
                System.out.print(check+" ");
            }
        }
        String check;
        do{
            System.out.print("\nenter the no you want to ree check :-");int no=sc.nextInt();
            for(int t = 1; t<=no; t++){
                if(no%t == 0){
                    System.out.println(t);
                }
            }
            System.out.print("Do you want to ree check y/n :-");check = sc.next();
        }while(check.equals("y"));
    }
}

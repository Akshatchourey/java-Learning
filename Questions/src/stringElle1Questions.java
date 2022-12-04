import java.util.Scanner;
public class stringElle1Questions {
    //Question 1
    /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        String [] name=new String[size];
        int ans=0;

        for(int x;i++){
            name[i]= sc.next();
            ans += name[i].length();
        }
        System.out.println(ans);
    }*/

    //Question 2
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sen=new StringBuilder(sc.nextLine());
        for(int i=0;i<sen.length();i++){
            if(sen.charAt(i)=='e'){
                sen.setCharAt(i,'i');
            }
        }
        System.out.println(sen);
    }

    //Question 3
    /*
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter email adress:");String sen=sc.next();
        StringBuilder result= new StringBuilder();
        for(int i=0;i<sen.length();i++){
            if(sen.charAt(i)=='@'){
                break;
            }
            result.append(sen.charAt(i));
        }
        System.out.println("user name is:"+result);
    }*/
}

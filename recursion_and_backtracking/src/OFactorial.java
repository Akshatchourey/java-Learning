public class OFactorial {
    /*public static int rec(int ans,int no){// ans=5*4*3*2.
        if(no==1){
            return ans;
        }
        ans *= no;
        return rec(ans,no-1);
    }
    public static void main(String[] args) {

        System.out.println(rec(1,5));
    }*/

    public static int factorial(int n){// ans=5*4!
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
}

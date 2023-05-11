public class OXToThePowerN {
    // stack height = n+1
    /* public static int pow(int x, int n) {
        if (x == 0) {
            return 0;
        }
        else if (n==0){
            return 1;
        }
        return x*pow(x, n-1);
    }*/

    //stack height = n/2
    /*public static int pow(int x, int n){
        if(x == 0){
            return 0;
        } else if (n == 0){
            return 1;
        } else if (n == 1){
            return x;
        }
        return x*x*pow(x, n-2);
    }*/
    //stack height = log(n)
    public static int pow(int x, int n){
        if(x == 0){
            return 0;
        } else if (n == 1){
            return x;
        }
        if(n %2 ==0){//if n is even
            return pow(x,n/2)*pow(x,n/2);
        }
        else{//if n is odd
            return pow(x,n/2)*pow(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(5,5));
    }
}

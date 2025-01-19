public class powXN{
    static double helper(double x, int n){
        if(n == 1) return x;
        double a = helper(x, n/2);
        if((n&1) == 0) return a*a;
        return a*a*x;
    }
    static double myPow(double x, int n){
        if(x == 0) return 0;
        if(n == 0) return 1;
        if(n > 0) return helper(x, n);
        else return 1/helper(x, -1*n);
    }
    public static void main(String[] args){
    }
}

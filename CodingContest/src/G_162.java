public class G_162{
    static int countWays(int n){
        long ans = 0, numbers = 1, tens = 10;
        for(int i=0;i<n-1;i++){
            ans = (int)numbers%1000000007;
            numbers = numbers*9 + tens;
            tens *= 10;
        }
        return (int)(numbers-ans);
    }
    static boolean isPrime(int n){
        if(n == 1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    static long maximumSum(int n, int k){
        if(n == 1 && k == 1) return 1;
        long ans = 0;
        while(n>0 && k>0){
            if((n&1) == 1 && !isPrime(n)){
                ans += n;
                k--;
            }
            n--;
        }
        if(k != 0) return -1;
        return ans;
    }
    public static void main(String[] args){
        // Q1 - not working because the ans they want is not thw ans i am giving.
//        System.out.println(countWays(2));
        // Q2 - Done
        System.out.println(maximumSum(12345, 123));
        // Q3 - Do it later but can't keep it open
    }
}

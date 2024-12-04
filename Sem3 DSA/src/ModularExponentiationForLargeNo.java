public class ModularExponentiationForLargeNo{
    static long myCode(long x, long n, long m){
        long ans = x, extra = 1;
        while(n != 1){
            if((n&1) == 1) extra *= ans;
            ans *= ans;
            n /= 2;

            if(ans > m) ans %= m;
            if(extra > m) extra %= m;
        }
        return (ans*extra)%m;
    }
    static long shortCode(long x, long n, long m){
        long ans = 1;
        while(n > 0){
            if((n&1) == 1) ans = (ans*x)%m;
            x = (x*x)%m;
            n /= 2;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(myCode(7,20,5));
        System.out.println(shortCode(7,20,5));
    }
}

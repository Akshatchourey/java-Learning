public class PowerOfNumbers{
    public static void main(String[] args){
        long mod = 1000000007;
        System.out.println(Math.pow(2, 200)%mod);
        long n = 2; long r = 200; long intermediate = 1;
        while(r != 1){
            if(r%2 != 0){
                intermediate = (n*intermediate)%mod;
                r--;
            }
            n = (n*n)%mod;
            r /= 2;
        }
        System.out.println((n*intermediate)%mod);
    }
}

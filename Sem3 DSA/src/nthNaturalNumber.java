public class nthNaturalNumber {
    static long ans1(long n){
        long a = n, ans = 0, digits, temp, b; // no of digits in a. b = 9^digit-1
        while(a >= 9){
            digits = (int) Math.log10(a) + 1;
            b = (long) Math.pow(9, digits);
            if(b > a){
                digits -= 1;
                b = (long) Math.pow(9, digits);
            }

            temp = (int)a/b;
            ans += temp * Math.pow(10, digits);
            a -= b*temp;
        }
        return ans+a;
    }

    static long ans2(long n){
        long[] d = {0, 9, 81, 729, 6561, 59049, 531441, 4782969, 43046721,
                387420489, 3_486_784_401L, 31381059609L, 282429536481L};
        long a = n, ans = 0, temp, b;
        int i;
        for(i=0;i<d.length;i++){
            if(d[i] > a) break;
        }
        i--; // digits == i, d[i] == xxDigits
        while(a >= 9){
            b = d[i];
            temp = Math.floorDiv(a, b);
            ans += temp * Math.pow(10, i);
            a -= b*temp;
            i--;
        }
        return ans+a;
    }
    public static void main(String[] args){
        long n = 1_000_000_000_000L;
//        3_477_151_372_431
        System.out.println(ans2(n));
//        System.out.println(ans1(n));
    }
}

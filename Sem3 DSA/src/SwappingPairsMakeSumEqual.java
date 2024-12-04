import java.util.Arrays;

public class SwappingPairsMakeSumEqual{
    static long helper(long[] a, int n, long[] b, int m){
        long sum1 = 0, sum2 = 0;
        for(int i = 0;i<Math.min(n, m);i++){
            sum1 += a[i];
            sum2 += b[i];
        }
        if(n>m) for(int i=m;i<n;i++) sum1 += a[i];
        if(m>n) for(int i=n;i<m;i++) sum2 += b[i];

        if(sum1 == sum2) return 1;
        if((sum1+sum2)%2 != 0) return -1;
        Arrays.sort(a);
        Arrays.sort(b);

        long u = Math.max(sum1, sum2), v = Math.min(sum1, sum2);
        int x = 0, y = b.length-1;
        while(x < a.length && y >= 0){
            if(a[x] + b[y] == u-v) return 1;
            else if(a[x] + b[y] > u-v) y--;
            else x++;
        }
        return -1;
    }
    public static void main(String[] args){
        int n = 6, m = 4;
        long[] a = {4, 1, 2, 1, 1, 2};
        long[] b = {3, 6, 3, 3};
        System.out.println(helper(a,n,b,m));
    }
}

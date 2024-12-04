public class MaxSumConfiguration{
    static long helper(int[] a, int n){
        long curr_sum = 0, next_sum, sum = 0;
        for(int i=0;i<n;i++){
            curr_sum += (long)a[i]*i;
            sum += a[i];
        }
        long ans = curr_sum;
        for(int i=0;i<n;i++){
            next_sum = curr_sum - (sum - a[i]) + (long)a[i]*(n-1);
            curr_sum = next_sum;
            ans = Math.max(ans, next_sum);
        }
        return ans;
    }
    public static void main(String[] args){
        int n = 4;
        int[] a = {8, 3, 1, 2};
        System.out.println(helper(a, n));
    }
}

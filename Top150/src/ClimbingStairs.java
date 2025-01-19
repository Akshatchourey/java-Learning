public class ClimbingStairs{
    static int memorization(int n, int[] dp){
        if(n < 0) return 0;
        if(dp[n] != 0) return dp[n];
        if(n == 0) return 1;
        dp[n] = memorization(n-1, dp) + memorization(n-2, dp);;
        return dp[n];
    }
    static int tabulation(int n){
        int a = 1, b = 1;
        for(int i=0;i<n-1;i++){
            b = a + b;
            a = b - a;
        }
        return b;
    }
    static int climbStairs(int n){
        return memorization(n, new int[n+1]);
    }
    public static void main(String[] args){
        System.out.println(climbStairs(7));
        System.out.println(tabulation(7));
    }
}

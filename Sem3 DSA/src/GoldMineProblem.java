import java.util.Arrays;

public class GoldMineProblem{
    static int fillDP(int n, int m, int[][] arr, int[][] dp){
        if(n<0 || n == arr.length) return 0;
        if(dp[n][m] != -1) return dp[n][m];
        int a, b, c, d;
        a = fillDP(n-1,m+1,arr,dp);
        b = fillDP(n,m+1,arr,dp);
        c = fillDP(n+1,m+1,arr,dp);
        d = arr[n][m] + Math.max(a, Math.max(b, c));
        dp[n][m] = d;
        return d;
    }
    public static void main(String[] args){
        int n = 3, m = 3;
        int[][] arr = {{1, 3, 3}, {2, 1, 4}, {0, 6, 4}};

        int[][] dp = new int[n][m];
        int[] temp = new int[m];
        Arrays.fill(temp, -1);
        for(int i=0;i<n;i++) dp[i] = temp.clone();
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) dp[i][m-1] = arr[i][m-1];
        for(int i=0;i<n;i++){
            ans = Math.max(ans, fillDP(i, 0, arr, dp));
        }

        System.out.println(ans);
    }
}

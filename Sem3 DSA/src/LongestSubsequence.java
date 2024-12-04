// Longest common Subsequence-1
// NOT UNDERSTOOD
public class LongestSubsequence{
    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5};
        int n = a.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++)dp[i] = 1;

        // Fill dp array NOT UNDERSTOOD
        for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
                if (Math.abs(a[i] - a[j]) == 1){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        for (int k: dp) ans = Math.max(ans, k);

        System.out.println(ans);
    }

}

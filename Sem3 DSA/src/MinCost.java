public class MinCost {
    static int lcs(String s1, String s2, int m, int n,int [][] dp){
        if(m == 0 || n == 0){
            return 0;
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            dp[m-1][n-1] = 1 + lcs(s1, s2, m-1, n-1, dp);
            return dp[m-1][n-1];
        }
        else{
            dp[m][n] = Math.max(lcs(s1, s2, m-1, n, dp), lcs(s1, s2, m, n-1, dp));
            return dp[m][n];
        }
    }
    static String lcsString(String s1, String s2, int m, int n){
        if(m == 0 || n == 0){
            return "";
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return lcsString(s1, s2, m-1, n-1) + s1.charAt(m-1);
        }
        else{
            String a = lcsString(s1, s2, m-1, n);
            String b = lcsString(s1, s2, m, n-1);
            return (a.length() > b.length()) ? a:b;
        }
    }
    public static void main(String[] args){
        // min cost to make string identical
        int [][] dp = new int[6][7];
        System.out.println(lcs("aggtab", "gxtxayb", 6, 7, dp));

        for(int[] k : dp){
            for(int y : k) System.out.print(y + " ");
            System.out.println("");
        }
        System.out.println(lcsString("aggtab", "gxtxayb", 6, 7));
    }
}

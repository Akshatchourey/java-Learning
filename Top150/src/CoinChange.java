import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoinChange{
    static int helper(int[] arr, int amount, Map<Integer, Integer> dp){
        if(amount == 0) return 0;
        if(amount < 0) return Integer.MAX_VALUE;
        if(dp.containsKey(amount)) return dp.get(amount);
        int minNo = Integer.MAX_VALUE;
        for(int k:arr){
            int currNo = helper(arr, amount-k, dp);
            if(currNo != Integer.MAX_VALUE){
                minNo = Math.min(minNo, currNo + 1);
            }
        }
        dp.put(amount, minNo);
        return minNo;
    }
    static int coinChange(int[] coins, int amount){
        int ans = helper(coins, amount, new HashMap<>());
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    static int helper2(int[] arr, int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            for(int coin:arr){
                if(i-coin >= 0 && dp[i-coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], 1+dp[i-coin]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1:dp[amount];
    }
    public static void main(String[] args){
        System.out.println(coinChange(new int[]{186,419,83,408}, 6249));
    }
}

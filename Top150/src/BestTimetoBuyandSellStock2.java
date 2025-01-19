public class BestTimetoBuyandSellStock2{
    static int helper(int[] arr, int buy, int idx, int[][] dp){
        if(idx == arr.length) return 0;

        if(dp[idx+1][1] == 0) dp[idx+1][1] = helper(arr, 1, idx+1, dp);
        if(dp[idx+1][0] == 0) dp[idx+1][0] = helper(arr, 0, idx+1, dp);

        int temp1 = dp[idx+1][1];
        int temp2 = dp[idx+1][0];

        if(buy == 0){
            return Math.max(temp1 - arr[idx], temp2);
        }else{
            return Math.max(temp1, temp2 + arr[idx]);
        }
    }
    static int helper2(int[] arr){
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }
    static int maxProfit(int[] arr){
        int[][] dp = new int[arr.length+1][2];
        return helper(arr, 0, 0, dp);
    }
    public static void main(String[] args){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(helper2(new int[]{7,1,5,3,6,4}));
    }
}

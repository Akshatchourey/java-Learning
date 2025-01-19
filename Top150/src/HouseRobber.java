public class HouseRobber{
    static int helper(int[] arr, int[] dp, int idx){
        if(idx >= arr.length) return 0;
        if(dp[idx+2] == 0){
            dp[idx+2] = helper(arr, dp, idx+2);
        }
        if(dp[idx+1] == 0){
            dp[idx+1] = helper(arr, dp, idx+1);
        }
        return Math.max(dp[idx+2] + arr[idx], dp[idx+1]);
    }
    static int helper2(int[] arr){
        int a = 0, b = 0, c = 0;
        for(int i=arr.length-1;i>=0;i--){
            a = arr[i] + c;
            c = b;
            b = Math.max(a, b);
        }
        return b;
    }
    static int rob(int[] arr){
        return helper(arr, new int[arr.length+2], 0);
    }
    public static void main(String[] args){
        System.out.println(rob(new int[]{1,2,3,1}));
        System.out.println(helper2(new int[]{1,2,3,1}));
    }
}

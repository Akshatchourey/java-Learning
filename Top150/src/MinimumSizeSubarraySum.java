public class MinimumSizeSubarraySum{
    static int minSubArrayLen(int target, int[] arr){
        int ans = Integer.MAX_VALUE, curr = 0, i = 0;
        for(int j=0;j<arr.length;j++){
            curr += arr[j];
            while(curr >= target){
                ans = Math.min(ans, j-i+1);
                curr -= arr[i++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0:ans;
    }
    public static void main(String[] args){
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}

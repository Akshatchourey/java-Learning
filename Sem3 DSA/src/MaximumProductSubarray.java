public class MaximumProductSubarray{
    static long maxProduct(int[] arr, int n){
        long ans=Integer.MIN_VALUE, multiply;
        int x=0;
        for(int j=0;j<n;j++){
            multiply = arr[j];
            ans = Math.max(ans, multiply);
            if(multiply == 0){
                x = j+1;
                continue;
            }
            for(int i=j-1;i>=x;i--){
                multiply *= arr[i];
                ans = Math.max(ans, multiply);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(maxProduct(new int[]{0,0,-5,0,0}, 5));
    }
}

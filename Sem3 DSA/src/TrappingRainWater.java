public class TrappingRainWater{
    public static void main(String[] args){
        int n = 5; int[] arr = {5,4,3,2,7};
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int currentMax = arr[0];
        for(int i=0;i<n;i++){
            leftMax[i] = currentMax;
            currentMax = Math.max(currentMax, arr[i]);
        }
        currentMax = arr[n-1];
        for(int i=n-1;i>=0;i--){
            rightMax[i] = currentMax;
            currentMax = Math.max(currentMax, arr[i]);
        }

        long ans = 0;
        for(int i=0;i<n;i++){
            ans += Math.max(0, Math.min(leftMax[i], rightMax[i]) - arr[i]);
        }
        System.out.println(ans);
    }
}

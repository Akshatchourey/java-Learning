import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons{
    static int findMinArrowShots(int[][] arr){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int ans = 1, end = arr[0][1];
        for(int[] k:arr){
            if(k[0] > end){
                ans++;
                end = k[1];
            }
        }
        return ans;
    }
    public static void main(String[] args){

    }
}

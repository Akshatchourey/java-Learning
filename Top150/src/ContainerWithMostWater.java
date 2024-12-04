public class ContainerWithMostWater{
    static int maxArea(int[] arr){
        int i = 0, j = arr.length-1;
        int ans = Integer.MIN_VALUE;
        while(i != j){
            ans = Math.max(ans, (j-i)*Math.min(arr[i], arr[j]));
            if(arr[i] < arr[j]) i++;
            else j--;
        }
        return ans;
    }
    public static void main(String[] args){

    }
}

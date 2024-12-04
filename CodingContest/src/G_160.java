public class G_160{
    static int maxGoodSubarrays1(int n, int[] arr){
        if(n == 1) return 0;
        int count = 0, i;
        for(i=0;i<n-1;i++){
            if(arr[i+1] < arr[i]){
                i++;
                count++;
            }
        }
        return count;
    }
    static int maxGoodSubarrays(int n, int[] arr){
        int count = 0, i, c=0, no=0;
        for(i=n-1;i>=0;i--){
            if(c == 0){
                no = arr[i];
                c++;
            }else{
                if(arr[i] > no){
                    c--;
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        // Q1 Done
        // Q2 not seen
        // Q3 unable to do
        System.out.println(maxGoodSubarrays(3, new int[]{1,2,2}));
        // Q4 not seen
    }
}

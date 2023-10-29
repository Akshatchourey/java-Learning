public class G_116{
    static int min_operations(int n, int[] arr, int[] brr){
        int i = 0; int count = 0; int no;
        for(int j=0;j<n;j++){
            no = brr[j];
            for(int k=i;k<n;k++){
                if(arr[k] != 0) count++;
                if(arr[k] == no){
                    i = k; arr[k] = 0; no=0; break;
                }
            }
            if(no != 0){
                for(int k=0;k<i;k++){
                    if(arr[k] != 0) count++;
                    if(arr[k]==no){
                        i = k; arr[k] = 0; break;
                    }
                }
            }
        }
        return count;
    }
    static long maxSum(int n, int[] arr){
        long ans = 0; int no;
        long small = Integer.MAX_VALUE; int counter = 0;
        for(int i=0;i<n;i++){
            no = arr[i];
            if(no == 0) counter = -2;
            else if(no < 0 && counter != -2) counter++;
            no = (no < 0)? -no:no;
            long temp = no*(i+1)*(n-i);
            if(temp < small) small = temp;
            ans += temp;
        }
        if(counter%2 == 0){
            return ans;
        }else{
            return ans - (long)2*small;
        }
    }
    public static void main(String[] args){
        // Q1 Done
        int n = 3; int[] arr = {1, 2, 3}; int[] brr = {2, 1, 3};
//        System.out.println(min_operations(n,arr,brr));
        // Q2
        System.out.println(maxSum(3, new int[]{-1,-2,-3}));
        // Q3 Not yet fully seen
//        System.out.println(5^6);
    }
}

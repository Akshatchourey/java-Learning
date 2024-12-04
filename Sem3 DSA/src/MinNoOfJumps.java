public class MinNoOfJumps {
    static int helper(int[] arr){
        int idx = arr[0];
        int i = 1, ans = 0;
        int i_midx = 0, midx = Integer.MIN_VALUE;
        while(idx != 0 && i<=arr.length-1){
            idx--;
            if(arr[i]+i >= midx+i_midx){
                midx = arr[i];
                i_midx = i;
            }
            if(idx == 0){
                ans++;
                idx = midx;
                i = i_midx;
                midx = Integer.MIN_VALUE;
                if(i_midx == arr.length-1) return ans;
            }
            if(i + idx >= arr.length-1) return ans+1;
            i++;
        }

        if(i + idx > arr.length-1) return ans;
        else return -1;
    }
    static int optimumAns(int[] arr){
        int n = arr.length;
        if(n == 1) return 0;

        int i = 0, end = 0, jump = 0, max = arr[0];
        while(i<=end){
            if(i + arr[i] > max) max = i + arr[i];
            if(i == end){
                if(max<n-1){
                    end = max;
                    jump++;
                }
                else return ++jump;
            }
            i++;
        }
        return -1;
    }
    public static void main(String[] args){
        int n = 11;
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(helper(arr));
        System.out.println(optimumAns(arr));
    }
}

// In my way...

import java.util.Arrays;

public class SortQuick1 {
    static int[] sortPivotEnd(int[] arr){
        // Base case
        if(arr.length == 1 || arr.length == 0){return arr;}
        // sort before and after
        int i = 0; int lastE = arr[arr.length-1];
        for(int j=0;j<arr.length;j++){
            if(arr[j] <= lastE){
                int no = arr[j];
                arr[j] = arr[i];
                arr[i] = no;
                i++;
            }
        }
        //divide
        int[] a = new int[i-1];
        int[] b = new int[arr.length-i];
        i--;
        for(int u=0;u<arr.length;u++){
            if(u<i){
                a[u] = arr[u];
            }
            else if(u>i){
                b[u-i-1] = arr[u];
            }
        }
        // sort partition one and two
        int[] A = sortPivotEnd(a);
        int[] B = sortPivotEnd(b);

        int[] ans = new int[arr.length];
        for(int u=0;u<arr.length;u++){
            if(u<i){
                ans[u] = A[u];
            }
            else if(u == i){
                ans[u] = lastE;
            }
            else{
                ans[u] = B[u-i-1];
            }
        }

        return ans;
    }
    public static void main(String[] args){
//        int[] asq = {38,27,21,61,50,21,11,25};
        int[] asq = {11,10,9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(sortPivotEnd(asq)));
    }
}

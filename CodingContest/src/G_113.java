import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class G_113{
    static int maximumNumber(int n) {
        int num = n;
        Stack<Integer> st = new Stack<>();
        while(num != 0) {
            int remainder = num % 10;
            st.add(remainder);
            num = num / 10;
        }
        int no = 0;
        while(st.size() != 0){
            if(st.pop() == 7){
                no = 2;
                no *=Math.pow(10, st.size());
                break;
            }
        }
        return n+no;
    }
    static boolean checkSorted(int n, int[] arr){
        if(n < 2) return false;
        int[] asq = Arrays.copyOfRange(arr,0,n);
        Arrays.sort(asq);
        int swap = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != asq[i]){
                if(swap == 2) return false;
                swap++;
                int idx = i;
                for(int j=i+1;j<n;j++){
                    if(arr[j] == asq[i]){
                        idx = j; break;
                    }
                }
                arr[idx] = arr[i];
                arr[i] = asq[i];
            }
        }
        return swap == 2 || swap == 0;
    }
    static int totalPairs1(int[] arr, int x, int y){
        Arrays.sort(arr);
        int x1; int y1; int ans = 0; int no;
        for(int i=0;i<arr.length;i++){
            no = arr[i];
            x1 = (x+no-1)/no; y1 = y/arr[i];
            for(int j=0;j<i;j++){
                if(arr[j] >= x1){
                    if(arr[j] <= y1) ans++;
                    else break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        // Q1 Done
        System.out.println(maximumNumber(99797979));
        // Q2 Done logic-> see and swap with the copiedSorted array exactly two times.
        int n = 4;
        int[] arr = {4,3,2,1};
        System.out.println(checkSorted(n, arr));

        // Q3 Done To find ceilDivide(x/n) do this (x+n-1)/n
        System.out.println(totalPairs1(new int[]{3,5,5,2,6},8,13));
    }
}

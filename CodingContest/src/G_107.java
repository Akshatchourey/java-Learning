import java.util.ArrayList;
import java.util.Collections;

public class G_107{
    static long gatheringCost(int n, int[] weightArr){
        int k = 1;
        long tempCost = 0;
        for(int i=0;i<n;i++){
            tempCost += (long) weightArr[i]*i;
        }
        long cost = tempCost;
        while(true){
            tempCost = 0;
            for(int i=0;i<n;i++) {
                tempCost += (long) weightArr[i] * Math.abs(k-i);
            }
            if(tempCost<cost){
                cost = tempCost;
            }else{
                return cost;
            }
            k++;
        }
    }
    static int nBlocks(int w){
        int ans = 0; int p = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while((int)(Math.pow(2, p)) <= w){
            arr.add((int)Math.pow(2, p));
            p++;
        }
        Collections.reverse(arr);
        while(w != 0){
            for(int k:arr){
                if(k <= w && w-k >= 0){
                    w -= k;
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        // Q1 Done
        System.out.println(nBlocks(5));
        // Q2 Time limit exceeded
        int N = 5;
        int[] weightArr= {1, 5, 4, 2, 10};
        System.out.println(gatheringCost(N,weightArr));

        //Q3 not viewed(v. bad)
    }
}

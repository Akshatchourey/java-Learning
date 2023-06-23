import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class G_106{
    // Q1 Done problem 1 is solved.
    static int gcd(int x, int y){ // gcd == hcf, the greatest common divisor or highest common factor.
        if(y == 0)return x;
        return gcd(y,x%y);
    }
    static long minimumBuckets(int N, int[] arr){
        long totalUnit = 0;
        int minCommonDivisor = arr[0];
        for(int k:arr){
            totalUnit += k;
            minCommonDivisor = gcd(minCommonDivisor, k);
        }
        return totalUnit/minCommonDivisor;
    }
    static String cyclicTree(int n, int[][] edges){
        Map<Integer, Integer> myNumbers = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                int no = edges[i][j];
                if(myNumbers.containsKey(no)){
                    myNumbers.put(no, myNumbers.get(no)+1);
                }else{
                    myNumbers.put(no, 1);
                }
            }
        }
        for(int k:myNumbers.values()){
            if(k != 2) return "Yes";
        }
        return "No";
    }
    public static void main(String[] args){
        int[] arr = {2, 6, 4, 10};
        System.out.println(minimumBuckets(arr.length, arr));

        // Q2 Done
        int[][] edges = {{1,2},{2,3},{3,4},{4,1}};
        System.out.println(cyclicTree(4, edges));

        // Q3 is from graph(I have not yet studied).
    }
}

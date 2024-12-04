import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals{
    static int[][] merge(int[][] arr){
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        int a = arr[0][0], b = arr[0][1];
        for(int[] k:arr){
            if(b < k[0]){
                ans.add(new int[]{a, b});
                a = k[0];
                b = k[1];
            }else b = Math.max(b, k[1]);
        }
        ans.add(new int[]{a,b});
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args){
        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }
}

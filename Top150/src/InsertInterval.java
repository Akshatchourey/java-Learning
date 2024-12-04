import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval{
    static int[][] insert(int[][] arr, int[] new_arr){
        List<int[]> ans = new ArrayList<>();
        int i = 0, a = new_arr[0], b = new_arr[1];
        if(arr.length == 0 || new_arr[0] > arr[arr.length-1][1]){
            ans.addAll(Arrays.stream(arr).toList());
            i = arr.length;
        }
        else if(new_arr[0] < arr[0][0]){}
        else{
            while(new_arr[0]>arr[i][1]){
                ans.add(new int[]{arr[i][0],arr[i][1]});
                i++;
            }
            a = Math.min(a, arr[i][0]);
            if(b >= arr[i][0]){
                b = Math.max(b, arr[i][1]);i++;
            }
        }
        for(i=i;i<arr.length;i++){
            if(b < arr[i][0]){
                ans.add(new int[]{a, b});
                a = arr[i][0];
                b = arr[i][1];
            }else b = Math.max(b, arr[i][1]);
        }
        ans.add(new int[]{a,b});
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args){
        System.out.println(Arrays.deepToString(insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}},
                new int[]{4, 8})));
    }
}

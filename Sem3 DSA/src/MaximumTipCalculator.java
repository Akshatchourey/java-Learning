import java.util.Arrays;
import java.util.Comparator;

public class MaximumTipCalculator{
    public static void main(String[] args){
        int n = 12, x = 11, y = 7;
        int[] arr = {3, 6, 5, 1, 9, 9, 3, 7, 3, 4, 6, 1};
        int[] brr = {6, 6, 1, 4, 5, 2, 5, 1, 9, 4, 9, 4};

        int[][] crr = new int[n][2];
        for(int i=0;i<n;i++){
            crr[i][0] = Math.abs(arr[i]-brr[i]);
            crr[i][1] = i;
        }
        Comparator<int[]> comp = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[0] < o2[0]) return 1;
                return -1;
            }
        };
        Arrays.sort(crr, comp);
        int idx; long ans=0;
        for(int i=0;i<n;i++){
            idx = crr[i][1];
            if(arr[idx] > brr[idx]){
                if(x != 0){
                    ans += arr[idx];
                    x--;
                }else{
                    ans += brr[idx];
                    y--;
                }
            }else{
                if(y != 0){
                    ans += brr[idx];
                    y--;
                }else{
                    ans += arr[idx];
                    x--;
                }
            }
        }
        System.out.println(ans);


        /*  // both are correct code...
        int i = 0; long ans = 0;
        while(i < n && x != 0 && y != 0){
            if(arr[crr[i][1]] > brr[crr[i][1]]){
                ans += arr[crr[i][1]];
                x--;
            }else{
                ans += brr[crr[i][1]];
                y--;
            }
            i++;
        }
        if(i == n) System.out.println(ans);
        if(x != 0){
            for(int j=i;j<n;j++) ans += arr[crr[j][1]];
        }else{
            for(int j=i;j<n;j++) ans += brr[crr[j][1]];
        }
        System.out.println(ans);

         */
    }
}

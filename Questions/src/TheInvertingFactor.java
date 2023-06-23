import java.util.Arrays;

public class TheInvertingFactor{
    public static void main(String[] args){
        int[] arr = {48, 23, 100, 71, 56, 89};
        int k;
        for(int i=0;i<arr.length;i++){
            k = arr[i]; int inverseNo = 0;
            for(;k != 0;k /= 10){
                int digit = k % 10; // this gets last digit
                inverseNo = inverseNo * 10 + digit;
            }
            arr[i] = inverseNo;
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        int ans = arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            int no = arr[i + 1] - arr[i];
            if(ans > no){
                ans = no;
            }
        }
        System.out.println(ans);
    }
}

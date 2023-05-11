import java.util.Arrays;

public class SortSelection {
    public static void main(String[] args){
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int minIdx;
        for(int i=0;i<arr.length-1;i++){
            minIdx = i;
            for(int j=i;j<arr.length;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx = j;
                }
            }
            int no = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = no;
        }

        System.out.println(Arrays.toString(arr));
    }
}

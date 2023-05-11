import java.util.Arrays;

public class SortInsertion {
    public static void main(String[] args){
        int[] arr = {6,2,3,5,4,1};

        for(int i=1;i<arr.length;i++){
            int no = arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j] > no){
                    arr[j+1] = arr[j];
                    arr[j] = no;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

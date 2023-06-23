// In authentic way...

import java.util.Arrays;

public class SortQuick3{
    public static void sort(int[] arr, int start, int end){
        if(start < end){
            int partition = partition(arr, start, end);
            sort(arr,start,partition-1);
            sort(arr,partition+1,end);
        }
    }
    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start-1;
        for(int j=start;j<=end;j++){
            if(arr[j] <= pivot){
                i++;
                int no = arr[j];
                arr[j] = arr[i];
                arr[i] = no;
            }
        }
        return i;
    }

    public static void sortMid(int[] arr, int start, int end){
        if(start < end){
            int partition = partitionMid(arr,start,end);
            sortMid(arr,start,partition-1);
            sortMid(arr,partition+1,end);
        }
    }
    static int partitionMid(int[] arr, int start, int end){
        int midIdx = Math.floorDiv(start+end, 2);
        int i = start-1;
        for(int u=start;u<=end;u++){
            if(arr[u] <= arr[midIdx] && u != midIdx){
                i++;
                if(i == midIdx){i++;}
                int no = arr[u];
                arr[u] = arr[i];
                arr[i] = no;
            }
        }
        if(midIdx > i){i++;}
        int no = arr[i];
        arr[i] = arr[midIdx];
        arr[midIdx] = no;
        return i;
    }

    public static void main(String[] args){
        int[] asq = {4,1,3,9,7};
//        sort(asq,0,asq.length-1);
        sortMid(asq,0,asq.length-1);
        System.out.println(Arrays.toString(asq));
    }
}

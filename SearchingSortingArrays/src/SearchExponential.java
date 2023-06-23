import java.util.Arrays;

public class SearchExponential{
    static int binarySearch(int[] arr,int low, int high, int searchNo){
        int mid;
        while(low < high){
            mid = Math.floorDiv(low+high, 2);
            if(searchNo == arr[mid]){return mid;}
            else if(searchNo < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    static int exponentialSearch(int[] arr, int n, int searchNo){// n = size of arr
        if(arr[0] == searchNo){return 0;}
        int i = 1;
        while(i < n && arr[i] <= searchNo){
            i = i*2;
        }
        return binarySearch(arr,i/2,Math.min(i, n-1), searchNo);
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5,56,4,3,23,5,4,54634,56,32,56,48,5,5,68,65};
        SortQuick3.sortMid(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        int idx = exponentialSearch(arr,arr.length,65);
        if(idx == -1){
            System.out.println("Element your are searching for does not exist in the array.");
        }else{
            System.out.println("Index of the searchedNo in array is " + idx);
        }
    }
}

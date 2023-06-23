public class SearchLinearAndBinary {
    static void sort(int[] arr, int start, int end){
        if(start < end){
            int partitionIdx = partition(arr,start,end);
            sort(arr,start, partitionIdx-1);
            sort(arr,partitionIdx+1, end);
        }
    }
    static int partition(int[] arr,int start, int end){
        int i=start-1;
        for(int u=start;u<=end;u++){
            if(arr[u] <= arr[end]){
                i++;
                int no = arr[u];
                arr[u] = arr[i];
                arr[i] = no;
            }
        }
        return i;
    }

    static int linearSearch(int[] arr, int searchNo){ // returns index of searched element.
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == searchNo){
                return i;
            }
        }
        return -1;
    }
    static int binarySearchMy(int[] arr, int searchNo, int low, int high){
        if(low == high || low == high-1){
            if(searchNo == arr[low]){return low;}
            else if(searchNo == arr[high]){return high;}
            return -1;
        }
        int mid = Math.floorDiv(low+high, 2);
        if(searchNo == arr[mid]){return mid;}
        else if(searchNo < arr[mid]){
            return binarySearchMy(arr,searchNo,low,mid);
        }
        return binarySearchMy(arr,searchNo,mid,high);
    }
    static int binarySearch(int[] arr, int searchNo){
        int low = 0; int mid; int high = arr.length-1;
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

    public static void main(String[] args){
        int[] arr = {1, 3, 5,56,4,3,23,5,4,54634,56,32,56,48,5,65,5,68,65};
        int searchNo = 5; int idx = -1;
//        idx = linearSearch(arr,searchNo);

        sort(arr,0,arr.length-1); // to sort arr
//        idx = binarySearchMy(arr,searchNo,0,arr.length-1);
//        idx = binarySearch(arr,searchNo);
        if(idx == -1){
            System.out.println("Element your are searching for does not exist in the array.");
        }else{
            System.out.printf("Index of the no %d in array is %d",searchNo,idx);
        }
    }
}

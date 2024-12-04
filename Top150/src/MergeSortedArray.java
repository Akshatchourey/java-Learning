public class MergeSortedArray{
    static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m-1, j = n-1, x = m+n-1;
        while (i>=0 && j>=0){
            if(arr1[i] >= arr2[j]) arr1[x--] = arr1[i--];
            else arr1[x--] = arr2[j--];
        }
        while(i >= 0) arr1[x--] = arr1[i--];
        while(j >= 0) arr1[x--] = arr2[j--];
    }
    public static void main(String[] args){

    }
}

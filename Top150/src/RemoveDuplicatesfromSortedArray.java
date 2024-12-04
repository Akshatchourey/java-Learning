public class RemoveDuplicatesfromSortedArray{
    static int removeDuplicates(int[] arr){
        int no = arr[0], j = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != no){
                arr[j++] = arr[i];
                no = arr[i];
            }
        }
        return j;
    }
    public static void main(String[] args){
    }
}

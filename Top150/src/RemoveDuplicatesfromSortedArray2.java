public class RemoveDuplicatesfromSortedArray2{
    static int removeDuplicates(int[] arr){
        int no = arr[0], j = 1, count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == no && count == 0){
                arr[j++] = arr[i];
                count++;
            }
            else if(arr[i] != no){
                arr[j++] = arr[i];
                no = arr[i];
                count = 0;
            }
        }
        return j;
    }
    public static void main(String[] args){
        removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
    }
}

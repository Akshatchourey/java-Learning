public class RotateArray{
    static void rotate(int[] arr, int k){
        k = k % arr.length;
        int[] asq = new int[k]; int x = 0;
        for(int i=arr.length-k;i<arr.length;i++) asq[x++] = arr[i];
        for(int i=arr.length-1;i>=k;i--) arr[i] = arr[i-k];
        for(int i=0;i<k;i++) arr[i] = asq[i];
        for (int l:arr) System.out.print(l + " ");
    }
    public static void main(String[] args){
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }
}

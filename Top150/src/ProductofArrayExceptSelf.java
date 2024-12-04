public class ProductofArrayExceptSelf{
    static int[] productExceptSelf(int[] arr){
        int temp = 1;
        int[] ans = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            ans[i] = temp;
            temp *= arr[i];
        }
        temp = 1;
        for(int i=arr.length-1;i>=0;i--){
            ans[i] *= temp;
            temp *= arr[i];
        }
        for(int k:ans) System.out.print(k + " ");
        return ans;
    }
    public static void main(String[] args){
        // Q11
        productExceptSelf(new int[]{1,2,3,4});

    }
}

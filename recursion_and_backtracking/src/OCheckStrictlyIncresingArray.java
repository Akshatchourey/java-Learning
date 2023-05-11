public class OCheckStrictlyIncresingArray {
    public static boolean fun(int[] arr,int idx){
        if(arr.length-1==idx){
            return true;
        }
        if(arr[idx+1]>arr[idx]){
            return fun(arr,idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,20};
        System.out.println(fun(arr,0));

    }
}

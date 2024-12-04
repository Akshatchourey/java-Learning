public class IndexOfExtraElement{
    static int helper(int x, int y, int[] arr1, int[] arr2){
        if(y-1 == x){
            if(arr1[x] != arr2[x]) return x;
            else return y;
        }
        if(x == y) return x;

        if(arr1[(x+y)/2] == arr2[(x+y)/2]) return helper((x+y)/2,y,arr1,arr2);
        else return helper(x,(x+y)/2,arr1,arr2);
    }
    public static void main(String[] args){
        int n = 7;
        int[] arr1 = {2,4,6,8,9,10,12};
        int[] arr2 = {2,4,6,8,10,12};
        System.out.println(helper(0, n-1, arr1, arr2));
    }
}

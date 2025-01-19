public class FindMinimuminRotatedSortedArray{
    static int findMin(int[] arr){
        if(arr.length == 1) return arr[0];
        int min = arr[0];
        int l = 0, r = arr.length-1, m;
        while(l+1 != r){
            m = (l + r)/2;
            if(arr[m] > min) l = m;
            else{
                r = m;
                min = arr[m];
            }
        }
        return Math.min(min, Math.min(arr[l], arr[r]));
    }
    public static void main(String[] args){
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
    }
}

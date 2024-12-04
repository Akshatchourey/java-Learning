public class RemoveElement{
    static int removeElement(int[] arr, int val) {
        int ans = 0, j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != val){
                arr[j++] = arr[i];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
    }
}

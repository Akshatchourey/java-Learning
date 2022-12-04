
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,8,1,6,75,25,65,81,2,7,36};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}

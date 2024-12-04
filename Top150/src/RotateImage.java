public class RotateImage{
    static void rotate(int[][] arr){
        int n = arr.length-1, a=0;
        for(int s=n;s>0;s--){
            int temp;
            for(int i=a;i<s;i++){
                temp = arr[a][i];
                arr[a][i] = arr[s-i+a][a];
                arr[s-i+a][a] = arr[s][s-i+a];
                arr[s][s-i+a] = arr[i][s];
                arr[i][s] = temp;
            }
            a++;
        }
        for(int[] k:arr){
            for(int l:k) System.out.print(l + " ");
            System.out.println("");
        }
    }
    public static void main(String[] args){
        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}

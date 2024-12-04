import java.util.Arrays;

public class GameofLife{
    static void gameOfLife(int[][] arr){
        int n = arr[0].length;
        int[] r1 = new int[n]; int[] r2 = Arrays.copyOf(arr[0], n);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<n;j++){
                int one = r1[j];
                if(i+1<arr.length) one += arr[i+1][j];
                if(j-1 >= 0){
                    one += r1[j-1] + r2[j-1];
                    if(i+1 < arr.length) one += arr[i+1][j-1];
                }if(j+1 < n){
                    one += r1[j+1] + r2[j+1];
                    if(i+1 < arr.length) one += arr[i+1][j+1];
                }
                if(arr[i][j]==0 && one==3) arr[i][j] = 1;
                if(arr[i][j]==1 && (one>3 || one<2)) arr[i][j] = 0;
            }
            if(i == arr.length-1) break;
            r1 = Arrays.copyOf(r2, n);
            r2 = Arrays.copyOf(arr[i+1], n);
        }
    }
    public static void main(String[] args){
        gameOfLife(new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}});
    }
}

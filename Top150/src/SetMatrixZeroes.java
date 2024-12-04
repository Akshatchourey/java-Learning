import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMatrixZeroes{
    static void setZeroes(int[][] arr){
        Set<Integer> row = new HashSet<>();
        Set<Integer> column = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 0){
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row.contains(i) || column.contains(j)) arr[i][j]=0;
            }
        }

        for(int[] k:arr){
            for(int l:k) System.out.print(l + " ");
            System.out.println("");
        }
    }
    static void setZeroes2(int[][] arr){
        Set<Integer> column = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int check = 0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 0){
                    check = 1;
                    column.add(j);
                }
            }
            if(check == 1) for(int j=0;j<arr[0].length;j++) arr[i][j]=0;
        }
        Iterator<Integer> itr = column.iterator();
        while(itr.hasNext()){
            int j = itr.next();
            for(int i=0;i<arr.length;i++) arr[i][j]=0;
        }
    }
    static void setZeroes3(int[][] arr){
        int[] column = new int[arr[0].length];
        for(int i=0;i<arr.length;i++){
            int check = 0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 0){
                    check = 1;
                    column[j] = 1;
                }
            }
            if(check == 1) for(int j=0;j<arr[0].length;j++) arr[i][j]=0;
        }
        for(int j=0;j<arr[0].length;j++){
            if(column[j]==1){
                for(int i=0;i<arr.length;i++) arr[i][j]=0;
            }
        }
    }
    public static void main(String[] args){
        setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class matrixMultiplication{
    public static int[][] MMultiplication(int[][] m1, int[][] m2){
        if(m1[0].length != m2.length) throw new IllegalArgumentException("column of matrix 1 and row of matrix 2 is not equal.");
        int[][] ans = new int[m1.length][m2[0].length];
        int temp;
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m2[0].length;j++){
                temp = 0;
                for(int k=0;k<m2.length;k++){
                    temp += m1[i][k] * m2[k][j];
                }
                ans[i][j] = temp;
            }
        }
        return ans;
    }
    public static int[][] create_matrix(int no){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter matrix %d no of rows:",no); int mrow = sc.nextInt();
        System.out.printf("Enter matrix %d no of column:",no); int mcolumn = sc.nextInt();
        int[][] m = new int[mrow][mcolumn];
        sc.nextLine();
        System.out.printf("enter elements of matrix %d :- ", no);
        System.out.println("");
        for(int i=0;i<mrow;i++){
            m[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        return m;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] m1 = create_matrix(1);
        int[][] m2 = create_matrix(2);
        System.out.printf("Matrix %dX%d\n", m1.length, m2[0].length);
        for(int[] k: MMultiplication(m1, m2)){
            for(int n:k) System.out.print(n + " ");
            System.out.println("");
        }
    }
}

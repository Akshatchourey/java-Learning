import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class G_105{
    // Q1 done and submitted

    // Q2 unSolved
    // Q3 TML
    public static Set<Integer> mySet = new HashSet<>();
    static void helper(int x, int y, int n, int m, int[][] grid,int ans){
        if(x == n-1 && y == m-1){
            ans += grid[x][y];
            mySet.add(ans);
            return ;
        }
        if(x == n || y == m){
            return;
        }
        ans += grid[x][y];
        helper(x,y+1,n,m,grid,ans);
        helper(x+1,y,n,m,grid,ans);
    }
    public static void main(String[] args){
        int[][] grid = {{2, -2, -2, -2},
                {-2, 2, 2, -2},
                {2, 2, 2, -2}};
        int[] queries = {4, 5, 8, 0};
        int[] ans = new int[queries.length];
        helper(0, 0, 3, 4, grid, 0);
        for (int i = 0; i < queries.length; i++) {
            if (mySet.contains(queries[i])) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}

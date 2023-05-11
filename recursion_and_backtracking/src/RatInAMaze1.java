import java.util.*;

// m == matrix, v == visited
public class RatInAMaze1{
    static ArrayList<String> arr = new ArrayList<>();
    static boolean check(int[][] m, int[][] v, int x, int y,int n){
        if(x>=n || x<0 || y>=n || y<0){
            return false;
        }
        return m[x][y] == 1 && v[x][y] == 0;
    }
    static void helper(int[][] m, int[][] v, int x, int y,int n, String temp){
        if(x == n-1 && y == n-1){arr.add(temp);return;}
        v[x][y] = 1;
        if(check(m,v,x+1,y,n)){
            helper(m,v,x+1,y,n,temp+"D");
        }
        if(check(m,v,x,y-1,n)){
            helper(m,v,x,y-1,n,temp+"L");
        }
        if(check(m,v,x,y+1,n)){
            helper(m,v,x,y+1,n,temp+"R");
        }
        if(check(m,v,x-1,y,n)){
            helper(m,v,x-1,y,n,temp+"U");
        }
        v[x][y] = 0;
    }
    public static void main(String[] args){
        // ree initialise n === 5 for new q
        int[][] m = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        arr.clear();
        if(m[0][0] == 0){
            System.out.println(arr);
        }
        int[][] v = new int[5][5];
        helper(m,v,0,0,5,"");
        System.out.println(arr);
    }
}

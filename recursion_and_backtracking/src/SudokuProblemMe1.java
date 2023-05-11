import java.util.*;

public class SudokuProblemMe1 {
    static ArrayList<Integer> possibility(int[][] v,int x,int y){
        HashSet<Integer> a1 = new HashSet<>();
        for(int i=0;i<9;i++){
            a1.add(v[x][i]);
        }
        for(int i=0;i<9;i++){
            a1.add(v[i][y]);
        }
        int c=0; int d=0;
        if(x<3){c=0;} else if(x<6){c=3;} else if(x<9){c=6;}
        if(y<3){d=0;} else if(y<6){d=3;} else if(y<9){d=6;}
        for(int i=c;i<c+3;i++){
            for(int j=d;j<d+3;j++){
                a1.add(v[i][j]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int k:new int[]{1,2,3,4,5,6,7,8,9}){
            if(!a1.contains(k)){
                ans.add(k);
            }
        }
        return ans;
    }
    static int fun(int[][] m, int[][] v, int x, int y){
        // Base case
        if(x == 8 && y == 8){
            if(m[8][8] !=0){
                v[x][y] = m[8][8];
            }
            else{
                v[x][y] = possibility(v,8,8).get(0);
            }
            for(int[] k:v){
                for(int u:k){
                    System.out.print(u + " ");
                }
                System.out.println("");
            }return 0;
        }
        // x,y append
        int a = x; int b = y;
        if(y == 8){
            a += 1;
            b = -1;
        }
        b++;
        // R1
        if(m[x][y] != 0){
            v[x][y] = m[x][y];
            int go = fun(m,v,a,b);
            if(go == 0){return 0;}
            return 1;
        }
        // possibilityArray ans R2
        for(int i:possibility(v,x,y)){
            v[x][y] = i;
            int go = fun(m,v,a,b);
            if(go == 0){return 0;}
            v[x][y] = 0;
        }
        return 1;
    }
    //{0,0,0,0,0,0,0,0,0},
    public static void main(String[] args){
        int[][] m = {{0,0,0,5,0,0,3,0,0},
                {2,0,0,0,9,0,0,0,0},
                {3,0,4,0,6,0,1,0,5},
                {0,0,0,8,0,0,2,0,0},
                {0,0,0,9,1,6,0,0,0},
                {0,0,1,0,0,7,0,0,0},
                {7,0,3,0,0,0,8,0,1},
                {0,0,0,0,7,0,0,0,4},
                {0,0,8,6,0,4,0,0,0}};
        System.out.println(fun(m,m,0,0));
    }
}
